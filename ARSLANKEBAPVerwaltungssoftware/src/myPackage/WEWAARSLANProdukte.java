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
@Table(name = "WEWA-ARSLAN-Produkte", catalog = "phpmyadmin", schema = "")
@NamedQueries({
    @NamedQuery(name = "WEWAARSLANProdukte.findAll", query = "SELECT w FROM WEWAARSLANProdukte w"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByGeraeteID", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.geraeteID = :geraeteID"),
    @NamedQuery(name = "WEWAARSLANProdukte.findBySorte", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.sorte = :sorte"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByEan", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.ean = :ean"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByGewicht", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.gewicht = :gewicht"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByWEZeitstempel", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.wEZeitstempel = :wEZeitstempel"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByWAZeitstempel", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.wAZeitstempel = :wAZeitstempel"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByChargennummer", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.chargennummer = :chargennummer"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByMenge", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.menge = :menge"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByMhd", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.mhd = :mhd"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByFortlaufendeNr", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.fortlaufendeNr = :fortlaufendeNr"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByAufspiesser", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.aufspiesser = :aufspiesser"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByFolierer", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.folierer = :folierer"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByProduktionsleiter", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.produktionsleiter = :produktionsleiter"),
    @NamedQuery(name = "WEWAARSLANProdukte.findByRetour", query = "SELECT w FROM WEWAARSLANProdukte w WHERE w.retour = :retour")})
public class WEWAARSLANProdukte implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "GeraeteID")
    private int geraeteID;
    @Basic(optional = false)
    @Column(name = "Sorte")
    private int sorte;
    @Id
    @Basic(optional = false)
    @Column(name = "EAN")
    private String ean;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Gewicht")
    private Float gewicht;
    @Basic(optional = false)
    @Column(name = "WE-Zeitstempel")
    @Temporal(TemporalType.TIMESTAMP)
    private Date wEZeitstempel;
    @Column(name = "WA-Zeitstempel")
    @Temporal(TemporalType.TIMESTAMP)
    private Date wAZeitstempel;
    @Column(name = "Chargennummer")
    private Integer chargennummer;
    @Column(name = "Menge")
    private Integer menge;
    @Column(name = "MHD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mhd;
    @Column(name = "FortlaufendeNr")
    private String fortlaufendeNr;
    @Column(name = "Aufspiesser")
    private Integer aufspiesser;
    @Column(name = "Folierer")
    private Integer folierer;
    @Column(name = "Produktionsleiter")
    private Integer produktionsleiter;
    @Basic(optional = false)
    @Column(name = "Retour")
    private boolean retour;

    public WEWAARSLANProdukte() {
    }

    public WEWAARSLANProdukte(String ean) {
        this.ean = ean;
    }

    public WEWAARSLANProdukte(String ean, int geraeteID, int sorte, Date wEZeitstempel, boolean retour) {
        this.ean = ean;
        this.geraeteID = geraeteID;
        this.sorte = sorte;
        this.wEZeitstempel = wEZeitstempel;
        this.retour = retour;
    }

    public int getGeraeteID() {
        return geraeteID;
    }

    public void setGeraeteID(int geraeteID) {
        int oldGeraeteID = this.geraeteID;
        this.geraeteID = geraeteID;
        changeSupport.firePropertyChange("geraeteID", oldGeraeteID, geraeteID);
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        int oldSorte = this.sorte;
        this.sorte = sorte;
        changeSupport.firePropertyChange("sorte", oldSorte, sorte);
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        String oldEan = this.ean;
        this.ean = ean;
        changeSupport.firePropertyChange("ean", oldEan, ean);
    }

    public Float getGewicht() {
        return gewicht;
    }

    public void setGewicht(Float gewicht) {
        Float oldGewicht = this.gewicht;
        this.gewicht = gewicht;
        changeSupport.firePropertyChange("gewicht", oldGewicht, gewicht);
    }

    public Date getWEZeitstempel() {
        return wEZeitstempel;
    }

    public void setWEZeitstempel(Date wEZeitstempel) {
        Date oldWEZeitstempel = this.wEZeitstempel;
        this.wEZeitstempel = wEZeitstempel;
        changeSupport.firePropertyChange("WEZeitstempel", oldWEZeitstempel, wEZeitstempel);
    }

    public Date getWAZeitstempel() {
        return wAZeitstempel;
    }

    public void setWAZeitstempel(Date wAZeitstempel) {
        Date oldWAZeitstempel = this.wAZeitstempel;
        this.wAZeitstempel = wAZeitstempel;
        changeSupport.firePropertyChange("WAZeitstempel", oldWAZeitstempel, wAZeitstempel);
    }

    public Integer getChargennummer() {
        return chargennummer;
    }

    public void setChargennummer(Integer chargennummer) {
        Integer oldChargennummer = this.chargennummer;
        this.chargennummer = chargennummer;
        changeSupport.firePropertyChange("chargennummer", oldChargennummer, chargennummer);
    }

    public Integer getMenge() {
        return menge;
    }

    public void setMenge(Integer menge) {
        Integer oldMenge = this.menge;
        this.menge = menge;
        changeSupport.firePropertyChange("menge", oldMenge, menge);
    }

    public Date getMhd() {
        return mhd;
    }

    public void setMhd(Date mhd) {
        Date oldMhd = this.mhd;
        this.mhd = mhd;
        changeSupport.firePropertyChange("mhd", oldMhd, mhd);
    }

    public String getFortlaufendeNr() {
        return fortlaufendeNr;
    }

    public void setFortlaufendeNr(String fortlaufendeNr) {
        String oldFortlaufendeNr = this.fortlaufendeNr;
        this.fortlaufendeNr = fortlaufendeNr;
        changeSupport.firePropertyChange("fortlaufendeNr", oldFortlaufendeNr, fortlaufendeNr);
    }

    public Integer getAufspiesser() {
        return aufspiesser;
    }

    public void setAufspiesser(Integer aufspiesser) {
        Integer oldAufspiesser = this.aufspiesser;
        this.aufspiesser = aufspiesser;
        changeSupport.firePropertyChange("aufspiesser", oldAufspiesser, aufspiesser);
    }

    public Integer getFolierer() {
        return folierer;
    }

    public void setFolierer(Integer folierer) {
        Integer oldFolierer = this.folierer;
        this.folierer = folierer;
        changeSupport.firePropertyChange("folierer", oldFolierer, folierer);
    }

    public Integer getProduktionsleiter() {
        return produktionsleiter;
    }

    public void setProduktionsleiter(Integer produktionsleiter) {
        Integer oldProduktionsleiter = this.produktionsleiter;
        this.produktionsleiter = produktionsleiter;
        changeSupport.firePropertyChange("produktionsleiter", oldProduktionsleiter, produktionsleiter);
    }

    public boolean getRetour() {
        return retour;
    }

    public void setRetour(boolean retour) {
        boolean oldRetour = this.retour;
        this.retour = retour;
        changeSupport.firePropertyChange("retour", oldRetour, retour);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ean != null ? ean.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WEWAARSLANProdukte)) {
            return false;
        }
        WEWAARSLANProdukte other = (WEWAARSLANProdukte) object;
        if ((this.ean == null && other.ean != null) || (this.ean != null && !this.ean.equals(other.ean))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myPackage.WEWAARSLANProdukte[ ean=" + ean + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
