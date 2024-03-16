/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

/**
 *
 * @author dell
 */
public class CompteBancaire {//A revoir
    private String numCarte;
     private String code;

    public CompteBancaire(String numCarte, String code) {
        this.numCarte = numCarte;
        this.code = code;
    }

    public String getNumCarte() {
        return numCarte;
    }

    public void setNumCarte(String numCarte) {
        this.numCarte = numCarte;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
  
    public void retrait()
    {
        
    }
    
    
  }
