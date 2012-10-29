
package com.metiersdb.data;

import java.util.Date;


/**
 *  metiersDB.UserRole
 *  09/18/2012 17:49:53
 * 
 */
public class UserRole {

    private String badge;
    private String pass;
    private String role;
    private Date ddebut;
    private Date dfin;
    private String commentaire;
    private Boolean verrouille;

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
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
