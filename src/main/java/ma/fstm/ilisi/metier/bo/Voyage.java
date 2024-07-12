/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

import java.util.ArrayList;

// V1="A B C D"    V2="D C B A"   =?>   B C 
public class Voyage {
    private String idVoyage;
    private Bus Bus;//
    private int statut;
    //-1:Hors Service ou voyage termine,
    //0:voyage ouvert a la reservation(n'a pas encore fait le depart)
    //1:voyage en cours (il a fait le depart)
    private Time HeureDepart;
    private Time HeureArrivee;
    private float Prix;
    private int Duree;
    private Station depart;
    private Station arrivée;
    private ArrayList<Arret> arrets;
    private ArrayList<Reservation> reservations;

    //*************

    public Voyage() {
    }

    public Voyage(
            String idVoyage,
            Bus bus,
            Station Stationdepart,
            Station Stationarrivée,
            Time heureDepart,
            Time heureArrivee,
            float prix,
            int statut
    ) {
        this.idVoyage = idVoyage;
        Bus = bus;
        this.statut = statut;
        HeureDepart = heureDepart;
        HeureArrivee = heureArrivee;
        Prix = prix;
        Duree = Duree;
        this.depart = Stationdepart;
        this.arrivée = Stationarrivée;
        this.arrets = new ArrayList<>(); // Initialiser la liste des arrêts
        this.reservations = new ArrayList<>();
    }
    //***********************************************************************************

    public void addStationArret(Station s, Arret ar){
        this.arrets.add(ar);
        s.addVoyageArrets(ar);


    }/**/

//voyage1= A->B->C-> D : Staionarret =A,B,C,D, Stationdepart=A  ,  StationArrive=D
// voyage_arret par station{ stationA : voyageArret{v1,v2,v3,v4} stationB :{v1,v2,v3,v4,v5,v6}  stationE: voyageArret{v5,v6}}
// voyage_depart par station{stationA :  {v1,v3} stationB {null} }
    //voyage_arrive par station{stationA :{v1}}


    public void addStationDepart(Station station, Arret ar) {
        this.arrets.add(ar);
        station.addVoyageDepart(this);
    }

    public void addStationArrivee(Station station, Arret ar) {
        this.arrets.add(ar);
        station.addVoyageArrivee(this);
    }

    //*************************************************************************************
    public String getIdVoyage() {
        return idVoyage;
    }

    public void setIdVoyage(String idVoyage) {
        this.idVoyage = idVoyage;
    }


    public Bus getBus() {
        return Bus;
    }

    public void setBus(Bus bus) {
        Bus = bus;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public Time getHeureDepart() {
        return HeureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        HeureDepart = heureDepart;
    }

    public Time getHeureArrivee() {
        return HeureArrivee;
    }

    public void setHeureArrivee(Time heureArrivee) {
        HeureArrivee = heureArrivee;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float prix) {
        Prix = prix;
    }

    public int getDuree() {
        return Duree;
    }

    public void setDuree(int duree) {
        Duree = duree;
    }

    public Station getDepart() {
        return depart;
    }

    public void setDepart(Station depart) {
        this.depart = depart;
    }

    public Station getArrivée() {
        return arrivée;
    }

    public void setArrivée(Station arrivée) {
        this.arrivée = arrivée;
    }

    public ArrayList<Arret> getArrets() {
        return arrets;
    }

    public void setArrets(ArrayList<Arret> arrets) {
        this.arrets = arrets;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return "Voyage{" +
                "idVoyage='" + idVoyage + '\'' +
                ", Bus=" + Bus +
                ", statut=" + statut +
                ", HeureDepart=" + HeureDepart +
                ", HeureArrivee=" + HeureArrivee +
                ", Prix=" + Prix +
                ", Duree=" + Duree +
                ", depart=" + depart +
                ", arrivée=" + arrivée +
                ", arrets=" + arrets +
                ", reservations=" + reservations +
                '}';
    }
}