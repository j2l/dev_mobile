
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.RefTransacId
 *  09/18/2012 17:49:53
 * 
 */
public class RefTransacId
    implements Serializable
{

    private String systeme;
    private Integer ordre;
    private String codeTransac;
    private String transaction;
    private String domaine;
    private String scriptShell;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RefTransacId)) {
            return false;
        }
        RefTransacId other = ((RefTransacId) o);
        if (this.systeme == null) {
            if (other.systeme!= null) {
                return false;
            }
        } else {
            if (!this.systeme.equals(other.systeme)) {
                return false;
            }
        }
        if (this.ordre == null) {
            if (other.ordre!= null) {
                return false;
            }
        } else {
            if (!this.ordre.equals(other.ordre)) {
                return false;
            }
        }
        if (this.codeTransac == null) {
            if (other.codeTransac!= null) {
                return false;
            }
        } else {
            if (!this.codeTransac.equals(other.codeTransac)) {
                return false;
            }
        }
        if (this.transaction == null) {
            if (other.transaction!= null) {
                return false;
            }
        } else {
            if (!this.transaction.equals(other.transaction)) {
                return false;
            }
        }
        if (this.domaine == null) {
            if (other.domaine!= null) {
                return false;
            }
        } else {
            if (!this.domaine.equals(other.domaine)) {
                return false;
            }
        }
        if (this.scriptShell == null) {
            if (other.scriptShell!= null) {
                return false;
            }
        } else {
            if (!this.scriptShell.equals(other.scriptShell)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.systeme!= null) {
            rtn = (rtn + this.systeme.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ordre!= null) {
            rtn = (rtn + this.ordre.hashCode());
        }
        rtn = (rtn* 37);
        if (this.codeTransac!= null) {
            rtn = (rtn + this.codeTransac.hashCode());
        }
        rtn = (rtn* 37);
        if (this.transaction!= null) {
            rtn = (rtn + this.transaction.hashCode());
        }
        rtn = (rtn* 37);
        if (this.domaine!= null) {
            rtn = (rtn + this.domaine.hashCode());
        }
        rtn = (rtn* 37);
        if (this.scriptShell!= null) {
            rtn = (rtn + this.scriptShell.hashCode());
        }
        return rtn;
    }

    public String getSysteme() {
        return systeme;
    }

    public void setSysteme(String systeme) {
        this.systeme = systeme;
    }

    public Integer getOrdre() {
        return ordre;
    }

    public void setOrdre(Integer ordre) {
        this.ordre = ordre;
    }

    public String getCodeTransac() {
        return codeTransac;
    }

    public void setCodeTransac(String codeTransac) {
        this.codeTransac = codeTransac;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getScriptShell() {
        return scriptShell;
    }

    public void setScriptShell(String scriptShell) {
        this.scriptShell = scriptShell;
    }

}
