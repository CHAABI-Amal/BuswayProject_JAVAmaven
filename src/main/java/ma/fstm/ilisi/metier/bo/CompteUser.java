/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

/**
 *
 * @author dell
 */
public class CompteUser {
   private String nom;
    private String prenom;
    private String pwd;
    private String Gmail;

    @Override
    public String toString() {
        return "Passager{" + "nom=" + nom + ", prenom=" + prenom + ", pwd=" + pwd + ", Gmail=" + Gmail + '}';
    }

    
   
    
    
    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }
    
    public CompteUser(String nom, String prenom, String numeroTelephone,String gmail) {
        this.nom = nom;
        this.prenom = prenom;
        this.pwd= numeroTelephone;
        this.Gmail=gmail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String numeroTelephone) {
        this.pwd = numeroTelephone;
    }
    
    
    
}
