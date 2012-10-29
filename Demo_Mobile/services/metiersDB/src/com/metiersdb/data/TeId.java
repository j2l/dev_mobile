
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.TeId
 *  09/18/2012 17:49:53
 * 
 */
public class TeId
    implements Serializable
{

    private String _;
    private String __1;
    private String __2;
    private String __3;
    private String __4;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TeId)) {
            return false;
        }
        TeId other = ((TeId) o);
        if (this._ == null) {
            if (other._!= null) {
                return false;
            }
        } else {
            if (!this._.equals(other._)) {
                return false;
            }
        }
        if (this.__1 == null) {
            if (other.__1 != null) {
                return false;
            }
        } else {
            if (!this.__1 .equals(other.__1)) {
                return false;
            }
        }
        if (this.__2 == null) {
            if (other.__2 != null) {
                return false;
            }
        } else {
            if (!this.__2 .equals(other.__2)) {
                return false;
            }
        }
        if (this.__3 == null) {
            if (other.__3 != null) {
                return false;
            }
        } else {
            if (!this.__3 .equals(other.__3)) {
                return false;
            }
        }
        if (this.__4 == null) {
            if (other.__4 != null) {
                return false;
            }
        } else {
            if (!this.__4 .equals(other.__4)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this._!= null) {
            rtn = (rtn + this._.hashCode());
        }
        rtn = (rtn* 37);
        if (this.__1 != null) {
            rtn = (rtn + this.__1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.__2 != null) {
            rtn = (rtn + this.__2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.__3 != null) {
            rtn = (rtn + this.__3 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.__4 != null) {
            rtn = (rtn + this.__4 .hashCode());
        }
        return rtn;
    }

    public String get_() {
        return _;
    }

    public void set_(String _) {
        this._ = _;
    }

    public String get__1() {
        return __1;
    }

    public void set__1(String __1) {
        this.__1 = __1;
    }

    public String get__2() {
        return __2;
    }

    public void set__2(String __2) {
        this.__2 = __2;
    }

    public String get__3() {
        return __3;
    }

    public void set__3(String __3) {
        this.__3 = __3;
    }

    public String get__4() {
        return __4;
    }

    public void set__4(String __4) {
        this.__4 = __4;
    }

}
