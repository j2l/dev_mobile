
package com.metiersdb.data;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 *  metiersDB.RefProduitsId
 *  09/18/2012 17:49:53
 * 
 */
public class RefProduitsId
    implements Serializable
{

    private BigDecimal ctynaa;
    private String ctycak;
    private String branche;
    private String sousBranche;
    private String sbrlab;
    private String ctyca0;
    private String ctylab;
    private String ctylac;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RefProduitsId)) {
            return false;
        }
        RefProduitsId other = ((RefProduitsId) o);
        if (this.ctynaa == null) {
            if (other.ctynaa!= null) {
                return false;
            }
        } else {
            if (!this.ctynaa.equals(other.ctynaa)) {
                return false;
            }
        }
        if (this.ctycak == null) {
            if (other.ctycak!= null) {
                return false;
            }
        } else {
            if (!this.ctycak.equals(other.ctycak)) {
                return false;
            }
        }
        if (this.branche == null) {
            if (other.branche!= null) {
                return false;
            }
        } else {
            if (!this.branche.equals(other.branche)) {
                return false;
            }
        }
        if (this.sousBranche == null) {
            if (other.sousBranche!= null) {
                return false;
            }
        } else {
            if (!this.sousBranche.equals(other.sousBranche)) {
                return false;
            }
        }
        if (this.sbrlab == null) {
            if (other.sbrlab!= null) {
                return false;
            }
        } else {
            if (!this.sbrlab.equals(other.sbrlab)) {
                return false;
            }
        }
        if (this.ctyca0 == null) {
            if (other.ctyca0 != null) {
                return false;
            }
        } else {
            if (!this.ctyca0 .equals(other.ctyca0)) {
                return false;
            }
        }
        if (this.ctylab == null) {
            if (other.ctylab!= null) {
                return false;
            }
        } else {
            if (!this.ctylab.equals(other.ctylab)) {
                return false;
            }
        }
        if (this.ctylac == null) {
            if (other.ctylac!= null) {
                return false;
            }
        } else {
            if (!this.ctylac.equals(other.ctylac)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.ctynaa!= null) {
            rtn = (rtn + this.ctynaa.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ctycak!= null) {
            rtn = (rtn + this.ctycak.hashCode());
        }
        rtn = (rtn* 37);
        if (this.branche!= null) {
            rtn = (rtn + this.branche.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sousBranche!= null) {
            rtn = (rtn + this.sousBranche.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sbrlab!= null) {
            rtn = (rtn + this.sbrlab.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ctyca0 != null) {
            rtn = (rtn + this.ctyca0 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.ctylab!= null) {
            rtn = (rtn + this.ctylab.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ctylac!= null) {
            rtn = (rtn + this.ctylac.hashCode());
        }
        return rtn;
    }

    public BigDecimal getCtynaa() {
        return ctynaa;
    }

    public void setCtynaa(BigDecimal ctynaa) {
        this.ctynaa = ctynaa;
    }

    public String getCtycak() {
        return ctycak;
    }

    public void setCtycak(String ctycak) {
        this.ctycak = ctycak;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getSousBranche() {
        return sousBranche;
    }

    public void setSousBranche(String sousBranche) {
        this.sousBranche = sousBranche;
    }

    public String getSbrlab() {
        return sbrlab;
    }

    public void setSbrlab(String sbrlab) {
        this.sbrlab = sbrlab;
    }

    public String getCtyca0() {
        return ctyca0;
    }

    public void setCtyca0(String ctyca0) {
        this.ctyca0 = ctyca0;
    }

    public String getCtylab() {
        return ctylab;
    }

    public void setCtylab(String ctylab) {
        this.ctylab = ctylab;
    }

    public String getCtylac() {
        return ctylac;
    }

    public void setCtylac(String ctylac) {
        this.ctylac = ctylac;
    }

}
