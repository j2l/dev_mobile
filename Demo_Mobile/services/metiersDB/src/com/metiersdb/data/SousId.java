
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.SousId
 *  09/18/2012 17:49:53
 * 
 */
public class SousId
    implements Serializable
{

    private String numClient;
    private String numMk1;
    private String numAsi;
    private String numSousSma;
    private String ug;
    private String bd;
    private String creeLe;
    private String creeA;
    private String modifLe;
    private String modifA;
    private String nomUtilisateur;
    private String natureAdresse;
    private String typeAdresse;
    private String naturePersonne;
    private String sigle;
    private String civilite;
    private String prenom;
    private String nomDenomination;
    private String codeComplIdent;
    private String complIdent;
    private String complDistribution;
    private String lieuDit;
    private String voie;
    private String codePostal;
    private String nomLocalite;
    private String codePays;
    private String telephone;
    private String telecopie;
    private String finUtilisation;
    private String creationAdresse;
    private String derniereMaj;
    private String debutValidite;
    private String nomUtilisateurAdresse;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SousId)) {
            return false;
        }
        SousId other = ((SousId) o);
        if (this.numClient == null) {
            if (other.numClient!= null) {
                return false;
            }
        } else {
            if (!this.numClient.equals(other.numClient)) {
                return false;
            }
        }
        if (this.numMk1 == null) {
            if (other.numMk1 != null) {
                return false;
            }
        } else {
            if (!this.numMk1 .equals(other.numMk1)) {
                return false;
            }
        }
        if (this.numAsi == null) {
            if (other.numAsi!= null) {
                return false;
            }
        } else {
            if (!this.numAsi.equals(other.numAsi)) {
                return false;
            }
        }
        if (this.numSousSma == null) {
            if (other.numSousSma!= null) {
                return false;
            }
        } else {
            if (!this.numSousSma.equals(other.numSousSma)) {
                return false;
            }
        }
        if (this.ug == null) {
            if (other.ug!= null) {
                return false;
            }
        } else {
            if (!this.ug.equals(other.ug)) {
                return false;
            }
        }
        if (this.bd == null) {
            if (other.bd!= null) {
                return false;
            }
        } else {
            if (!this.bd.equals(other.bd)) {
                return false;
            }
        }
        if (this.creeLe == null) {
            if (other.creeLe!= null) {
                return false;
            }
        } else {
            if (!this.creeLe.equals(other.creeLe)) {
                return false;
            }
        }
        if (this.creeA == null) {
            if (other.creeA!= null) {
                return false;
            }
        } else {
            if (!this.creeA.equals(other.creeA)) {
                return false;
            }
        }
        if (this.modifLe == null) {
            if (other.modifLe!= null) {
                return false;
            }
        } else {
            if (!this.modifLe.equals(other.modifLe)) {
                return false;
            }
        }
        if (this.modifA == null) {
            if (other.modifA!= null) {
                return false;
            }
        } else {
            if (!this.modifA.equals(other.modifA)) {
                return false;
            }
        }
        if (this.nomUtilisateur == null) {
            if (other.nomUtilisateur!= null) {
                return false;
            }
        } else {
            if (!this.nomUtilisateur.equals(other.nomUtilisateur)) {
                return false;
            }
        }
        if (this.natureAdresse == null) {
            if (other.natureAdresse!= null) {
                return false;
            }
        } else {
            if (!this.natureAdresse.equals(other.natureAdresse)) {
                return false;
            }
        }
        if (this.typeAdresse == null) {
            if (other.typeAdresse!= null) {
                return false;
            }
        } else {
            if (!this.typeAdresse.equals(other.typeAdresse)) {
                return false;
            }
        }
        if (this.naturePersonne == null) {
            if (other.naturePersonne!= null) {
                return false;
            }
        } else {
            if (!this.naturePersonne.equals(other.naturePersonne)) {
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
        if (this.civilite == null) {
            if (other.civilite!= null) {
                return false;
            }
        } else {
            if (!this.civilite.equals(other.civilite)) {
                return false;
            }
        }
        if (this.prenom == null) {
            if (other.prenom!= null) {
                return false;
            }
        } else {
            if (!this.prenom.equals(other.prenom)) {
                return false;
            }
        }
        if (this.nomDenomination == null) {
            if (other.nomDenomination!= null) {
                return false;
            }
        } else {
            if (!this.nomDenomination.equals(other.nomDenomination)) {
                return false;
            }
        }
        if (this.codeComplIdent == null) {
            if (other.codeComplIdent!= null) {
                return false;
            }
        } else {
            if (!this.codeComplIdent.equals(other.codeComplIdent)) {
                return false;
            }
        }
        if (this.complIdent == null) {
            if (other.complIdent!= null) {
                return false;
            }
        } else {
            if (!this.complIdent.equals(other.complIdent)) {
                return false;
            }
        }
        if (this.complDistribution == null) {
            if (other.complDistribution!= null) {
                return false;
            }
        } else {
            if (!this.complDistribution.equals(other.complDistribution)) {
                return false;
            }
        }
        if (this.lieuDit == null) {
            if (other.lieuDit!= null) {
                return false;
            }
        } else {
            if (!this.lieuDit.equals(other.lieuDit)) {
                return false;
            }
        }
        if (this.voie == null) {
            if (other.voie!= null) {
                return false;
            }
        } else {
            if (!this.voie.equals(other.voie)) {
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
        if (this.nomLocalite == null) {
            if (other.nomLocalite!= null) {
                return false;
            }
        } else {
            if (!this.nomLocalite.equals(other.nomLocalite)) {
                return false;
            }
        }
        if (this.codePays == null) {
            if (other.codePays!= null) {
                return false;
            }
        } else {
            if (!this.codePays.equals(other.codePays)) {
                return false;
            }
        }
        if (this.telephone == null) {
            if (other.telephone!= null) {
                return false;
            }
        } else {
            if (!this.telephone.equals(other.telephone)) {
                return false;
            }
        }
        if (this.telecopie == null) {
            if (other.telecopie!= null) {
                return false;
            }
        } else {
            if (!this.telecopie.equals(other.telecopie)) {
                return false;
            }
        }
        if (this.finUtilisation == null) {
            if (other.finUtilisation!= null) {
                return false;
            }
        } else {
            if (!this.finUtilisation.equals(other.finUtilisation)) {
                return false;
            }
        }
        if (this.creationAdresse == null) {
            if (other.creationAdresse!= null) {
                return false;
            }
        } else {
            if (!this.creationAdresse.equals(other.creationAdresse)) {
                return false;
            }
        }
        if (this.derniereMaj == null) {
            if (other.derniereMaj!= null) {
                return false;
            }
        } else {
            if (!this.derniereMaj.equals(other.derniereMaj)) {
                return false;
            }
        }
        if (this.debutValidite == null) {
            if (other.debutValidite!= null) {
                return false;
            }
        } else {
            if (!this.debutValidite.equals(other.debutValidite)) {
                return false;
            }
        }
        if (this.nomUtilisateurAdresse == null) {
            if (other.nomUtilisateurAdresse!= null) {
                return false;
            }
        } else {
            if (!this.nomUtilisateurAdresse.equals(other.nomUtilisateurAdresse)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.numClient!= null) {
            rtn = (rtn + this.numClient.hashCode());
        }
        rtn = (rtn* 37);
        if (this.numMk1 != null) {
            rtn = (rtn + this.numMk1 .hashCode());
        }
        rtn = (rtn* 37);
        if (this.numAsi!= null) {
            rtn = (rtn + this.numAsi.hashCode());
        }
        rtn = (rtn* 37);
        if (this.numSousSma!= null) {
            rtn = (rtn + this.numSousSma.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ug!= null) {
            rtn = (rtn + this.ug.hashCode());
        }
        rtn = (rtn* 37);
        if (this.bd!= null) {
            rtn = (rtn + this.bd.hashCode());
        }
        rtn = (rtn* 37);
        if (this.creeLe!= null) {
            rtn = (rtn + this.creeLe.hashCode());
        }
        rtn = (rtn* 37);
        if (this.creeA!= null) {
            rtn = (rtn + this.creeA.hashCode());
        }
        rtn = (rtn* 37);
        if (this.modifLe!= null) {
            rtn = (rtn + this.modifLe.hashCode());
        }
        rtn = (rtn* 37);
        if (this.modifA!= null) {
            rtn = (rtn + this.modifA.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nomUtilisateur!= null) {
            rtn = (rtn + this.nomUtilisateur.hashCode());
        }
        rtn = (rtn* 37);
        if (this.natureAdresse!= null) {
            rtn = (rtn + this.natureAdresse.hashCode());
        }
        rtn = (rtn* 37);
        if (this.typeAdresse!= null) {
            rtn = (rtn + this.typeAdresse.hashCode());
        }
        rtn = (rtn* 37);
        if (this.naturePersonne!= null) {
            rtn = (rtn + this.naturePersonne.hashCode());
        }
        rtn = (rtn* 37);
        if (this.sigle!= null) {
            rtn = (rtn + this.sigle.hashCode());
        }
        rtn = (rtn* 37);
        if (this.civilite!= null) {
            rtn = (rtn + this.civilite.hashCode());
        }
        rtn = (rtn* 37);
        if (this.prenom!= null) {
            rtn = (rtn + this.prenom.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nomDenomination!= null) {
            rtn = (rtn + this.nomDenomination.hashCode());
        }
        rtn = (rtn* 37);
        if (this.codeComplIdent!= null) {
            rtn = (rtn + this.codeComplIdent.hashCode());
        }
        rtn = (rtn* 37);
        if (this.complIdent!= null) {
            rtn = (rtn + this.complIdent.hashCode());
        }
        rtn = (rtn* 37);
        if (this.complDistribution!= null) {
            rtn = (rtn + this.complDistribution.hashCode());
        }
        rtn = (rtn* 37);
        if (this.lieuDit!= null) {
            rtn = (rtn + this.lieuDit.hashCode());
        }
        rtn = (rtn* 37);
        if (this.voie!= null) {
            rtn = (rtn + this.voie.hashCode());
        }
        rtn = (rtn* 37);
        if (this.codePostal!= null) {
            rtn = (rtn + this.codePostal.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nomLocalite!= null) {
            rtn = (rtn + this.nomLocalite.hashCode());
        }
        rtn = (rtn* 37);
        if (this.codePays!= null) {
            rtn = (rtn + this.codePays.hashCode());
        }
        rtn = (rtn* 37);
        if (this.telephone!= null) {
            rtn = (rtn + this.telephone.hashCode());
        }
        rtn = (rtn* 37);
        if (this.telecopie!= null) {
            rtn = (rtn + this.telecopie.hashCode());
        }
        rtn = (rtn* 37);
        if (this.finUtilisation!= null) {
            rtn = (rtn + this.finUtilisation.hashCode());
        }
        rtn = (rtn* 37);
        if (this.creationAdresse!= null) {
            rtn = (rtn + this.creationAdresse.hashCode());
        }
        rtn = (rtn* 37);
        if (this.derniereMaj!= null) {
            rtn = (rtn + this.derniereMaj.hashCode());
        }
        rtn = (rtn* 37);
        if (this.debutValidite!= null) {
            rtn = (rtn + this.debutValidite.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nomUtilisateurAdresse!= null) {
            rtn = (rtn + this.nomUtilisateurAdresse.hashCode());
        }
        return rtn;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public String getNumMk1() {
        return numMk1;
    }

    public void setNumMk1(String numMk1) {
        this.numMk1 = numMk1;
    }

    public String getNumAsi() {
        return numAsi;
    }

    public void setNumAsi(String numAsi) {
        this.numAsi = numAsi;
    }

    public String getNumSousSma() {
        return numSousSma;
    }

    public void setNumSousSma(String numSousSma) {
        this.numSousSma = numSousSma;
    }

    public String getUg() {
        return ug;
    }

    public void setUg(String ug) {
        this.ug = ug;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getCreeLe() {
        return creeLe;
    }

    public void setCreeLe(String creeLe) {
        this.creeLe = creeLe;
    }

    public String getCreeA() {
        return creeA;
    }

    public void setCreeA(String creeA) {
        this.creeA = creeA;
    }

    public String getModifLe() {
        return modifLe;
    }

    public void setModifLe(String modifLe) {
        this.modifLe = modifLe;
    }

    public String getModifA() {
        return modifA;
    }

    public void setModifA(String modifA) {
        this.modifA = modifA;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getNatureAdresse() {
        return natureAdresse;
    }

    public void setNatureAdresse(String natureAdresse) {
        this.natureAdresse = natureAdresse;
    }

    public String getTypeAdresse() {
        return typeAdresse;
    }

    public void setTypeAdresse(String typeAdresse) {
        this.typeAdresse = typeAdresse;
    }

    public String getNaturePersonne() {
        return naturePersonne;
    }

    public void setNaturePersonne(String naturePersonne) {
        this.naturePersonne = naturePersonne;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDenomination() {
        return nomDenomination;
    }

    public void setNomDenomination(String nomDenomination) {
        this.nomDenomination = nomDenomination;
    }

    public String getCodeComplIdent() {
        return codeComplIdent;
    }

    public void setCodeComplIdent(String codeComplIdent) {
        this.codeComplIdent = codeComplIdent;
    }

    public String getComplIdent() {
        return complIdent;
    }

    public void setComplIdent(String complIdent) {
        this.complIdent = complIdent;
    }

    public String getComplDistribution() {
        return complDistribution;
    }

    public void setComplDistribution(String complDistribution) {
        this.complDistribution = complDistribution;
    }

    public String getLieuDit() {
        return lieuDit;
    }

    public void setLieuDit(String lieuDit) {
        this.lieuDit = lieuDit;
    }

    public String getVoie() {
        return voie;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomLocalite() {
        return nomLocalite;
    }

    public void setNomLocalite(String nomLocalite) {
        this.nomLocalite = nomLocalite;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelecopie() {
        return telecopie;
    }

    public void setTelecopie(String telecopie) {
        this.telecopie = telecopie;
    }

    public String getFinUtilisation() {
        return finUtilisation;
    }

    public void setFinUtilisation(String finUtilisation) {
        this.finUtilisation = finUtilisation;
    }

    public String getCreationAdresse() {
        return creationAdresse;
    }

    public void setCreationAdresse(String creationAdresse) {
        this.creationAdresse = creationAdresse;
    }

    public String getDerniereMaj() {
        return derniereMaj;
    }

    public void setDerniereMaj(String derniereMaj) {
        this.derniereMaj = derniereMaj;
    }

    public String getDebutValidite() {
        return debutValidite;
    }

    public void setDebutValidite(String debutValidite) {
        this.debutValidite = debutValidite;
    }

    public String getNomUtilisateurAdresse() {
        return nomUtilisateurAdresse;
    }

    public void setNomUtilisateurAdresse(String nomUtilisateurAdresse) {
        this.nomUtilisateurAdresse = nomUtilisateurAdresse;
    }

}
