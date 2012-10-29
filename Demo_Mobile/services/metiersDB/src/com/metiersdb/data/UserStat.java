
package com.metiersdb.data;

import java.util.Date;


/**
 *  metiersDB.UserStat
 *  09/18/2012 17:49:53
 * 
 */
public class UserStat {

    private Long statId;
    private Long statUser;
    private Date statDate;
    private Long statJoursemaine;
    private String statOrigine;
    private String statNature;
    private Long statValeur;
    private String statUnite;

    public Long getStatId() {
        return statId;
    }

    public void setStatId(Long statId) {
        this.statId = statId;
    }

    public Long getStatUser() {
        return statUser;
    }

    public void setStatUser(Long statUser) {
        this.statUser = statUser;
    }

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public Long getStatJoursemaine() {
        return statJoursemaine;
    }

    public void setStatJoursemaine(Long statJoursemaine) {
        this.statJoursemaine = statJoursemaine;
    }

    public String getStatOrigine() {
        return statOrigine;
    }

    public void setStatOrigine(String statOrigine) {
        this.statOrigine = statOrigine;
    }

    public String getStatNature() {
        return statNature;
    }

    public void setStatNature(String statNature) {
        this.statNature = statNature;
    }

    public Long getStatValeur() {
        return statValeur;
    }

    public void setStatValeur(Long statValeur) {
        this.statValeur = statValeur;
    }

    public String getStatUnite() {
        return statUnite;
    }

    public void setStatUnite(String statUnite) {
        this.statUnite = statUnite;
    }

}
