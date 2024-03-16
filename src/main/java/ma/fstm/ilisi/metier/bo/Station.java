/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

// B->C    // V1="A B C D"    V2="D C B A"  V3 = " A B H C "==>>   "B C D" || " B A" || "B H C"=>   "B C"  "B H C"
public class Station {
    private String Nom;  
    ArrayList<Voyage> Voyages=new ArrayList<>() ;//
    private Arret HeureArret;
    private int  Longitude;
    private int Latitude;






    @Override
    public String toString() {
        return "Station{" + "Nom=" + Nom + ", Voyages=" + Voyages + ", HeureArret=" + HeureArret + '}';
    }

    public Arret getHeureArret() {
        return HeureArret;
    }

    public void setHeureArret(Arret HeureArret) {
        this.HeureArret = HeureArret;
    }
    
    
   public Station(String nom) {
        this.Nom = nom; 
    }
    
    
public ArrayList<Voyage> VerifierDepart(String depart, ArrayList<Voyage> Voyages) {
    ArrayList<Voyage> NouveauVoyageDepart = new ArrayList<>();

    // Parcourir chaque voyage dans la liste de voyages
    System.out.println(Voyages.size());
    for (Voyage voyage : Voyages) {
        // Récupérer les stations du voyage
        LinkedHashMap<Station, Arret> arretsParStation = voyage.getArretsParStation();

        // Vérifier si la première station du voyage correspond à la station de départ
        for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
            if (entry.getKey().getNom().equals(depart)) {
                // Si c'est le cas, créer un nouveau voyage qui commence à partir de la station de départ
                Voyage nouveauVoyage = new Voyage(voyage.getId(), voyage.getBus(),
                        voyage.getHeureD(), voyage.getHeureA(),voyage.getPrix());
                // Ajouter les arrêts à partir de la station de départ jusqu'à la fin du voyage
                boolean debutTrouve = false;
                for (Map.Entry<Station, Arret> arretEntry : arretsParStation.entrySet()) {
                    if (debutTrouve) {
                         System.out.println("chaabi");
                        // Ajouter les arrêts à partir de la station de départ jusqu'à la fin du voyage
                        nouveauVoyage.addArret(arretEntry.getKey(), arretEntry.getValue());
                    } else if (arretEntry.getKey().getNom().equals(depart)) {
                            System.out.println("amall");
                        // Marquer le début du voyage à partir de la station de départ
                        debutTrouve = true;
                        nouveauVoyage.addArret(arretEntry.getKey(), arretEntry.getValue());
                    }
                }
                // Ajouter le nouveau voyage à la liste des nouveaux voyages
                NouveauVoyageDepart.add(nouveauVoyage);
                break; // Sortir de la boucle pour éviter d'ajouter plusieurs fois le même voyage
            }
        }
    }
    return NouveauVoyageDepart;
}
 
public ArrayList<Voyage> VerifierDestination(String arrive, ArrayList<Voyage> NouveauVoyageDepart) {
    ArrayList<Voyage> NouveauVoyageDepartDestination = new ArrayList<>();
    
    // Parcourir chaque voyage dans la liste de NouveauVoyageDepart
    for (Voyage voyage : NouveauVoyageDepart) {
        // Récupérer les arrêts associés à chaque station pour ce voyage
        LinkedHashMap<Station, Arret> arretsParStation = voyage.getArretsParStation();
        
        // Créer un nouveau voyage pour stocker les arrêts jusqu'à la station d'arrivée
        Voyage nouveauVoyage = new Voyage(voyage.getId(),voyage.getBus(), voyage.getHeureD(), voyage.getHeureA(),voyage.getPrix());
        
        // Ajouter les arrêts jusqu'à la station d'arrivée
        boolean destinationTrouvee = false;
        for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
            Station station = entry.getKey();
            Arret arret = entry.getValue();
            
            // Ajouter l'arrêt à chaque itération
            nouveauVoyage.addArret(station, arret);
            
            // Vérifier si la station actuelle est la station d'arrivée
            if (station.getNom().equals(arrive)) {
                destinationTrouvee = true;
                break;
            }
        }
        
        // Ajouter le voyage filtré à la liste des voyages filtrés si la destination est trouvée
        if (destinationTrouvee) {
            NouveauVoyageDepartDestination.add(nouveauVoyage);
        }
    }
    
    return NouveauVoyageDepartDestination;
}


public void afficherArretsParVoyage() {
     
    for (Voyage voyage : Voyages) {
        System.out.println("Voyage " + voyage.getId() + ":");
        Map<Station, Arret> arretsParStation = voyage.getArretsParStation();
       
        for (Map.Entry<Station, Arret> entry : arretsParStation.entrySet()) {
            Station station = entry.getKey();
            Arret arret = entry.getValue();
            System.out.println("    Station: " + station.getNom() + ", Arrêt: " + arret.getHeureArret() + ":" + arret.getMinArret());
        }
    }
}
    public Station(){
        
    }
 

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public ArrayList<Voyage> getVoyages() {
        return Voyages;
    }

    public void setVoyages(ArrayList<Voyage> Voyages) {
        this.Voyages = Voyages;
    }

    void addVoyages(Voyage aThis) {
        this.Voyages.add(aThis);
    }

 
    
 

    
}
