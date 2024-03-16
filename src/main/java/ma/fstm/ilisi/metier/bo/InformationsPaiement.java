/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

public class InformationsPaiement {
    private long numeroCarte;
    private int cvv;

    // Constructeur
    public InformationsPaiement(long numeroCarte,  int cvv) {
      
        this.numeroCarte = numeroCarte;
       
        this.cvv = cvv;
    }

    // Getters et setters
 
    public long getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(long numeroCarte) {
        this.numeroCarte = numeroCarte;
    }


    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
