
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.CreId
 *  09/18/2012 17:49:53
 * 
 */
public class CreId
    implements Serializable
{

    private String crnum;
    private String crpor;
    private String cruti;
    private String crdat;
    private String crdeb;
    private String crfin;
    private String cract;
    private String craff;
    private String crnat;
    private String crobj;
    private String crlie;
    private String criss;
    private String crqua;
    private String crcom;
    private String crdc1;
    private String crdc2;
    private String crdcr;
    private String crocr;
    private String crdmo;
    private String cromo;
    private String cra01;
    private String cra02;
    private String cra03;
    private String cra04;
    private String cra05;
    private String cra06;
    private String crerp;
    private String crtcf;
    private String crtex;
    private String crpor2;
    private String crsys;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CreId)) {
            return false;
        }
        CreId other = ((CreId) o);
        if (this.crnum == null) {
            if (other.crnum!= null) {
                return false;
            }
        } else {
            if (!this.crnum.equals(other.crnum)) {
                return false;
            }
        }
        if (this.crpor == null) {
            if (other.crpor!= null) {
                return false;
            }
        } else {
            if (!this.crpor.equals(other.crpor)) {
                return false;
            }
        }
        if (this.cruti == null) {
            if (other.cruti!= null) {
                return false;
            }
        } else {
            if (!this.cruti.equals(other.cruti)) {
                return false;
            }
        }
        if (this.crdat == null) {
            if (other.crdat!= null) {
                return false;
            }
        } else {
            if (!this.crdat.equals(other.crdat)) {
                return false;
            }
        }
        if (this.crdeb == null) {
            if (other.crdeb!= null) {
                return false;
            }
        } else {
            if (!this.crdeb.equals(other.crdeb)) {
                return false;
            }
        }
        if (this.crfin == null) {
            if (other.crfin!= null) {
                return false;
            }
        } else {
            if (!this.crfin.equals(other.crfin)) {
                return false;
            }
        }
        if (this.cract == null) {
            if (other.cract!= null) {
                return false;
            }
        } else {
            if (!this.cract.equals(other.cract)) {
                return false;
            }
        }
        if (this.craff == null) {
            if (other.craff!= null) {
                return false;
            }
        } else {
            if (!this.craff.equals(other.craff)) {
                return false;
            }
        }
        if (this.crnat == null) {
            if (other.crnat!= null) {
                return false;
            }
        } else {
            if (!this.crnat.equals(other.crnat)) {
                return false;
            }
        }
        if (this.crobj == null) {
            if (other.crobj!= null) {
                return false;
            }
        } else {
            if (!this.crobj.equals(other.crobj)) {
                return false;
            }
        }
        if (this.crlie == null) {
            if (other.crlie!= null) {
                return false;
            }
        } else {
            if (!this.crlie.equals(other.crlie)) {
                return false;
            }
        }
        if (this.criss == null) {
            if (other.criss!= null) {
                return false;
            }
        } else {
            if (!this.criss.equals(other.criss)) {
                return false;
            }
        }
        if (this.crqua == null) {
            if (other.crqua!= null) {
                return false;
            }
        } else {
            if (!this.crqua.equals(other.crqua)) {
                return false;
            }
        }
        if (this.crcom == null) {
            if (other.crcom!= null) {
                return false;
            }
        } else {
            if (!this.crcom.equals(other.crcom)) {
                return false;
            }
        }
        if (this.crdc1 == null) {
            if (other.crdc1 != null) {
                return false;
            }
        } else {
            if (!this.crdc1 .equals(other.crdc1)) {
                return false;
            }
        }
        if (this.crdc2 == null) {
            if (other.crdc2 != null) {
                return false;
            }
        } else {
            if (!this.crdc2 .equals(other.crdc2)) {
                return false;
            }
        }
        if (this.crdcr == null) {
            if (other.crdcr!= null) {
                return false;
            }
        } else {
            if (!this.crdcr.equals(other.crdcr)) {
                return false;
            }
        }
        if (this.crocr == null) {
            if (other.crocr!= null) {
                return false;
            }
        } else {
            if (!this.crocr.equals(other.crocr)) {
                return false;
            }
        }
        if (this.crdmo == null) {
            if (other.crdmo!= null) {
                return false;
            }
        } else {
            if (!this.crdmo.equals(other.crdmo)) {
                return false;
            }
        }
        if (this.cromo == null) {
            if (other.cromo!= null) {
                return false;
            }
        } else {
            if (!this.cromo.equals(other.cromo)) {
                return false;
            }
        }
        if (this.cra01 == null) {
            if (other.cra01 != null) {
                return false;
            }
        } else {
            if (!this.cra01 .equals(other.cra01)) {
                return false;
            }
        }
        if (this.cra02 == null) {
            if (other.cra02 != null) {
                return false;
            }
        } else {
            if (!this.cra02 .equals(other.cra02)) {
                return false;
            }
        }
        if (this.cra03 == null) {
            if (other.cra03 != null) {
                return false;
            }
        } else {
            if (!this.cra03 .equals(other.cra03)) {
                return false;
            }
        }
        if (this.cra04 == null) {
            if (other.cra04 != null) {
                return false;
            }
        } else {
            if (!this.cra04 .equals(other.cra04)) {
                return false;
            }
        }
        if (this.cra05 == null) {
            if (other.cra05 != null) {
                return false;
            }
        } else {
            if (!this.cra05 .equals(other.cra05)) {
                return false;
            }
        }
        if (this.cra06 == null) {
            if (other.cra06 != null) {
                return false;
            }
        } else {
            if (!this.cra06 .equals(other.cra06)) {
                return false;
            }
        }
        if (this.crerp == null) {
            if (other.crerp!= null) {
                return false;
            }
        } else {
            if (!this.crerp.equals(other.crerp)) {
                return false;
            }
        }
        if (this.crtcf == null) {
            if (other.crtcf!= null) {
                return false;
            }
        } else {
            if (!this.crtcf.equals(other.crtcf)) {
                return false;
            }
        }
        if (this.crtex == null) {
            if (other.crtex!= null) {
                return false;
            }
        } else {
            if (!this.crtex.equals(other.crtex)) {
                return false;
            }
        }
        if (this.crpor2 == null) {
            if (other.crpor2 != null) {
                return false;
            }
        } else {
            if (!this.crpor2 .equals(other.crpor2)) {
                return false;
            }
        }
        if (this.crsys == null) {
            if (other.crsys!= null) {
                return false;
            }
        } else {
            if (!this.crsys.equals(other.crsys)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.crnum!= null) {
            rtn = (rtn + this.crnum.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crpor!= null) {
            rtn = (rtn + this.crpor.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cruti!= null) {
            rtn = (rtn + this.cruti.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crdat!= null) {
            rtn = (rtn + this.crdat.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crdeb!= null) {
            rtn = (rtn + this.crdeb.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crfin!= null) {
            rtn = (rtn + this.crfin.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cract!= null) {
            rtn = (rtn + this.cract.hashCode());
        }
        rtn = (rtn* 37);
        if (this.craff!= null) {
            rtn = (rtn + this.craff.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crnat!= null) {
            rtn = (rtn + this.crnat.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crobj!= null) {
            rtn = (rtn + this.crobj.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crlie!= null) {
            rtn = (rtn + this.crlie.hashCode());
        }
        rtn = (rtn* 37);
        if (this.criss!= null) {
            rtn = (rtn + this.criss.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crqua!= null) {
            rtn = (rtn + this.crqua.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crcom!= null) {
            rtn = (rtn + this.crcom.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crdc1 != null) {
            rtn = (rtn + this.crdc1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.crdc2 != null) {
            rtn = (rtn + this.crdc2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.crdcr!= null) {
            rtn = (rtn + this.crdcr.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crocr!= null) {
            rtn = (rtn + this.crocr.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crdmo!= null) {
            rtn = (rtn + this.crdmo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cromo!= null) {
            rtn = (rtn + this.cromo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cra01 != null) {
            rtn = (rtn + this.cra01 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.cra02 != null) {
            rtn = (rtn + this.cra02 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.cra03 != null) {
            rtn = (rtn + this.cra03 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.cra04 != null) {
            rtn = (rtn + this.cra04 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.cra05 != null) {
            rtn = (rtn + this.cra05 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.cra06 != null) {
            rtn = (rtn + this.cra06 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.crerp!= null) {
            rtn = (rtn + this.crerp.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crtcf!= null) {
            rtn = (rtn + this.crtcf.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crtex!= null) {
            rtn = (rtn + this.crtex.hashCode());
        }
        rtn = (rtn* 37);
        if (this.crpor2 != null) {
            rtn = (rtn + this.crpor2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.crsys!= null) {
            rtn = (rtn + this.crsys.hashCode());
        }
        return rtn;
    }

    public String getCrnum() {
        return crnum;
    }

    public void setCrnum(String crnum) {
        this.crnum = crnum;
    }

    public String getCrpor() {
        return crpor;
    }

    public void setCrpor(String crpor) {
        this.crpor = crpor;
    }

    public String getCruti() {
        return cruti;
    }

    public void setCruti(String cruti) {
        this.cruti = cruti;
    }

    public String getCrdat() {
        return crdat;
    }

    public void setCrdat(String crdat) {
        this.crdat = crdat;
    }

    public String getCrdeb() {
        return crdeb;
    }

    public void setCrdeb(String crdeb) {
        this.crdeb = crdeb;
    }

    public String getCrfin() {
        return crfin;
    }

    public void setCrfin(String crfin) {
        this.crfin = crfin;
    }

    public String getCract() {
        return cract;
    }

    public void setCract(String cract) {
        this.cract = cract;
    }

    public String getCraff() {
        return craff;
    }

    public void setCraff(String craff) {
        this.craff = craff;
    }

    public String getCrnat() {
        return crnat;
    }

    public void setCrnat(String crnat) {
        this.crnat = crnat;
    }

    public String getCrobj() {
        return crobj;
    }

    public void setCrobj(String crobj) {
        this.crobj = crobj;
    }

    public String getCrlie() {
        return crlie;
    }

    public void setCrlie(String crlie) {
        this.crlie = crlie;
    }

    public String getCriss() {
        return criss;
    }

    public void setCriss(String criss) {
        this.criss = criss;
    }

    public String getCrqua() {
        return crqua;
    }

    public void setCrqua(String crqua) {
        this.crqua = crqua;
    }

    public String getCrcom() {
        return crcom;
    }

    public void setCrcom(String crcom) {
        this.crcom = crcom;
    }

    public String getCrdc1() {
        return crdc1;
    }

    public void setCrdc1(String crdc1) {
        this.crdc1 = crdc1;
    }

    public String getCrdc2() {
        return crdc2;
    }

    public void setCrdc2(String crdc2) {
        this.crdc2 = crdc2;
    }

    public String getCrdcr() {
        return crdcr;
    }

    public void setCrdcr(String crdcr) {
        this.crdcr = crdcr;
    }

    public String getCrocr() {
        return crocr;
    }

    public void setCrocr(String crocr) {
        this.crocr = crocr;
    }

    public String getCrdmo() {
        return crdmo;
    }

    public void setCrdmo(String crdmo) {
        this.crdmo = crdmo;
    }

    public String getCromo() {
        return cromo;
    }

    public void setCromo(String cromo) {
        this.cromo = cromo;
    }

    public String getCra01() {
        return cra01;
    }

    public void setCra01(String cra01) {
        this.cra01 = cra01;
    }

    public String getCra02() {
        return cra02;
    }

    public void setCra02(String cra02) {
        this.cra02 = cra02;
    }

    public String getCra03() {
        return cra03;
    }

    public void setCra03(String cra03) {
        this.cra03 = cra03;
    }

    public String getCra04() {
        return cra04;
    }

    public void setCra04(String cra04) {
        this.cra04 = cra04;
    }

    public String getCra05() {
        return cra05;
    }

    public void setCra05(String cra05) {
        this.cra05 = cra05;
    }

    public String getCra06() {
        return cra06;
    }

    public void setCra06(String cra06) {
        this.cra06 = cra06;
    }

    public String getCrerp() {
        return crerp;
    }

    public void setCrerp(String crerp) {
        this.crerp = crerp;
    }

    public String getCrtcf() {
        return crtcf;
    }

    public void setCrtcf(String crtcf) {
        this.crtcf = crtcf;
    }

    public String getCrtex() {
        return crtex;
    }

    public void setCrtex(String crtex) {
        this.crtex = crtex;
    }

    public String getCrpor2() {
        return crpor2;
    }

    public void setCrpor2(String crpor2) {
        this.crpor2 = crpor2;
    }

    public String getCrsys() {
        return crsys;
    }

    public void setCrsys(String crsys) {
        this.crsys = crsys;
    }

}
