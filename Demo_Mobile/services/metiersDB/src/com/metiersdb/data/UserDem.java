
package com.metiersdb.data;

import java.util.Date;


/**
 *  metiersDB.UserDem
 *  09/18/2012 17:49:53
 * 
 */
public class UserDem {

    private Long demId;
    private String demNature;
    private Date demDate;
    private String demObjet;
    private String demDescription;
    private String demDemandeur;
    private String demDestinataire;
    private Date demDebut;
    private Date demFin;
    private String demEtat;

    public Long getDemId() {
        return demId;
    }

    public void setDemId(Long demId) {
        this.demId = demId;
    }

    public String getDemNature() {
        return demNature;
    }

    public void setDemNature(String demNature) {
        this.demNature = demNature;
    }

    public Date getDemDate() {
        return demDate;
    }

    public void setDemDate(Date demDate) {
        this.demDate = demDate;
    }

    public String getDemObjet() {
        return demObjet;
    }

    public void setDemObjet(String demObjet) {
        this.demObjet = demObjet;
    }

    public String getDemDescription() {
        return demDescription;
    }

    public void setDemDescription(String demDescription) {
        this.demDescription = demDescription;
    }

    public String getDemDemandeur() {
        return demDemandeur;
    }

    public void setDemDemandeur(String demDemandeur) {
        this.demDemandeur = demDemandeur;
    }

    public String getDemDestinataire() {
        return demDestinataire;
    }

    public void setDemDestinataire(String demDestinataire) {
        this.demDestinataire = demDestinataire;
    }

    public Date getDemDebut() {
        return demDebut;
    }

    public void setDemDebut(Date demDebut) {
        this.demDebut = demDebut;
    }

    public Date getDemFin() {
        return demFin;
    }

    public void setDemFin(Date demFin) {
        this.demFin = demFin;
    }

    public String getDemEtat() {
        return demEtat;
    }

    public void setDemEtat(String demEtat) {
        this.demEtat = demEtat;
    }

}
