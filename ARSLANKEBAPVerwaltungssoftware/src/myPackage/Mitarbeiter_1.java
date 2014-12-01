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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "Mitarbeiter", catalog = "phpmyadmin", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mitarbeiter_1.findAll", query = "SELECT m FROM Mitarbeiter_1 m"),
    @NamedQuery(name = "Mitarbeiter_1.findByIdMitarbeiter", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.idMitarbeiter = :idMitarbeiter"),
    @NamedQuery(name = "Mitarbeiter_1.findByNachname", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.nachname = :nachname"),
    @NamedQuery(name = "Mitarbeiter_1.findByVornamen", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.vornamen = :vornamen"),
    @NamedQuery(name = "Mitarbeiter_1.findByStrasse", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.strasse = :strasse"),
    @NamedQuery(name = "Mitarbeiter_1.findByHausnummer", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.hausnummer = :hausnummer"),
    @NamedQuery(name = "Mitarbeiter_1.findByAdresszusatz", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.adresszusatz = :adresszusatz"),
    @NamedQuery(name = "Mitarbeiter_1.findByPlz", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.plz = :plz"),
    @NamedQuery(name = "Mitarbeiter_1.findByWohnort", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.wohnort = :wohnort"),
    @NamedQuery(name = "Mitarbeiter_1.findByTelefonnummer", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.telefonnummer = :telefonnummer"),
    @NamedQuery(name = "Mitarbeiter_1.findByMobiltelefon", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.mobiltelefon = :mobiltelefon"),
    @NamedQuery(name = "Mitarbeiter_1.findByEmail", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.email = :email"),
    @NamedQuery(name = "Mitarbeiter_1.findByGeburtstag", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.geburtstag = :geburtstag"),
    @NamedQuery(name = "Mitarbeiter_1.findByGeburtsort", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.geburtsort = :geburtsort"),
    @NamedQuery(name = "Mitarbeiter_1.findByNationalitaet", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.nationalitaet = :nationalitaet"),
    @NamedQuery(name = "Mitarbeiter_1.findByIban", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.iban = :iban"),
    @NamedQuery(name = "Mitarbeiter_1.findByEintritt", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.eintritt = :eintritt"),
    @NamedQuery(name = "Mitarbeiter_1.findByAustritt", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.austritt = :austritt"),
    @NamedQuery(name = "Mitarbeiter_1.findByKrankenversicherung", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.krankenversicherung = :krankenversicherung"),
    @NamedQuery(name = "Mitarbeiter_1.findByKrankenversicherungsnummer", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.krankenversicherungsnummer = :krankenversicherungsnummer"),
    @NamedQuery(name = "Mitarbeiter_1.findByRentenversicherungsnummer", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.rentenversicherungsnummer = :rentenversicherungsnummer"),
    @NamedQuery(name = "Mitarbeiter_1.findByDateiordner", query = "SELECT m FROM Mitarbeiter_1 m WHERE m.dateiordner = :dateiordner")})
public class Mitarbeiter_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMitarbeiter")
    private Integer idMitarbeiter;
    @Basic(optional = false)
    @Column(name = "Nachname")
    private String nachname;
    @Basic(optional = false)
    @Column(name = "Vornamen")
    private String vornamen;
    @Column(name = "Strasse")
    private String strasse;
    @Column(name = "Hausnummer")
    private String hausnummer;
    @Column(name = "Adresszusatz")
    private String adresszusatz;
    @Column(name = "PLZ")
    private String plz;
    @Column(name = "Wohnort")
    private String wohnort;
    @Column(name = "Telefonnummer")
    private String telefonnummer;
    @Column(name = "Mobiltelefon")
    private String mobiltelefon;
    @Column(name = "Email")
    private String email;
    @Column(name = "Geburtstag")
    @Temporal(TemporalType.DATE)
    private Date geburtstag;
    @Column(name = "Geburtsort")
    private String geburtsort;
    @Column(name = "Nationalitaet")
    private String nationalitaet;
    @Column(name = "IBAN")
    private String iban;
    @Column(name = "Eintritt")
    @Temporal(TemporalType.DATE)
    private Date eintritt;
    @Column(name = "Austritt")
    @Temporal(TemporalType.DATE)
    private Date austritt;
    @Column(name = "Krankenversicherung")
    private String krankenversicherung;
    @Column(name = "Krankenversicherungsnummer")
    private String krankenversicherungsnummer;
    @Column(name = "Rentenversicherungsnummer")
    private String rentenversicherungsnummer;
    @Column(name = "Dateiordner")
    private String dateiordner;

    public Mitarbeiter_1() {
    }

    public Mitarbeiter_1(Integer idMitarbeiter) {
        this.idMitarbeiter = idMitarbeiter;
    }

    public Mitarbeiter_1(Integer idMitarbeiter, String nachname, String vornamen) {
        this.idMitarbeiter = idMitarbeiter;
        this.nachname = nachname;
        this.vornamen = vornamen;
    }

    public Integer getIdMitarbeiter() {
        return idMitarbeiter;
    }

    public void setIdMitarbeiter(Integer idMitarbeiter) {
        Integer oldIdMitarbeiter = this.idMitarbeiter;
        this.idMitarbeiter = idMitarbeiter;
        changeSupport.firePropertyChange("idMitarbeiter", oldIdMitarbeiter, idMitarbeiter);
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        String oldNachname = this.nachname;
        this.nachname = nachname;
        changeSupport.firePropertyChange("nachname", oldNachname, nachname);
    }

    public String getVornamen() {
        return vornamen;
    }

    public void setVornamen(String vornamen) {
        String oldVornamen = this.vornamen;
        this.vornamen = vornamen;
        changeSupport.firePropertyChange("vornamen", oldVornamen, vornamen);
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

    public String getWohnort() {
        return wohnort;
    }

    public void setWohnort(String wohnort) {
        String oldWohnort = this.wohnort;
        this.wohnort = wohnort;
        changeSupport.firePropertyChange("wohnort", oldWohnort, wohnort);
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        String oldTelefonnummer = this.telefonnummer;
        this.telefonnummer = telefonnummer;
        changeSupport.firePropertyChange("telefonnummer", oldTelefonnummer, telefonnummer);
    }

    public String getMobiltelefon() {
        return mobiltelefon;
    }

    public void setMobiltelefon(String mobiltelefon) {
        String oldMobiltelefon = this.mobiltelefon;
        this.mobiltelefon = mobiltelefon;
        changeSupport.firePropertyChange("mobiltelefon", oldMobiltelefon, mobiltelefon);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        Date oldGeburtstag = this.geburtstag;
        this.geburtstag = geburtstag;
        changeSupport.firePropertyChange("geburtstag", oldGeburtstag, geburtstag);
    }

    public String getGeburtsort() {
        return geburtsort;
    }

    public void setGeburtsort(String geburtsort) {
        String oldGeburtsort = this.geburtsort;
        this.geburtsort = geburtsort;
        changeSupport.firePropertyChange("geburtsort", oldGeburtsort, geburtsort);
    }

    public String getNationalitaet() {
        return nationalitaet;
    }

    public void setNationalitaet(String nationalitaet) {
        String oldNationalitaet = this.nationalitaet;
        this.nationalitaet = nationalitaet;
        changeSupport.firePropertyChange("nationalitaet", oldNationalitaet, nationalitaet);
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        String oldIban = this.iban;
        this.iban = iban;
        changeSupport.firePropertyChange("iban", oldIban, iban);
    }

    public Date getEintritt() {
        return eintritt;
    }

    public void setEintritt(Date eintritt) {
        Date oldEintritt = this.eintritt;
        this.eintritt = eintritt;
        changeSupport.firePropertyChange("eintritt", oldEintritt, eintritt);
    }

    public Date getAustritt() {
        return austritt;
    }

    public void setAustritt(Date austritt) {
        Date oldAustritt = this.austritt;
        this.austritt = austritt;
        changeSupport.firePropertyChange("austritt", oldAustritt, austritt);
    }

    public String getKrankenversicherung() {
        return krankenversicherung;
    }

    public void setKrankenversicherung(String krankenversicherung) {
        String oldKrankenversicherung = this.krankenversicherung;
        this.krankenversicherung = krankenversicherung;
        changeSupport.firePropertyChange("krankenversicherung", oldKrankenversicherung, krankenversicherung);
    }

    public String getKrankenversicherungsnummer() {
        return krankenversicherungsnummer;
    }

    public void setKrankenversicherungsnummer(String krankenversicherungsnummer) {
        String oldKrankenversicherungsnummer = this.krankenversicherungsnummer;
        this.krankenversicherungsnummer = krankenversicherungsnummer;
        changeSupport.firePropertyChange("krankenversicherungsnummer", oldKrankenversicherungsnummer, krankenversicherungsnummer);
    }

    public String getRentenversicherungsnummer() {
        return rentenversicherungsnummer;
    }

    public void setRentenversicherungsnummer(String rentenversicherungsnummer) {
        String oldRentenversicherungsnummer = this.rentenversicherungsnummer;
        this.rentenversicherungsnummer = rentenversicherungsnummer;
        changeSupport.firePropertyChange("rentenversicherungsnummer", oldRentenversicherungsnummer, rentenversicherungsnummer);
    }

    public String getDateiordner() {
        return dateiordner;
    }

    public void setDateiordner(String dateiordner) {
        String oldDateiordner = this.dateiordner;
        this.dateiordner = dateiordner;
        changeSupport.firePropertyChange("dateiordner", oldDateiordner, dateiordner);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMitarbeiter != null ? idMitarbeiter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mitarbeiter_1)) {
            return false;
        }
        Mitarbeiter_1 other = (Mitarbeiter_1) object;
        if ((this.idMitarbeiter == null && other.idMitarbeiter != null) || (this.idMitarbeiter != null && !this.idMitarbeiter.equals(other.idMitarbeiter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myPackage.Mitarbeiter_1[ idMitarbeiter=" + idMitarbeiter + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
