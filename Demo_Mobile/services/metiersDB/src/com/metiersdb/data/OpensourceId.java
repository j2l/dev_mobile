
package com.metiersdb.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  metiersDB.OpensourceId
 *  09/18/2012 17:49:53
 * 
 */
public class OpensourceId
    implements Serializable
{

    private Integer refOpenSource;
    private String nomSolution;
    private String societe;
    private String fonction;
    private String description;
    private String environnements;
    private String plateForme;
    private String langage;
    private String licence;
    private Date dateFondation;
    private Integer nbInstallation;
    private String siteUrl;
    private String downloadUrl;
    private String version;
    private Date dateVersion;
    private String liensUtiles;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpensourceId)) {
            return false;
        }
        OpensourceId other = ((OpensourceId) o);
        if (this.refOpenSource == null) {
            if (other.refOpenSource!= null) {
                return false;
            }
        } else {
            if (!this.refOpenSource.equals(other.refOpenSource)) {
                return false;
            }
        }
        if (this.nomSolution == null) {
            if (other.nomSolution!= null) {
                return false;
            }
        } else {
            if (!this.nomSolution.equals(other.nomSolution)) {
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
        if (this.fonction == null) {
            if (other.fonction!= null) {
                return false;
            }
        } else {
            if (!this.fonction.equals(other.fonction)) {
                return false;
            }
        }
        if (this.description == null) {
            if (other.description!= null) {
                return false;
            }
        } else {
            if (!this.description.equals(other.description)) {
                return false;
            }
        }
        if (this.environnements == null) {
            if (other.environnements!= null) {
                return false;
            }
        } else {
            if (!this.environnements.equals(other.environnements)) {
                return false;
            }
        }
        if (this.plateForme == null) {
            if (other.plateForme!= null) {
                return false;
            }
        } else {
            if (!this.plateForme.equals(other.plateForme)) {
                return false;
            }
        }
        if (this.langage == null) {
            if (other.langage!= null) {
                return false;
            }
        } else {
            if (!this.langage.equals(other.langage)) {
                return false;
            }
        }
        if (this.licence == null) {
            if (other.licence!= null) {
                return false;
            }
        } else {
            if (!this.licence.equals(other.licence)) {
                return false;
            }
        }
        if (this.dateFondation == null) {
            if (other.dateFondation!= null) {
                return false;
            }
        } else {
            if (!this.dateFondation.equals(other.dateFondation)) {
                return false;
            }
        }
        if (this.nbInstallation == null) {
            if (other.nbInstallation!= null) {
                return false;
            }
        } else {
            if (!this.nbInstallation.equals(other.nbInstallation)) {
                return false;
            }
        }
        if (this.siteUrl == null) {
            if (other.siteUrl!= null) {
                return false;
            }
        } else {
            if (!this.siteUrl.equals(other.siteUrl)) {
                return false;
            }
        }
        if (this.downloadUrl == null) {
            if (other.downloadUrl!= null) {
                return false;
            }
        } else {
            if (!this.downloadUrl.equals(other.downloadUrl)) {
                return false;
            }
        }
        if (this.version == null) {
            if (other.version!= null) {
                return false;
            }
        } else {
            if (!this.version.equals(other.version)) {
                return false;
            }
        }
        if (this.dateVersion == null) {
            if (other.dateVersion!= null) {
                return false;
            }
        } else {
            if (!this.dateVersion.equals(other.dateVersion)) {
                return false;
            }
        }
        if (this.liensUtiles == null) {
            if (other.liensUtiles!= null) {
                return false;
            }
        } else {
            if (!this.liensUtiles.equals(other.liensUtiles)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.refOpenSource!= null) {
            rtn = (rtn + this.refOpenSource.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nomSolution!= null) {
            rtn = (rtn + this.nomSolution.hashCode());
        }
        rtn = (rtn* 37);
        if (this.societe!= null) {
            rtn = (rtn + this.societe.hashCode());
        }
        rtn = (rtn* 37);
        if (this.fonction!= null) {
            rtn = (rtn + this.fonction.hashCode());
        }
        rtn = (rtn* 37);
        if (this.description!= null) {
            rtn = (rtn + this.description.hashCode());
        }
        rtn = (rtn* 37);
        if (this.environnements!= null) {
            rtn = (rtn + this.environnements.hashCode());
        }
        rtn = (rtn* 37);
        if (this.plateForme!= null) {
            rtn = (rtn + this.plateForme.hashCode());
        }
        rtn = (rtn* 37);
        if (this.langage!= null) {
            rtn = (rtn + this.langage.hashCode());
        }
        rtn = (rtn* 37);
        if (this.licence!= null) {
            rtn = (rtn + this.licence.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateFondation!= null) {
            rtn = (rtn + this.dateFondation.hashCode());
        }
        rtn = (rtn* 37);
        if (this.nbInstallation!= null) {
            rtn = (rtn + this.nbInstallation.hashCode());
        }
        rtn = (rtn* 37);
        if (this.siteUrl!= null) {
            rtn = (rtn + this.siteUrl.hashCode());
        }
        rtn = (rtn* 37);
        if (this.downloadUrl!= null) {
            rtn = (rtn + this.downloadUrl.hashCode());
        }
        rtn = (rtn* 37);
        if (this.version!= null) {
            rtn = (rtn + this.version.hashCode());
        }
        rtn = (rtn* 37);
        if (this.dateVersion!= null) {
            rtn = (rtn + this.dateVersion.hashCode());
        }
        rtn = (rtn* 37);
        if (this.liensUtiles!= null) {
            rtn = (rtn + this.liensUtiles.hashCode());
        }
        return rtn;
    }

    public Integer getRefOpenSource() {
        return refOpenSource;
    }

    public void setRefOpenSource(Integer refOpenSource) {
        this.refOpenSource = refOpenSource;
    }

    public String getNomSolution() {
        return nomSolution;
    }

    public void setNomSolution(String nomSolution) {
        this.nomSolution = nomSolution;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnvironnements() {
        return environnements;
    }

    public void setEnvironnements(String environnements) {
        this.environnements = environnements;
    }

    public String getPlateForme() {
        return plateForme;
    }

    public void setPlateForme(String plateForme) {
        this.plateForme = plateForme;
    }

    public String getLangage() {
        return langage;
    }

    public void setLangage(String langage) {
        this.langage = langage;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public Date getDateFondation() {
        return dateFondation;
    }

    public void setDateFondation(Date dateFondation) {
        this.dateFondation = dateFondation;
    }

    public Integer getNbInstallation() {
        return nbInstallation;
    }

    public void setNbInstallation(Integer nbInstallation) {
        this.nbInstallation = nbInstallation;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDateVersion() {
        return dateVersion;
    }

    public void setDateVersion(Date dateVersion) {
        this.dateVersion = dateVersion;
    }

    public String getLiensUtiles() {
        return liensUtiles;
    }

    public void setLiensUtiles(String liensUtiles) {
        this.liensUtiles = liensUtiles;
    }

}
