/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

/**
 *
 * @author dell
 */
public class Reservation {
   private Passager ReservePassager;
   private Voyage ReserveVoyage;
   private Station ReserveFrom;
   private Station ReserveTo;
   
    public Reservation(){

    }
    public Reservation(Passager ReservePassager, Voyage ReserveVoyage, Station ReserveFrom, Station ReserveTo) {
        this.ReservePassager = ReservePassager;
        this.ReserveVoyage = ReserveVoyage;
        this.ReserveFrom = ReserveFrom;
        this.ReserveTo = ReserveTo;
    }

    @Override
    public String toString() {
        return "Reservation{" + "ReservePassager=" + ReservePassager + ", ReserveVoyage=" + ReserveVoyage + ", ReserveFrom=" + ReserveFrom + ", ReserveTo=" + ReserveTo + '}';
    }
   

    public Passager getReservePassager() {
        return ReservePassager;
    }

    public void setReservePassager(Passager ReservePassager) {
        this.ReservePassager = ReservePassager;
    }

    public Voyage getReserveVoyage() {
        return ReserveVoyage;
    }

    public void setReserveVoyage(Voyage ReserveVoyage) {
        this.ReserveVoyage = ReserveVoyage;
    }

    public Station getReserveFrom() {
        return ReserveFrom;
    }

    public void setReserveFrom(Station ReserveFrom) {
        this.ReserveFrom = ReserveFrom;
    }

    public Station getReserveTo() {
        return ReserveTo;
    }

    public void setReserveTo(Station ReserveTo) {
        this.ReserveTo = ReserveTo;
    }
 
   
   
}
