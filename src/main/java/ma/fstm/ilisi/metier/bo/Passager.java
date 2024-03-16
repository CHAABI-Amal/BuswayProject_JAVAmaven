/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

/**
 *
 * @author dell
 */
public class Passager {
    private String nom;
    private String prenom;
    private String numeroTelephone;
    private String Gmail;
    private int  Longitude;
    private int Latitude;




    @Override
    public String toString() {
        return "Passager{" + "nom=" + nom + ", prenom=" + prenom + ", numeroTelephone=" + numeroTelephone + ", Gmail=" + Gmail + '}';
    }

    
   
    
    
    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String Gmail) {
        this.Gmail = Gmail;
    }
    
    public Passager(String nom, String prenom, String numeroTelephone,String gmail) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTelephone = numeroTelephone;
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

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
    
    
}
