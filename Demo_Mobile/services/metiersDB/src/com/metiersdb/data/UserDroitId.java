
package com.metiersdb.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  metiersDB.UserDroitId
 *  09/18/2012 17:49:53
 * 
 */
public class UserDroitId
    implements Serializable
{

    private String prenom;
    private String nom;
    private String badge;
    private String email;
    private String poste;
    private String telephone;
    private String bureau;
    private String societe;
    private String service;
    private String telephoneSecretariat;
    private String adresse;
    private String ville;
    private String cp;
    private String badgeRole;
    private String pass;
    private String role;
    private Date ddebut;
    private Date dfin;
    private String commentaire;
    private Boolean verrouille;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserDroitId)) {
            return false;
        }
        UserDroitId other = ((UserDroitId) o);
        if (this.prenom == null) {
            if (other.prenom!= null) {
                return false;
            }
        } else {
            if (!this.prenom.equals(other.prenom)) {
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
        if (this.badge == null) {
            if (other.badge!= null) {
                return false;
            }
        } else {
            if (!this.badge.equals(other.badge)) {
                return false;
            }
        }
        if (this.email == null) {
            if (other.email!= null) {
                return false;
            }
        } else {
            if (!this.email.equals(other.email)) {
                return false;
            }
        }
        if (this.poste == null) {
            if (other.poste!= null) {
                return false;
            }
        } else {
            if (!this.poste.equals(other.poste)) {
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
        if (this.bureau == null) {
            if (other.bureau!= null) {
                return false;
            }
        } else {
            if (!this.bureau.equals(other.bureau)) {
                return false;
            }
        }
        if (this.societe == null) {
            if (other.societe!= null) {
                return false;
            }
        } else {
            if (!this.societe.equals(other.societe)) {
                return false;
            }
        }
        if (this.service == null) {
            if (other.service!= null) {
                return false;
            }
        } else {
            if (!this.service.equals(other.service)) {
                return false;
            }
        }
        if (this.telephoneSecretariat == null) {
            if (other.telephoneSecretariat!= null) {
                return false;
            }
        } else {
            if (!this.telephoneSecretariat.equals(other.telephoneSecretariat)) {
                return false;
            }
        }
        if (this.adresse == null) {
            if (other.adresse!= null) {
                return false;
            }
        } else {
            if (!this.adresse.equals(other.adresse)) {
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
        if (this.cp == null) {
            if (other.cp!= null) {
                return false;
            }
        } else {
            if (!this.cp.equals(other.cp)) {
                return false;
            }
        }
        if (this.badgeRole == null) {
            if (other.badgeRole!= null) {
                return false;
            }
        } else {
            if (!this.badgeRole.equals(other.badgeRole)) {
                return false;
            }
        }
        if (this.pass == null) {
            if (other.pass!= null) {
                return false;
            }
        } else {
            if (!this.pass.equals(other.pass)) {
                return false;
            }
        }
        if (this.role == null) {
            if (other.role!= null) {
                return false;
            }
        } else {
            if (!this.role.equals(other.role)) {
                return false;
            }
        }
        if (this.ddebut == null) {
            if (other.ddebut!= null) {
                return false;
            }
        } else {
            if (!this.ddebut.equals(other.ddebut)) {
                return false;
            }
        }
        if (this.dfin == null) {
            if (other.dfin!= null) {
                return false;
            }
        } else {
            if (!this.dfin.equals(other.dfin)) {
                return false;
            }
        }
        if (this.commentaire == null) {
            if (other.commentaire!= null) {
                return false;
            }
        } else {
            if (!this.commentaire.equals(other.commentaire)) {
                return false;
            }
        }
        if (this.verrouille == null) {
            if (other.verrouille!= null) {
                return false;
            }
        } else {
            if (!this.verrouille.equals(other.verrouille)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.prenom!= null) {
            rtn = (rtn + this.prenom.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nom!= null) {
            rtn = (rtn + this.nom.hashCode());
        }
        rtn = (rtn* 37);
        if (this.badge!= null) {
            rtn = (rtn + this.badge.hashCode());
        }
        rtn = (rtn* 37);
        if (this.email!= null) {
            rtn = (rtn + this.email.hashCode());
        }
        rtn = (rtn* 37);
        if (this.poste!= null) {
            rtn = (rtn + this.poste.hashCode());
        }
        rtn = (rtn* 37);
        if (this.telephone!= null) {
            rtn = (rtn + this.telephone.hashCode());
        }
        rtn = (rtn* 37);
        if (this.bureau!= null) {
            rtn = (rtn + this.bureau.hashCode());
        }
        rtn = (rtn* 37);
        if (this.societe!= null) {
            rtn = (rtn + this.societe.hashCode());
        }
        rtn = (rtn* 37);
        if (this.service!= null) {
            rtn = (rtn + this.service.hashCode());
        }
        rtn = (rtn* 37);
        if (this.telephoneSecretariat!= null) {
            rtn = (rtn + this.telephoneSecretariat.hashCode());
        }
        rtn = (rtn* 37);
        if (this.adresse!= null) {
            rtn = (rtn + this.adresse.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ville!= null) {
            rtn = (rtn + this.ville.hashCode());
        }
        rtn = (rtn* 37);
        if (this.cp!= null) {
            rtn = (rtn + this.cp.hashCode());
        }
        rtn = (rtn* 37);
        if (this.badgeRole!= null) {
            rtn = (rtn + this.badgeRole.hashCode());
        }
        rtn = (rtn* 37);
        if (this.pass!= null) {
            rtn = (rtn + this.pass.hashCode());
        }
        rtn = (rtn* 37);
        if (this.role!= null) {
            rtn = (rtn + this.role.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ddebut!= null) {
            rtn = (rtn + this.ddebut.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dfin!= null) {
            rtn = (rtn + this.dfin.hashCode());
        }
        rtn = (rtn* 37);
        if (this.commentaire!= null) {
            rtn = (rtn + this.commentaire.hashCode());
        }
        rtn = (rtn* 37);
        if (this.verrouille!= null) {
            rtn = (rtn + this.verrouille.hashCode());
        }
        return rtn;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getTelephoneSecretariat() {
        return telephoneSecretariat;
    }

    public void setTelephoneSecretariat(String telephoneSecretariat) {
        this.telephoneSecretariat = telephoneSecretariat;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getBadgeRole() {
        return badgeRole;
    }

    public void setBadgeRole(String badgeRole) {
        this.badgeRole = badgeRole;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getDdebut() {
        return ddebut;
    }

    public void setDdebut(Date ddebut) {
        this.ddebut = ddebut;
    }

    public Date getDfin() {
        return dfin;
    }

    public void setDfin(Date dfin) {
        this.dfin = dfin;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Boolean getVerrouille() {
        return verrouille;
    }

    public void setVerrouille(Boolean verrouille) {
        this.verrouille = verrouille;
    }

}
