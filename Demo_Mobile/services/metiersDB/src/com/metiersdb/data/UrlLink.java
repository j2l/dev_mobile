
package com.metiersdb.data;

import java.util.Date;


/**
 *  metiersDB.UrlLink
 *  09/18/2012 17:49:53
 * 
 */
public class UrlLink {

    private Integer urlId;
    private String urlRole;
    private String urlCategorie;
    private String urlNom;
    private String urlText;
    private String urlEnv;
    private Date urlValidite;
    private String urlComment;

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public String getUrlRole() {
        return urlRole;
    }

    public void setUrlRole(String urlRole) {
        this.urlRole = urlRole;
    }

    public String getUrlCategorie() {
        return urlCategorie;
    }

    public void setUrlCategorie(String urlCategorie) {
        this.urlCategorie = urlCategorie;
    }

    public String getUrlNom() {
        return urlNom;
    }

    public void setUrlNom(String urlNom) {
        this.urlNom = urlNom;
    }

    public String getUrlText() {
        return urlText;
    }

    public void setUrlText(String urlText) {
        this.urlText = urlText;
    }

    public String getUrlEnv() {
        return urlEnv;
    }

    public void setUrlEnv(String urlEnv) {
        this.urlEnv = urlEnv;
    }

    public Date getUrlValidite() {
        return urlValidite;
    }

    public void setUrlValidite(Date urlValidite) {
        this.urlValidite = urlValidite;
    }

    public String getUrlComment() {
        return urlComment;
    }

    public void setUrlComment(String urlComment) {
        this.urlComment = urlComment;
    }

}
