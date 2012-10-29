
package com.metiersdb.data;

import java.util.Date;


/**
 *  metiersDB.Taches
 *  09/18/2012 17:49:53
 * 
 */
public class Taches {

    private TachesId id;
    private Date echeance;
    private String description;
    private Boolean terminee;
    private String contact;
    private String client;

    public TachesId getId() {
        return id;
    }

    public void setId(TachesId id) {
        this.id = id;
    }

    public Date getEcheance() {
        return echeance;
    }

    public void setEcheance(Date echeance) {
        this.echeance = echeance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getTerminee() {
        return terminee;
    }

    public void setTerminee(Boolean terminee) {
        this.terminee = terminee;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

}
