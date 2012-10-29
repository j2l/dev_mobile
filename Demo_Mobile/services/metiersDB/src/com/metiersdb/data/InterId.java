
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.InterId
 *  09/18/2012 17:49:53
 * 
 */
public class InterId
    implements Serializable
{

    private Integer numero;
    private String nature;
    private Integer numInter;
    private String profil;
    private String nom;
    private String adresse1;
    private String adresse2;
    private String adresse3;
    private String adresse4;
    private String tel;
    private String fax;
    private String pays;
    private String civilite;
    private String adrcci;
    private Integer codePostal;
    private String ville;
    private String sigle;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InterId)) {
            return false;
        }
        InterId other = ((InterId) o);
        if (this.numero == null) {
            if (other.numero!= null) {
                return false;
            }
        } else {
            if (!this.numero.equals(other.numero)) {
                return false;
            }
        }
        if (this.nature == null) {
            if (other.nature!= null) {
                return false;
            }
        } else {
            if (!this.nature.equals(other.nature)) {
                return false;
            }
        }
        if (this.numInter == null) {
            if (other.numInter!= null) {
                return false;
            }
        } else {
            if (!this.numInter.equals(other.numInter)) {
                return false;
            }
        }
        if (this.profil == null) {
            if (other.profil!= null) {
                return false;
            }
        } else {
            if (!this.profil.equals(other.profil)) {
                return false;
            }
        }
        if (this.nom == null) {
            if (other.nom!= null) {
                return false;
            }
        } else {
            if (!this.nom.equals(other.nom)) {
                return false;
            }
        }
        if (this.adresse1 == null) {
            if (other.adresse1 != null) {
                return false;
            }
        } else {
            if (!this.adresse1 .equals(other.adresse1)) {
                return false;
            }
        }
        if (this.adresse2 == null) {
            if (other.adresse2 != null) {
                return false;
            }
        } else {
            if (!this.adresse2 .equals(other.adresse2)) {
                return false;
            }
        }
        if (this.adresse3 == null) {
            if (other.adresse3 != null) {
                return false;
            }
        } else {
            if (!this.adresse3 .equals(other.adresse3)) {
                return false;
            }
        }
        if (this.adresse4 == null) {
            if (other.adresse4 != null) {
                return false;
            }
        } else {
            if (!this.adresse4 .equals(other.adresse4)) {
                return false;
            }
        }
        if (this.tel == null) {
            if (other.tel!= null) {
                return false;
            }
        } else {
            if (!this.tel.equals(other.tel)) {
                return false;
            }
        }
        if (this.fax == null) {
            if (other.fax!= null) {
                return false;
            }
        } else {
            if (!this.fax.equals(other.fax)) {
                return false;
            }
        }
        if (this.pays == null) {
            if (other.pays!= null) {
                return false;
            }
        } else {
            if (!this.pays.equals(other.pays)) {
                return false;
            }
        }
        if (this.civilite == null) {
            if (other.civilite!= null) {
                return false;
            }
        } else {
            if (!this.civilite.equals(other.civilite)) {
                return false;
            }
        }
        if (this.adrcci == null) {
            if (other.adrcci!= null) {
                return false;
            }
        } else {
            if (!this.adrcci.equals(other.adrcci)) {
                return false;
            }
        }
        if (this.codePostal == null) {
            if (other.codePostal!= null) {
                return false;
            }
        } else {
            if (!this.codePostal.equals(other.codePostal)) {
                return false;
            }
        }
        if (this.ville == null) {
            if (other.ville!= null) {
                return false;
            }
        } else {
            if (!this.ville.equals(other.ville)) {
                return false;
            }
        }
        if (this.sigle == null) {
            if (other.sigle!= null) {
                return false;
            }
        } else {
            if (!this.sigle.equals(other.sigle)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.numero!= null) {
            rtn = (rtn + this.numero.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nature!= null) {
            rtn = (rtn + this.nature.hashCode());
        }
        rtn = (rtn* 37);
        if (this.numInter!= null) {
            rtn = (rtn + this.numInter.hashCode());
        }
        rtn = (rtn* 37);
        if (this.profil!= null) {
            rtn = (rtn + this.profil.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nom!= null) {
            rtn = (rtn + this.nom.hashCode());
        }
        rtn = (rtn* 37);
        if (this.adresse1 != null) {
            rtn = (rtn + this.adresse1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.adresse2 != null) {
            rtn = (rtn + this.adresse2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.adresse3 != null) {
            rtn = (rtn + this.adresse3 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.adresse4 != null) {
            rtn = (rtn + this.adresse4 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.tel!= null) {
            rtn = (rtn + this.tel.hashCode());
        }
        rtn = (rtn* 37);
        if (this.fax!= null) {
            rtn = (rtn + this.fax.hashCode());
        }
        rtn = (rtn* 37);
        if (this.pays!= null) {
            rtn = (rtn + this.pays.hashCode());
        }
        rtn = (rtn* 37);
        if (this.civilite!= null) {
            rtn = (rtn + this.civilite.hashCode());
        }
        rtn = (rtn* 37);
        if (this.adrcci!= null) {
            rtn = (rtn + this.adrcci.hashCode());
        }
        rtn = (rtn* 37);
        if (this.codePostal!= null) {
            rtn = (rtn + this.codePostal.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ville!= null) {
            rtn = (rtn + this.ville.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sigle!= null) {
            rtn = (rtn + this.sigle.hashCode());
        }
        return rtn;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Integer getNumInter() {
        return numInter;
    }

    public void setNumInter(Integer numInter) {
        this.numInter = numInter;
    }

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getAdresse3() {
        return adresse3;
    }

    public void setAdresse3(String adresse3) {
        this.adresse3 = adresse3;
    }

    public String getAdresse4() {
        return adresse4;
    }

    public void setAdresse4(String adresse4) {
        this.adresse4 = adresse4;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getAdrcci() {
        return adrcci;
    }

    public void setAdrcci(String adrcci) {
        this.adrcci = adrcci;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

}
