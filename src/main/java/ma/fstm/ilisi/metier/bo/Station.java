package ma.fstm.ilisi.metier.bo;

import java.util.ArrayList;


// B->C    // V1="A B C D"    V2="D C B A"  V3 = " A B H C "==>>   "B C D" || " B A" || "B H C"=>   "B C"  "B H C"
public class Station {
    private String nomStation;
    private ArrayList<Voyage> voyage_departs;//zadt
    private ArrayList<Voyage> voyage_arrivee;//zadt

    private ArrayList<Arret> voyageArrets;//zadt
    private ArrayList<Reservation> ReserveFrom;//zadt
    private ArrayList<Reservation> ReserveTO;//zadt
    private float latitude;//
    private float longitude;//
// station A: voyage_depart: voyage1,voyage3    voyage_arrive: voyage2,voyage4
// station B: voyage_depart: null    voyage_arrive: voyage2,voyage4

    //*************************************************************

    public Station(String nomStation,
                   float latitude,
                   float longitude) {
        this.nomStation = nomStation;
        this.voyage_arrivee = new ArrayList<>();
        this.voyage_departs = new ArrayList<>();
        this.voyageArrets = new ArrayList<>(); // Initialisation de la liste voyageArrets
        this.ReserveFrom = new ArrayList<>(); // Initialisation de la liste ReserveFrom
        this.ReserveTO = new ArrayList<>(); // Initialisation de la liste ReserveTO

        this.latitude = latitude;
        this.longitude = longitude;
    }

    //****************************************************************

    void addVoyageArrets(Arret arr){
        this.voyageArrets.add(arr);

    }
   /* */

    public void addVoyageArrivee(Voyage voyage) {
        voyage_arrivee.add(voyage);
    }

    public void addVoyageDepart(Voyage voyage) {
        voyage_departs.add(voyage);
    }




    //*************************************************************

    public String getNomStation() {
        return nomStation;
    }

    public void setNomStation(String nomStation) {
        this.nomStation = nomStation;
    }


    public ArrayList<Voyage> getVoyage_arrivee() {
        return voyage_arrivee;
    }

    public void setVoyage_arrivee(ArrayList<Voyage> voyage_arrivee) {
        this.voyage_arrivee = voyage_arrivee;
    }

    public ArrayList<Voyage> getVoyage_departs() {
        return voyage_departs;
    }

    public void setVoyage_departs(ArrayList<Voyage> voyage_departs) {
        this.voyage_departs = voyage_departs;
    }

    public ArrayList<Arret> getVoyageArrets() {
        return voyageArrets;
    }

    public void setVoyageArrets(ArrayList<Arret> voyageArrets) {
        this.voyageArrets = voyageArrets;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }






}