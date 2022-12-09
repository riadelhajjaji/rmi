import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable {
    int code ;
    double solde;
    Date dateCreation;
    public Compte() {

    }

    public Compte(int code) {
        this.code = code;
    }

    public Compte(double solde) {
        this.solde = solde;
    }

    public Compte(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public int getCode() {
        return code;
    }
}
