/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author SEAMAC
 */
@Entity
@Table(name = "Kunden", catalog = "phpmyadmin", schema = "")
@NamedQueries({
    @NamedQuery(name = "Kunden.findAll", query = "SELECT k FROM Kunden k"),
    @NamedQuery(name = "Kunden.findByKundennummer", query = "SELECT k FROM Kunden k WHERE k.kundenPK.kundennummer = :kundennummer"),
    @NamedQuery(name = "Kunden.findByKundenname", query = "SELECT k FROM Kunden k WHERE k.kundenPK.kundenname = :kundenname"),
    @NamedQuery(name = "Kunden.findByZahlbarinnerhalb", query = "SELECT k FROM Kunden k WHERE k.zahlbarinnerhalb = :zahlbarinnerhalb"),
    @NamedQuery(name = "Kunden.findByStrasse", query = "SELECT k FROM Kunden k WHERE k.strasse = :strasse"),
    @NamedQuery(name = "Kunden.findByHausnummer", query = "SELECT k FROM Kunden k WHERE k.hausnummer = :hausnummer"),
    @NamedQuery(name = "Kunden.findByAdresszusatz", query = "SELECT k FROM Kunden k WHERE k.adresszusatz = :adresszusatz"),
    @NamedQuery(name = "Kunden.findByPlz", query = "SELECT k FROM Kunden k WHERE k.plz = :plz"),
    @NamedQuery(name = "Kunden.findByStadt", query = "SELECT k FROM Kunden k WHERE k.stadt = :stadt"),
    @NamedQuery(name = "Kunden.findByEintragungszeitstempel", query = "SELECT k FROM Kunden k WHERE k.eintragungszeitstempel = :eintragungszeitstempel")})
public class Kunden implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KundenPK kundenPK;
    @Basic(optional = false)
    @Column(name = "Zahlbar innerhalb")
    private int zahlbarinnerhalb;
    @Column(name = "Strasse")
    private String strasse;
    @Column(name = "Hausnummer")
    private String hausnummer;
    @Column(name = "Adresszusatz")
    private String adresszusatz;
    @Column(name = "PLZ")
    private String plz;
    @Column(name = "Stadt")
    private String stadt;
    @Column(name = "Eintragungszeitstempel")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eintragungszeitstempel;

    public Kunden() {
    }

    public Kunden(KundenPK kundenPK) {
        this.kundenPK = kundenPK;
    }

    public Kunden(KundenPK kundenPK, int zahlbarinnerhalb) {
        this.kundenPK = kundenPK;
        this.zahlbarinnerhalb = zahlbarinnerhalb;
    }

    public Kunden(int kundennummer, String kundenname) {
        this.kundenPK = new KundenPK(kundennummer, kundenname);
    }

    public KundenPK getKundenPK() {
        return kundenPK;
    }

    public void setKundenPK(KundenPK kundenPK) {
        this.kundenPK = kundenPK;
    }

    public int getZahlbarinnerhalb() {
        return zahlbarinnerhalb;
    }

    public void setZahlbarinnerhalb(int zahlbarinnerhalb) {
        int oldZahlbarinnerhalb = this.zahlbarinnerhalb;
        this.zahlbarinnerhalb = zahlbarinnerhalb;
        changeSupport.firePropertyChange("zahlbarinnerhalb", oldZahlbarinnerhalb, zahlbarinnerhalb);
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        String oldStrasse = this.strasse;
        this.strasse = strasse;
        changeSupport.firePropertyChange("strasse", oldStrasse, strasse);
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        String oldHausnummer = this.hausnummer;
        this.hausnummer = hausnummer;
        changeSupport.firePropertyChange("hausnummer", oldHausnummer, hausnummer);
    }

    public String getAdresszusatz() {
        return adresszusatz;
    }

    public void setAdresszusatz(String adresszusatz) {
        String oldAdresszusatz = this.adresszusatz;
        this.adresszusatz = adresszusatz;
        changeSupport.firePropertyChange("adresszusatz", oldAdresszusatz, adresszusatz);
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        String oldPlz = this.plz;
        this.plz = plz;
        changeSupport.firePropertyChange("plz", oldPlz, plz);
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        String oldStadt = this.stadt;
        this.stadt = stadt;
        changeSupport.firePropertyChange("stadt", oldStadt, stadt);
    }

    public Date getEintragungszeitstempel() {
        return eintragungszeitstempel;
    }

    public void setEintragungszeitstempel(Date eintragungszeitstempel) {
        Date oldEintragungszeitstempel = this.eintragungszeitstempel;
        this.eintragungszeitstempel = eintragungszeitstempel;
        changeSupport.firePropertyChange("eintragungszeitstempel", oldEintragungszeitstempel, eintragungszeitstempel);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kundenPK != null ? kundenPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kunden)) {
            return false;
        }
        Kunden other = (Kunden) object;
        if ((this.kundenPK == null && other.kundenPK != null) || (this.kundenPK != null && !this.kundenPK.equals(other.kundenPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myPackage.Kunden[ kundenPK=" + kundenPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
