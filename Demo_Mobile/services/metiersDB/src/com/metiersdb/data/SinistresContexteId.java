
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.SinistresContexteId
 *  09/18/2012 17:49:53
 * 
 */
public class SinistresContexteId
    implements Serializable
{

    private String cdSource;
    private String natDos;
    private String natFic;
    private String sousSystSrc;
    private String noSinistre;
    private String natIdent;
    private String natLieu;
    private String lieuVille;
    private String filler1;
    private String lieuCpPost;
    private String filler2;
    private String lieuRue;
    private String natMinss;
    private String libMinss;
    private String natLeses;
    private Double nombreLese;
    private String filler3;
    private String nom1erLese;
    private String natArch;
    private String libArch;
    private String libCorpo;
    private String libContentieux;
    private String natLiens;
    private String nbLiens;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SinistresContexteId)) {
            return false;
        }
        SinistresContexteId other = ((SinistresContexteId) o);
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
        if (this.natLieu == null) {
            if (other.natLieu!= null) {
                return false;
            }
        } else {
            if (!this.natLieu.equals(other.natLieu)) {
                return false;
            }
        }
        if (this.lieuVille == null) {
            if (other.lieuVille!= null) {
                return false;
            }
        } else {
            if (!this.lieuVille.equals(other.lieuVille)) {
                return false;
            }
        }
        if (this.filler1 == null) {
            if (other.filler1 != null) {
                return false;
            }
        } else {
            if (!this.filler1 .equals(other.filler1)) {
                return false;
            }
        }
        if (this.lieuCpPost == null) {
            if (other.lieuCpPost!= null) {
                return false;
            }
        } else {
            if (!this.lieuCpPost.equals(other.lieuCpPost)) {
                return false;
            }
        }
        if (this.filler2 == null) {
            if (other.filler2 != null) {
                return false;
            }
        } else {
            if (!this.filler2 .equals(other.filler2)) {
                return false;
            }
        }
        if (this.lieuRue == null) {
            if (other.lieuRue!= null) {
                return false;
            }
        } else {
            if (!this.lieuRue.equals(other.lieuRue)) {
                return false;
            }
        }
        if (this.natMinss == null) {
            if (other.natMinss!= null) {
                return false;
            }
        } else {
            if (!this.natMinss.equals(other.natMinss)) {
                return false;
            }
        }
        if (this.libMinss == null) {
            if (other.libMinss!= null) {
                return false;
            }
        } else {
            if (!this.libMinss.equals(other.libMinss)) {
                return false;
            }
        }
        if (this.natLeses == null) {
            if (other.natLeses!= null) {
                return false;
            }
        } else {
            if (!this.natLeses.equals(other.natLeses)) {
                return false;
            }
        }
        if (this.nombreLese == null) {
            if (other.nombreLese!= null) {
                return false;
            }
        } else {
            if (!this.nombreLese.equals(other.nombreLese)) {
                return false;
            }
        }
        if (this.filler3 == null) {
            if (other.filler3 != null) {
                return false;
            }
        } else {
            if (!this.filler3 .equals(other.filler3)) {
                return false;
            }
        }
        if (this.nom1erLese == null) {
            if (other.nom1erLese!= null) {
                return false;
            }
        } else {
            if (!this.nom1erLese.equals(other.nom1erLese)) {
                return false;
            }
        }
        if (this.natArch == null) {
            if (other.natArch!= null) {
                return false;
            }
        } else {
            if (!this.natArch.equals(other.natArch)) {
                return false;
            }
        }
        if (this.libArch == null) {
            if (other.libArch!= null) {
                return false;
            }
        } else {
            if (!this.libArch.equals(other.libArch)) {
                return false;
            }
        }
        if (this.libCorpo == null) {
            if (other.libCorpo!= null) {
                return false;
            }
        } else {
            if (!this.libCorpo.equals(other.libCorpo)) {
                return false;
            }
        }
        if (this.libContentieux == null) {
            if (other.libContentieux!= null) {
                return false;
            }
        } else {
            if (!this.libContentieux.equals(other.libContentieux)) {
                return false;
            }
        }
        if (this.natLiens == null) {
            if (other.natLiens!= null) {
                return false;
            }
        } else {
            if (!this.natLiens.equals(other.natLiens)) {
                return false;
            }
        }
        if (this.nbLiens == null) {
            if (other.nbLiens!= null) {
                return false;
            }
        } else {
            if (!this.nbLiens.equals(other.nbLiens)) {
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
        if (this.natLieu!= null) {
            rtn = (rtn + this.natLieu.hashCode());
        }
        rtn = (rtn* 37);
        if (this.lieuVille!= null) {
            rtn = (rtn + this.lieuVille.hashCode());
        }
        rtn = (rtn* 37);
        if (this.filler1 != null) {
            rtn = (rtn + this.filler1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.lieuCpPost!= null) {
            rtn = (rtn + this.lieuCpPost.hashCode());
        }
        rtn = (rtn* 37);
        if (this.filler2 != null) {
            rtn = (rtn + this.filler2 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.lieuRue!= null) {
            rtn = (rtn + this.lieuRue.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natMinss!= null) {
            rtn = (rtn + this.natMinss.hashCode());
        }
        rtn = (rtn* 37);
        if (this.libMinss!= null) {
            rtn = (rtn + this.libMinss.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natLeses!= null) {
            rtn = (rtn + this.natLeses.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nombreLese!= null) {
            rtn = (rtn + this.nombreLese.hashCode());
        }
        rtn = (rtn* 37);
        if (this.filler3 != null) {
            rtn = (rtn + this.filler3 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.nom1erLese!= null) {
            rtn = (rtn + this.nom1erLese.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natArch!= null) {
            rtn = (rtn + this.natArch.hashCode());
        }
        rtn = (rtn* 37);
        if (this.libArch!= null) {
            rtn = (rtn + this.libArch.hashCode());
        }
        rtn = (rtn* 37);
        if (this.libCorpo!= null) {
            rtn = (rtn + this.libCorpo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.libContentieux!= null) {
            rtn = (rtn + this.libContentieux.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natLiens!= null) {
            rtn = (rtn + this.natLiens.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nbLiens!= null) {
            rtn = (rtn + this.nbLiens.hashCode());
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

    public String getNatLieu() {
        return natLieu;
    }

    public void setNatLieu(String natLieu) {
        this.natLieu = natLieu;
    }

    public String getLieuVille() {
        return lieuVille;
    }

    public void setLieuVille(String lieuVille) {
        this.lieuVille = lieuVille;
    }

    public String getFiller1() {
        return filler1;
    }

    public void setFiller1(String filler1) {
        this.filler1 = filler1;
    }

    public String getLieuCpPost() {
        return lieuCpPost;
    }

    public void setLieuCpPost(String lieuCpPost) {
        this.lieuCpPost = lieuCpPost;
    }

    public String getFiller2() {
        return filler2;
    }

    public void setFiller2(String filler2) {
        this.filler2 = filler2;
    }

    public String getLieuRue() {
        return lieuRue;
    }

    public void setLieuRue(String lieuRue) {
        this.lieuRue = lieuRue;
    }

    public String getNatMinss() {
        return natMinss;
    }

    public void setNatMinss(String natMinss) {
        this.natMinss = natMinss;
    }

    public String getLibMinss() {
        return libMinss;
    }

    public void setLibMinss(String libMinss) {
        this.libMinss = libMinss;
    }

    public String getNatLeses() {
        return natLeses;
    }

    public void setNatLeses(String natLeses) {
        this.natLeses = natLeses;
    }

    public Double getNombreLese() {
        return nombreLese;
    }

    public void setNombreLese(Double nombreLese) {
        this.nombreLese = nombreLese;
    }

    public String getFiller3() {
        return filler3;
    }

    public void setFiller3(String filler3) {
        this.filler3 = filler3;
    }

    public String getNom1erLese() {
        return nom1erLese;
    }

    public void setNom1erLese(String nom1erLese) {
        this.nom1erLese = nom1erLese;
    }

    public String getNatArch() {
        return natArch;
    }

    public void setNatArch(String natArch) {
        this.natArch = natArch;
    }

    public String getLibArch() {
        return libArch;
    }

    public void setLibArch(String libArch) {
        this.libArch = libArch;
    }

    public String getLibCorpo() {
        return libCorpo;
    }

    public void setLibCorpo(String libCorpo) {
        this.libCorpo = libCorpo;
    }

    public String getLibContentieux() {
        return libContentieux;
    }

    public void setLibContentieux(String libContentieux) {
        this.libContentieux = libContentieux;
    }

    public String getNatLiens() {
        return natLiens;
    }

    public void setNatLiens(String natLiens) {
        this.natLiens = natLiens;
    }

    public String getNbLiens() {
        return nbLiens;
    }

    public void setNbLiens(String nbLiens) {
        this.nbLiens = nbLiens;
    }

}
