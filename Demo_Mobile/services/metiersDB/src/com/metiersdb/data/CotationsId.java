
package com.metiersdb.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  metiersDB.CotationsId
 *  09/18/2012 17:49:53
 * 
 */
public class CotationsId
    implements Serializable
{

    private String codeValeur;
    private Date date;
    private Double ouverture;
    private Double cloture;
    private Double haut;
    private Double bas;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CotationsId)) {
            return false;
        }
        CotationsId other = ((CotationsId) o);
        if (this.codeValeur == null) {
            if (other.codeValeur!= null) {
                return false;
            }
        } else {
            if (!this.codeValeur.equals(other.codeValeur)) {
                return false;
            }
        }
        if (this.date == null) {
            if (other.date!= null) {
                return false;
            }
        } else {
            if (!this.date.equals(other.date)) {
                return false;
            }
        }
        if (this.ouverture == null) {
            if (other.ouverture!= null) {
                return false;
            }
        } else {
            if (!this.ouverture.equals(other.ouverture)) {
                return false;
            }
        }
        if (this.cloture == null) {
            if (other.cloture!= null) {
                return false;
            }
        } else {
            if (!this.cloture.equals(other.cloture)) {
                return false;
            }
        }
        if (this.haut == null) {
            if (other.haut!= null) {
                return false;
            }
        } else {
            if (!this.haut.equals(other.haut)) {
                return false;
            }
        }
        if (this.bas == null) {
            if (other.bas!= null) {
                return false;
            }
        } else {
            if (!this.bas.equals(other.bas)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.codeValeur!= null) {
            rtn = (rtn + this.codeValeur.hashCode());
        }
        rtn = (rtn* 37);
        if (this.date!= null) {
            rtn = (rtn + this.date.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ouverture!= null) {
            rtn = (rtn + this.ouverture.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cloture!= null) {
            rtn = (rtn + this.cloture.hashCode());
        }
        rtn = (rtn* 37);
        if (this.haut!= null) {
            rtn = (rtn + this.haut.hashCode());
        }
        rtn = (rtn* 37);
        if (this.bas!= null) {
            rtn = (rtn + this.bas.hashCode());
        }
        return rtn;
    }

    public String getCodeValeur() {
        return codeValeur;
    }

    public void setCodeValeur(String codeValeur) {
        this.codeValeur = codeValeur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getOuverture() {
        return ouverture;
    }

    public void setOuverture(Double ouverture) {
        this.ouverture = ouverture;
    }

    public Double getCloture() {
        return cloture;
    }

    public void setCloture(Double cloture) {
        this.cloture = cloture;
    }

    public Double getHaut() {
        return haut;
    }

    public void setHaut(Double haut) {
        this.haut = haut;
    }

    public Double getBas() {
        return bas;
    }

    public void setBas(Double bas) {
        this.bas = bas;
    }

}
