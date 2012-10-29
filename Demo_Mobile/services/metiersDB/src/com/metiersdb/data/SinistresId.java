
package com.metiersdb.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  metiersDB.SinistresId
 *  09/18/2012 17:49:53
 * 
 */
public class SinistresId
    implements Serializable
{

    private String cdSource;
    private String natDos;
    private String natFic;
    private String sousSystSrc;
    private String noSinistre;
    private String natIdent;
    private String noClientExt;
    private String natIdentC;
    private String noPoliceExt;
    private String natIdentP;
    private String cdSociete;
    private String cdProduit;
    private String natIdentProd;
    private Date dateSurv;
    private Date dateDeclaration;
    private Date dateDroc;
    private Date dateClos;
    private Date dateArch;
    private Date dateEpur;
    private String etat;
    private Double mtRegle;
    private Double mtEvaRest;
    private String libNatSin;
    private String sepExp;
    private String cdFamSin;
    private String ugSin;
    private String cdRedact;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SinistresId)) {
            return false;
        }
        SinistresId other = ((SinistresId) o);
        if (this.cdSource == null) {
            if (other.cdSource!= null) {
                return false;
            }
        } else {
            if (!this.cdSource.equals(other.cdSource)) {
                return false;
            }
        }
        if (this.natDos == null) {
            if (other.natDos!= null) {
                return false;
            }
        } else {
            if (!this.natDos.equals(other.natDos)) {
                return false;
            }
        }
        if (this.natFic == null) {
            if (other.natFic!= null) {
                return false;
            }
        } else {
            if (!this.natFic.equals(other.natFic)) {
                return false;
            }
        }
        if (this.sousSystSrc == null) {
            if (other.sousSystSrc!= null) {
                return false;
            }
        } else {
            if (!this.sousSystSrc.equals(other.sousSystSrc)) {
                return false;
            }
        }
        if (this.noSinistre == null) {
            if (other.noSinistre!= null) {
                return false;
            }
        } else {
            if (!this.noSinistre.equals(other.noSinistre)) {
                return false;
            }
        }
        if (this.natIdent == null) {
            if (other.natIdent!= null) {
                return false;
            }
        } else {
            if (!this.natIdent.equals(other.natIdent)) {
                return false;
            }
        }
        if (this.noClientExt == null) {
            if (other.noClientExt!= null) {
                return false;
            }
        } else {
            if (!this.noClientExt.equals(other.noClientExt)) {
                return false;
            }
        }
        if (this.natIdentC == null) {
            if (other.natIdentC!= null) {
                return false;
            }
        } else {
            if (!this.natIdentC.equals(other.natIdentC)) {
                return false;
            }
        }
        if (this.noPoliceExt == null) {
            if (other.noPoliceExt!= null) {
                return false;
            }
        } else {
            if (!this.noPoliceExt.equals(other.noPoliceExt)) {
                return false;
            }
        }
        if (this.natIdentP == null) {
            if (other.natIdentP!= null) {
                return false;
            }
        } else {
            if (!this.natIdentP.equals(other.natIdentP)) {
                return false;
            }
        }
        if (this.cdSociete == null) {
            if (other.cdSociete!= null) {
                return false;
            }
        } else {
            if (!this.cdSociete.equals(other.cdSociete)) {
                return false;
            }
        }
        if (this.cdProduit == null) {
            if (other.cdProduit!= null) {
                return false;
            }
        } else {
            if (!this.cdProduit.equals(other.cdProduit)) {
                return false;
            }
        }
        if (this.natIdentProd == null) {
            if (other.natIdentProd!= null) {
                return false;
            }
        } else {
            if (!this.natIdentProd.equals(other.natIdentProd)) {
                return false;
            }
        }
        if (this.dateSurv == null) {
            if (other.dateSurv!= null) {
                return false;
            }
        } else {
            if (!this.dateSurv.equals(other.dateSurv)) {
                return false;
            }
        }
        if (this.dateDeclaration == null) {
            if (other.dateDeclaration!= null) {
                return false;
            }
        } else {
            if (!this.dateDeclaration.equals(other.dateDeclaration)) {
                return false;
            }
        }
        if (this.dateDroc == null) {
            if (other.dateDroc!= null) {
                return false;
            }
        } else {
            if (!this.dateDroc.equals(other.dateDroc)) {
                return false;
            }
        }
        if (this.dateClos == null) {
            if (other.dateClos!= null) {
                return false;
            }
        } else {
            if (!this.dateClos.equals(other.dateClos)) {
                return false;
            }
        }
        if (this.dateArch == null) {
            if (other.dateArch!= null) {
                return false;
            }
        } else {
            if (!this.dateArch.equals(other.dateArch)) {
                return false;
            }
        }
        if (this.dateEpur == null) {
            if (other.dateEpur!= null) {
                return false;
            }
        } else {
            if (!this.dateEpur.equals(other.dateEpur)) {
                return false;
            }
        }
        if (this.etat == null) {
            if (other.etat!= null) {
                return false;
            }
        } else {
            if (!this.etat.equals(other.etat)) {
                return false;
            }
        }
        if (this.mtRegle == null) {
            if (other.mtRegle!= null) {
                return false;
            }
        } else {
            if (!this.mtRegle.equals(other.mtRegle)) {
                return false;
            }
        }
        if (this.mtEvaRest == null) {
            if (other.mtEvaRest!= null) {
                return false;
            }
        } else {
            if (!this.mtEvaRest.equals(other.mtEvaRest)) {
                return false;
            }
        }
        if (this.libNatSin == null) {
            if (other.libNatSin!= null) {
                return false;
            }
        } else {
            if (!this.libNatSin.equals(other.libNatSin)) {
                return false;
            }
        }
        if (this.sepExp == null) {
            if (other.sepExp!= null) {
                return false;
            }
        } else {
            if (!this.sepExp.equals(other.sepExp)) {
                return false;
            }
        }
        if (this.cdFamSin == null) {
            if (other.cdFamSin!= null) {
                return false;
            }
        } else {
            if (!this.cdFamSin.equals(other.cdFamSin)) {
                return false;
            }
        }
        if (this.ugSin == null) {
            if (other.ugSin!= null) {
                return false;
            }
        } else {
            if (!this.ugSin.equals(other.ugSin)) {
                return false;
            }
        }
        if (this.cdRedact == null) {
            if (other.cdRedact!= null) {
                return false;
            }
        } else {
            if (!this.cdRedact.equals(other.cdRedact)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.cdSource!= null) {
            rtn = (rtn + this.cdSource.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natDos!= null) {
            rtn = (rtn + this.natDos.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natFic!= null) {
            rtn = (rtn + this.natFic.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sousSystSrc!= null) {
            rtn = (rtn + this.sousSystSrc.hashCode());
        }
        rtn = (rtn* 37);
        if (this.noSinistre!= null) {
            rtn = (rtn + this.noSinistre.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natIdent!= null) {
            rtn = (rtn + this.natIdent.hashCode());
        }
        rtn = (rtn* 37);
        if (this.noClientExt!= null) {
            rtn = (rtn + this.noClientExt.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natIdentC!= null) {
            rtn = (rtn + this.natIdentC.hashCode());
        }
        rtn = (rtn* 37);
        if (this.noPoliceExt!= null) {
            rtn = (rtn + this.noPoliceExt.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natIdentP!= null) {
            rtn = (rtn + this.natIdentP.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cdSociete!= null) {
            rtn = (rtn + this.cdSociete.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cdProduit!= null) {
            rtn = (rtn + this.cdProduit.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natIdentProd!= null) {
            rtn = (rtn + this.natIdentProd.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateSurv!= null) {
            rtn = (rtn + this.dateSurv.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateDeclaration!= null) {
            rtn = (rtn + this.dateDeclaration.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateDroc!= null) {
            rtn = (rtn + this.dateDroc.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateClos!= null) {
            rtn = (rtn + this.dateClos.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateArch!= null) {
            rtn = (rtn + this.dateArch.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateEpur!= null) {
            rtn = (rtn + this.dateEpur.hashCode());
        }
        rtn = (rtn* 37);
        if (this.etat!= null) {
            rtn = (rtn + this.etat.hashCode());
        }
        rtn = (rtn* 37);
        if (this.mtRegle!= null) {
            rtn = (rtn + this.mtRegle.hashCode());
        }
        rtn = (rtn* 37);
        if (this.mtEvaRest!= null) {
            rtn = (rtn + this.mtEvaRest.hashCode());
        }
        rtn = (rtn* 37);
        if (this.libNatSin!= null) {
            rtn = (rtn + this.libNatSin.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sepExp!= null) {
            rtn = (rtn + this.sepExp.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cdFamSin!= null) {
            rtn = (rtn + this.cdFamSin.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ugSin!= null) {
            rtn = (rtn + this.ugSin.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cdRedact!= null) {
            rtn = (rtn + this.cdRedact.hashCode());
        }
        return rtn;
    }

    public String getCdSource() {
        return cdSource;
    }

    public void setCdSource(String cdSource) {
        this.cdSource = cdSource;
    }

    public String getNatDos() {
        return natDos;
    }

    public void setNatDos(String natDos) {
        this.natDos = natDos;
    }

    public String getNatFic() {
        return natFic;
    }

    public void setNatFic(String natFic) {
        this.natFic = natFic;
    }

    public String getSousSystSrc() {
        return sousSystSrc;
    }

    public void setSousSystSrc(String sousSystSrc) {
        this.sousSystSrc = sousSystSrc;
    }

    public String getNoSinistre() {
        return noSinistre;
    }

    public void setNoSinistre(String noSinistre) {
        this.noSinistre = noSinistre;
    }

    public String getNatIdent() {
        return natIdent;
    }

    public void setNatIdent(String natIdent) {
        this.natIdent = natIdent;
    }

    public String getNoClientExt() {
        return noClientExt;
    }

    public void setNoClientExt(String noClientExt) {
        this.noClientExt = noClientExt;
    }

    public String getNatIdentC() {
        return natIdentC;
    }

    public void setNatIdentC(String natIdentC) {
        this.natIdentC = natIdentC;
    }

    public String getNoPoliceExt() {
        return noPoliceExt;
    }

    public void setNoPoliceExt(String noPoliceExt) {
        this.noPoliceExt = noPoliceExt;
    }

    public String getNatIdentP() {
        return natIdentP;
    }

    public void setNatIdentP(String natIdentP) {
        this.natIdentP = natIdentP;
    }

    public String getCdSociete() {
        return cdSociete;
    }

    public void setCdSociete(String cdSociete) {
        this.cdSociete = cdSociete;
    }

    public String getCdProduit() {
        return cdProduit;
    }

    public void setCdProduit(String cdProduit) {
        this.cdProduit = cdProduit;
    }

    public String getNatIdentProd() {
        return natIdentProd;
    }

    public void setNatIdentProd(String natIdentProd) {
        this.natIdentProd = natIdentProd;
    }

    public Date getDateSurv() {
        return dateSurv;
    }

    public void setDateSurv(Date dateSurv) {
        this.dateSurv = dateSurv;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public Date getDateDroc() {
        return dateDroc;
    }

    public void setDateDroc(Date dateDroc) {
        this.dateDroc = dateDroc;
    }

    public Date getDateClos() {
        return dateClos;
    }

    public void setDateClos(Date dateClos) {
        this.dateClos = dateClos;
    }

    public Date getDateArch() {
        return dateArch;
    }

    public void setDateArch(Date dateArch) {
        this.dateArch = dateArch;
    }

    public Date getDateEpur() {
        return dateEpur;
    }

    public void setDateEpur(Date dateEpur) {
        this.dateEpur = dateEpur;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Double getMtRegle() {
        return mtRegle;
    }

    public void setMtRegle(Double mtRegle) {
        this.mtRegle = mtRegle;
    }

    public Double getMtEvaRest() {
        return mtEvaRest;
    }

    public void setMtEvaRest(Double mtEvaRest) {
        this.mtEvaRest = mtEvaRest;
    }

    public String getLibNatSin() {
        return libNatSin;
    }

    public void setLibNatSin(String libNatSin) {
        this.libNatSin = libNatSin;
    }

    public String getSepExp() {
        return sepExp;
    }

    public void setSepExp(String sepExp) {
        this.sepExp = sepExp;
    }

    public String getCdFamSin() {
        return cdFamSin;
    }

    public void setCdFamSin(String cdFamSin) {
        this.cdFamSin = cdFamSin;
    }

    public String getUgSin() {
        return ugSin;
    }

    public void setUgSin(String ugSin) {
        this.ugSin = ugSin;
    }

    public String getCdRedact() {
        return cdRedact;
    }

    public void setCdRedact(String cdRedact) {
        this.cdRedact = cdRedact;
    }

}
