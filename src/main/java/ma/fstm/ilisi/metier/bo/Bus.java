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
    private int IdBus;//pas besoin
    private int NumeroBus;//
    private int Capacite;//
    private int NombrePlaceLibre;//?
    private ArrayList<Voyage> Voyages;//
    //******************************************************************

    public Bus() {
    }

    public Bus(int idBus, int numeroBus, int capacite) {
        IdBus = idBus;
        NumeroBus = numeroBus;
        Capacite = capacite;
        NombrePlaceLibre = Capacite;
        this.Voyages = Voyages;
    }

    public int getIdBus() {
        return IdBus;
    }

    public void setIdBus(int idBus) {
        IdBus = idBus;
    }

    public int getNumeroBus() {
        return NumeroBus;
    }

    public void setNumeroBus(int numeroBus) {
        NumeroBus = numeroBus;
    }

    public int getCapacite() {
        return Capacite;
    }

    public void setCapacite(int capacite) {
        Capacite = capacite;
    }

    public int getNombrePlaceLibre() {
        return NombrePlaceLibre;
    }

    public void setNombrePlaceLibre(int nombrePlaceLibre) {
        NombrePlaceLibre = nombrePlaceLibre;
    }

    public ArrayList<Voyage> getVoyages() {
        return Voyages;
    }

    public void setVoyages(ArrayList<Voyage> voyages) {
        Voyages = voyages;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "IdBus=" + IdBus +
                ", NumeroBus=" + NumeroBus +
                ", Capacite=" + Capacite +
                ", NombrePlaceLibre=" + NombrePlaceLibre +
                ", Voyages=" + Voyages +
                '}';
    }

    public void decrementer()
     {
         this.NombrePlaceLibre--;
     }
    

   
    
}
