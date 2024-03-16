/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

import java.util.LinkedHashMap;
import java.util.Map;

// V1="A B C D"    V2="D C B A"   =?>   B C 
public class Voyage {
    private String id;
      private Bus Bus;//
      private Time HeureD;
       private Time HeureA;
      private LinkedHashMap<Station, Arret> arretsParStation;
     private Double Prix;
     private int Duree;

    //*************************************







     /*
         public LinkedHashMap<Station, Arret> getArretsParStation() {
        return arretsParStation;
    }

     */
     
     public Voyage(){

     }
    private int diff(int hour1, int min1, int hour2, int min2) {
        // Convertir les deux heures en minutes
        int totalMin1 = hour1 * 60 + min1;
        int totalMin2 = hour2 * 60 + min2;

        // Calculer la différence en minutes
        int difference = totalMin2 - totalMin1;

        return difference;
    }
     
    public int dureeVoyage(Station depart,Station arrive){   // A B C D  E  F=>      B C D E  => 
        Arret a=new Arret();
        Arret b=new Arret();
        for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
               if(entry.getKey().getNom().equals(depart.getNom())) a=entry.getValue();
               if(entry.getKey().getNom().equals(arrive.getNom())) b=entry.getValue();       
        }
        return diff(a.getHeureArret(),a.getMinArret(),b.getHeureArret(),b.getMinArret());
    }
     
     
    public int getDuree() {
        return Duree;
    }

    public void setDuree(int Duree) {
        this.Duree = Duree;
    }


      
   
      
      
      public Double getPrix() {
        return Prix;
    }

    public void setPrix(Double Prix) {
        this.Prix = Prix;
    }
     
      
      public void afficherArretsParStation() {
    System.out.println("Arrêts par station pour le voyage " + id + ":");
    for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
        Station station = entry.getKey();
        Arret arret = entry.getValue();
        System.out.println("Station: " + station.getNom() + ", Arrêt: " + arret.getHeureArret() + ":" + arret.getMinArret());
    }
      }
      
      public void afficherDetails() {
        System.out.println("ID: " + id);
        System.out.println("Bus: " + Bus); // Vous devrez peut-être implémenter une méthode toString() dans la classe Bus
        System.out.println("Heure de départ: " + HeureD.getHeure() + ":" + HeureD.getMin());
        System.out.println("Heure d'arrivée: " + HeureA.getHeure() + ":" + HeureA.getMin());

        System.out.println("Arrêts par station:");
        for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
            Station station = entry.getKey();
            Arret arret = entry.getValue();
            System.out.println("  Station: " + station.getNom());
            System.out.println("    Heure d'arrêt: " + arret.getHeureArret() + ":" + arret.getMinArret());
            // Vous pouvez afficher d'autres informations sur l'arrêt ici si nécessaire
        }
    }
      
      

    public LinkedHashMap<Station, Arret> getArretsParStation() {
        return arretsParStation;
    }

    public void setArretsParStation(LinkedHashMap<Station, Arret> arretsParStation) {
        this.arretsParStation = arretsParStation;
    }

      public Voyage(String id, Bus Bus, Time HeureD, Time HeureA, Double prix) {
        this.id = id;
        this.Bus = Bus;
        this.HeureD = HeureD;
        this.HeureA = HeureA;
         this.arretsParStation = new LinkedHashMap<>();
         this.Prix=prix;
  
         
    }
public int getLongueurVoyage(String depart, String arrivee) {
    int longueur = 0;
    boolean commence = false;

    // Parcourir les stations du voyage
    for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
        Station station = entry.getKey();

        // Si on trouve la station de départ, on commence à compter la longueur du voyage
        if (station.getNom().equals(depart)) {
            commence = true;
        }

        // Si on a déjà commencé et qu'on n'a pas encore atteint la station d'arrivée, on incrémente la longueur
        if (commence && !station.getNom().equals(arrivee)) {
            longueur++;
        }

        // Si on atteint la station d'arrivée, on arrête le calcul de la longueur
        if (station.getNom().equals(arrivee)) {
            break;
        }
    }

    return longueur;
}
      public void addArret(Station station, Arret arret) {
        arretsParStation.put(station, arret);
    }
      
     public void addStation(String nom, Arret ar){
         Station s=new Station(nom);
         s.addVoyages(this);
         arretsParStation.put(s,ar);
     }
 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bus getBus() {
        return Bus;
    }

    public void setBus(Bus Bus) {
        this.Bus = Bus;
    }



    public Time getHeureD() {
        return HeureD;
    }

    public void setHeureD(Time HeureD) {
        this.HeureD = HeureD;
    }

    public Time getHeureA() {
        return HeureA;
    }

    public void setHeureA(Time HeureA) {
        this.HeureA = HeureA;
    }


    
    public Map.Entry<Station, Arret> premierArret() {
        return arretsParStation.entrySet().iterator().next();
    }

    public Map.Entry<Station, Arret> dernierArret() {
        Map.Entry<Station, Arret> dernier = null;
        for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
            dernier = entry;
        }
        return dernier;
    }

   
      
    
}