
package com.metiersdb.data;

import java.util.Date;


/**
 *  metiersDB.UserEvt
 *  09/18/2012 17:49:53
 * 
 */
public class UserEvt {

    private Long evtId;
    private Date evtDate;
    private String evtDomaine;
    private String evtNature;
    private String evtOrigine;
    private String evtClient;
    private String evtContrat;
    private String evtSinistre;
    private String evtTelephone;
    private String evtAction;
    private String evtCommentaire;

    public Long getEvtId() {
        return evtId;
    }

    public void setEvtId(Long evtId) {
        this.evtId = evtId;
    }

    public Date getEvtDate() {
        return evtDate;
    }

    public void setEvtDate(Date evtDate) {
        this.evtDate = evtDate;
    }

    public String getEvtDomaine() {
        return evtDomaine;
    }

    public void setEvtDomaine(String evtDomaine) {
        this.evtDomaine = evtDomaine;
    }

    public String getEvtNature() {
        return evtNature;
    }

    public void setEvtNature(String evtNature) {
        this.evtNature = evtNature;
    }

    public String getEvtOrigine() {
        return evtOrigine;
    }

    public void setEvtOrigine(String evtOrigine) {
        this.evtOrigine = evtOrigine;
    }

    public String getEvtClient() {
        return evtClient;
    }

    public void setEvtClient(String evtClient) {
        this.evtClient = evtClient;
    }

    public String getEvtContrat() {
        return evtContrat;
    }

    public void setEvtContrat(String evtContrat) {
        this.evtContrat = evtContrat;
    }

    public String getEvtSinistre() {
        return evtSinistre;
    }

    public void setEvtSinistre(String evtSinistre) {
        this.evtSinistre = evtSinistre;
    }

    public String getEvtTelephone() {
        return evtTelephone;
    }

    public void setEvtTelephone(String evtTelephone) {
        this.evtTelephone = evtTelephone;
    }

    public String getEvtAction() {
        return evtAction;
    }

    public void setEvtAction(String evtAction) {
        this.evtAction = evtAction;
    }

    public String getEvtCommentaire() {
        return evtCommentaire;
    }

    public void setEvtCommentaire(String evtCommentaire) {
        this.evtCommentaire = evtCommentaire;
    }

}
