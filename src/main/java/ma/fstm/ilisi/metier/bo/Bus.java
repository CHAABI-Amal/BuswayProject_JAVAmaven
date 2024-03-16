/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Bus {
    private int IdBus;
    private int NumeroBus;
    private int Capacite;
    private int NombrePlaceLibre;
    private ArrayList<Voyage> Voyages;
    
    public Bus(int IdBus, int NumeroBus, int Capacite) {
        this.IdBus = IdBus;
        this.NumeroBus = NumeroBus;
        this.Capacite = Capacite;
        this.NombrePlaceLibre = Capacite;
        this.Voyages = Voyages;
    }
    public void decrementer()
     {
         this.NombrePlaceLibre--;
     }
    

    public int getIdBus() {
        return IdBus;
    }

    public void setIdBus(int IdBus) {
        this.IdBus = IdBus;
    }

    public int getNumeroBus() {
        return NumeroBus;
    }

    public void setNumeroBus(int NumeroBus) {
        this.NumeroBus = NumeroBus;
    }

    public int getCapacite() {
        return Capacite;
    }

    public void setCapacite(int Capacite) {
        this.Capacite = Capacite;
    }

    public int getNombrePlaceLibre() {
        return NombrePlaceLibre;
    }

    public void setNombrePlaceLibre(int NombrePlaceLibre) {
        this.NombrePlaceLibre = NombrePlaceLibre;
    }

    public ArrayList<Voyage> getVoyages() {
        return Voyages;
    }

    public void setVoyages(ArrayList<Voyage> Voyages) {
        this.Voyages = Voyages;
    }

    @Override
    public String toString() {
        return "Bus{" + "IdBus=" + IdBus + ", NumeroBus=" + NumeroBus + ", Capacite=" + Capacite + ", NombrePlaceLibre=" + NombrePlaceLibre + ", Voyages=" + Voyages + '}';
    }
  
   
    
}
