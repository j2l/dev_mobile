
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.OpencritereId
 *  09/18/2012 17:49:53
 * 
 */
public class OpencritereId
    implements Serializable
{

    private Integer refOpenSource;
    private String critereCode;
    private String critereNom;
    private String critereCategorie;
    private String critereDescription;
    private Integer critereNote;
    private Boolean critereModele;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpencritereId)) {
            return false;
        }
        OpencritereId other = ((OpencritereId) o);
        if (this.refOpenSource == null) {
            if (other.refOpenSource!= null) {
                return false;
            }
        } else {
            if (!this.refOpenSource.equals(other.refOpenSource)) {
                return false;
            }
        }
        if (this.critereCode == null) {
            if (other.critereCode!= null) {
                return false;
            }
        } else {
            if (!this.critereCode.equals(other.critereCode)) {
                return false;
            }
        }
        if (this.critereNom == null) {
            if (other.critereNom!= null) {
                return false;
            }
        } else {
            if (!this.critereNom.equals(other.critereNom)) {
                return false;
            }
        }
        if (this.critereCategorie == null) {
            if (other.critereCategorie!= null) {
                return false;
            }
        } else {
            if (!this.critereCategorie.equals(other.critereCategorie)) {
                return false;
            }
        }
        if (this.critereDescription == null) {
            if (other.critereDescription!= null) {
                return false;
            }
        } else {
            if (!this.critereDescription.equals(other.critereDescription)) {
                return false;
            }
        }
        if (this.critereNote == null) {
            if (other.critereNote!= null) {
                return false;
            }
        } else {
            if (!this.critereNote.equals(other.critereNote)) {
                return false;
            }
        }
        if (this.critereModele == null) {
            if (other.critereModele!= null) {
                return false;
            }
        } else {
            if (!this.critereModele.equals(other.critereModele)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.refOpenSource!= null) {
            rtn = (rtn + this.refOpenSource.hashCode());
        }
        rtn = (rtn* 37);
        if (this.critereCode!= null) {
            rtn = (rtn + this.critereCode.hashCode());
        }
        rtn = (rtn* 37);
        if (this.critereNom!= null) {
            rtn = (rtn + this.critereNom.hashCode());
        }
        rtn = (rtn* 37);
        if (this.critereCategorie!= null) {
            rtn = (rtn + this.critereCategorie.hashCode());
        }
        rtn = (rtn* 37);
        if (this.critereDescription!= null) {
            rtn = (rtn + this.critereDescription.hashCode());
        }
        rtn = (rtn* 37);
        if (this.critereNote!= null) {
            rtn = (rtn + this.critereNote.hashCode());
        }
        rtn = (rtn* 37);
        if (this.critereModele!= null) {
            rtn = (rtn + this.critereModele.hashCode());
        }
        return rtn;
    }

    public Integer getRefOpenSource() {
        return refOpenSource;
    }

    public void setRefOpenSource(Integer refOpenSource) {
        this.refOpenSource = refOpenSource;
    }

    public String getCritereCode() {
        return critereCode;
    }

    public void setCritereCode(String critereCode) {
        this.critereCode = critereCode;
    }

    public String getCritereNom() {
        return critereNom;
    }

    public void setCritereNom(String critereNom) {
        this.critereNom = critereNom;
    }

    public String getCritereCategorie() {
        return critereCategorie;
    }

    public void setCritereCategorie(String critereCategorie) {
        this.critereCategorie = critereCategorie;
    }

    public String getCritereDescription() {
        return critereDescription;
    }

    public void setCritereDescription(String critereDescription) {
        this.critereDescription = critereDescription;
    }

    public Integer getCritereNote() {
        return critereNote;
    }

    public void setCritereNote(Integer critereNote) {
        this.critereNote = critereNote;
    }

    public Boolean getCritereModele() {
        return critereModele;
    }

    public void setCritereModele(Boolean critereModele) {
        this.critereModele = critereModele;
    }

}
