
package com.metiersdb.data;

import java.io.Serializable;


/**
 *  metiersDB.TachesId
 *  09/18/2012 17:49:53
 * 
 */
public class TachesId
    implements Serializable
{

    private String liste;
    private String tache;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TachesId)) {
            return false;
        }
        TachesId other = ((TachesId) o);
        if (this.liste == null) {
            if (other.liste!= null) {
                return false;
            }
        } else {
            if (!this.liste.equals(other.liste)) {
                return false;
            }
        }
        if (this.tache == null) {
            if (other.tache!= null) {
                return false;
            }
        } else {
            if (!this.tache.equals(other.tache)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.liste!= null) {
            rtn = (rtn + this.liste.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tache!= null) {
            rtn = (rtn + this.tache.hashCode());
        }
        return rtn;
    }

    public String getListe() {
        return liste;
    }

    public void setListe(String liste) {
        this.liste = liste;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

}
