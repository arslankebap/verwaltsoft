/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author SEAMAC
 */
@Embeddable
public class KundenPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Kundennummer")
    private int kundennummer;
    @Basic(optional = false)
    @Column(name = "Kundenname")
    private String kundenname;

    public KundenPK() {
    }

    public KundenPK(int kundennummer, String kundenname) {
        this.kundennummer = kundennummer;
        this.kundenname = kundenname;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }

    public String getKundenname() {
        return kundenname;
    }

    public void setKundenname(String kundenname) {
        this.kundenname = kundenname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) kundennummer;
        hash += (kundenname != null ? kundenname.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KundenPK)) {
            return false;
        }
        KundenPK other = (KundenPK) object;
        if (this.kundennummer != other.kundennummer) {
            return false;
        }
        if ((this.kundenname == null && other.kundenname != null) || (this.kundenname != null && !this.kundenname.equals(other.kundenname))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "myPackage.KundenPK[ kundennummer=" + kundennummer + ", kundenname=" + kundenname + " ]";
    }
    
}
