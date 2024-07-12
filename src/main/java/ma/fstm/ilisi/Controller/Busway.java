package ma.fstm.ilisi.Controller;

import ma.fstm.ilisi.metier.bo.*;
import ma.fstm.ilisi.presentation.passager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Busway {
    public static Passager passager;
    private final ArrayList<Voyage> voyages;

    public Busway() {
        this.voyages = new ArrayList<>();
    }

    //***********************************************************************************************

    public void remplirVoyages() {
        // Créer des objets de voyage avec des données réelles
        Station A = new Station("A", 1, 1);
        Station B = new Station("B", 2, 2);
        Station C = new Station("C", 3, 3);
        Station D = new Station("D", 4, 4);
        Station E = new Station("E", 5, 5);

        Voyage voyage1 =
                new Voyage("voyage 1",
                        new Bus(1, 800, 0),
                        A,
                        D,
                        new Time(7, 00),
                        new Time(13, 00),
                        7,
                        0
                );
        Voyage voyage2 =
                new Voyage("voyage 2",
                        new Bus(1, 800, 50),
                        D,
                        A,
                        new Time(13, 00),
                        new Time(19, 00),
                        7,
                        1
                );
        Voyage voyage3 =
                new Voyage("voyage 3",
                        new Bus(2, 800, 60),
                        A,
                        D,
                        new Time(8, 30),
                        new Time(14, 30),
                        7,
                        0
                );
        Voyage voyage4 =
                new Voyage("voyage 4",
                        new Bus(2, 800, 60),
                        D,
                        A,
                        new Time(16, 30),
                        new Time(20, 30),
                        7,
                        -1
                );
        Voyage voyage5 =
                new Voyage("voyage 5",
                        new Bus(3, 50, 70),
                        E,
                        D,
                        new Time(16, 00),
                        new Time(18, 00),
                        7,
                        0
                );
        Voyage voyage6 =
                new Voyage("voyage 6",
                        new Bus(3, 50, 70),
                        D,
                        E,
                        new Time(18, 00),
                        new Time(20, 00),
                        7,
                        0
                );
        // Ajouter les stations et les arrêts correspondants à ce voyage
        // Supposons que vous avez déjà les stations et les arrêts

        voyage1.addStationDepart(A, new Arret(1, new Time(7, 0), A, voyage1));
        voyage1.addStationArret(B, new Arret(2, new Time(9, 0), B, voyage1));
        voyage1.addStationArret(C, new Arret(3, new Time(11, 0), C, voyage1));
        voyage1.addStationArrivee(D, new Arret(4, new Time(13, 0), D, voyage1));

        voyage2.addStationDepart(D, new Arret(4, new Time(13, 0), D, voyage2));
        voyage2.addStationArret(C, new Arret(3, new Time(15, 0), C, voyage2));
        voyage2.addStationArret(B, new Arret(2, new Time(17, 0), B, voyage2));
        voyage2.addStationArrivee(A, new Arret(1, new Time(19, 0), A, voyage2));

        voyage3.addStationDepart(A, new Arret(1, new Time(8, 30), A, voyage3));
        voyage3.addStationArret(B, new Arret(2, new Time(10, 0), B, voyage3));
        voyage3.addStationArret(C, new Arret(3, new Time(12, 0), C, voyage3));
        voyage3.addStationArrivee(D, new Arret(4, new Time(14, 30), D, voyage3));

        voyage4.addStationDepart(D, new Arret(4, new Time(14, 30), D, voyage4));
        voyage4.addStationArret(B, new Arret(2, new Time(16, 0), B, voyage4));
        voyage4.addStationArret(C, new Arret(3, new Time(18, 0), C, voyage4));
        voyage4.addStationArrivee(A, new Arret(1, new Time(20, 30), A, voyage4));

        voyage5.addStationDepart(E, new Arret(5, new Time(16, 0), E, voyage5));
        voyage5.addStationArret(B, new Arret(2, new Time(17, 0), B, voyage5));
        voyage5.addStationArrivee(D, new Arret(4, new Time(18, 0), D, voyage5));

        voyage6.addStationDepart(D, new Arret(4, new Time(18, 0), D, voyage6));
        voyage6.addStationArret(B, new Arret(2, new Time(19, 0), B, voyage6));
        voyage6.addStationArrivee(E, new Arret(5, new Time(20, 0), E, voyage6));

        // Ajoutez d'autres arrêts et stations au besoin

        // Ajouter le voyage à la liste des voyages
        voyages.add(voyage1);
        voyages.add(voyage2);
        voyages.add(voyage3);
        voyages.add(voyage4);
        voyages.add(voyage5);
        voyages.add(voyage6);
    }

    //************************************************************************************************************

    public void afficherStationsParVoyage() {
        for (Voyage voyage : voyages) {
            System.out.println("------------------------------------------------------------------------");
            System.out.println("Voyage: " + voyage.getIdVoyage());
            System.out.println("Stations parcourues:");

            // Récupérer la liste des arrêts du voyage
            ArrayList<Arret> arrets = voyage.getArrets();

            // Afficher chaque arrêt avec le nom de la station et l'heure d'arrêt
            for (Arret arret : arrets) {
                System.out.println("Station: " + arret.getStation().getNomStation() + ", Heure d'arrêt: " + arret.getTempsArret());
            }
            System.out.println("------------------------------------------------------------------------");
        }
    }

    public void afficherStationsDepartParVoyage() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Stations de départ par voyage:");
        for (Voyage voyage : voyages) {
            System.out.println("Voyage: " + voyage.getIdVoyage() + ", Station de départ: " + voyage.getDepart().getNomStation());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    public void afficherStationsArriveParVoyage() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Stations d'arrivée par voyage:");
        for (Voyage voyage : voyages) {
            System.out.println("Voyage: " + voyage.getIdVoyage() + ", Station d'arrivée: " + voyage.getArrivée().getNomStation());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    public void afficherListeVoyages() {
        // Print header
        System.out.println("List of Voyages:");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "ID", "Departure", "Arrival", "Price", "Status");
        System.out.println("------------------------------------------------------------------------");

        // Iterate over each voyage and print its details
        for (Voyage voyage : voyages) {
            System.out.printf("%-10s %-15s %-15s %-15s %-15s\n",
                    voyage.getIdVoyage(),
                    voyage.getHeureDepart(),
                    voyage.getHeureArrivee(),
                    voyage.getPrix(),
                    voyage.getStatut() == -1 ? "Hors Service/Terminated" :
                            (voyage.getStatut() == 0 ? "Ouvert pour Reservation" :
                                    (voyage.getStatut() == 1 ? "En cours" : "Unknown")));
        }
    }

    //******************************************************************************************************

    public void afficherVoyageParStation() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Voyages associés à chaque station :");

        // Utiliser un ensemble pour stocker les noms de station déjà traités
        Set<String> stationsTraitees = new HashSet<>();

        // Parcourir tous les voyages
        for (Voyage voyage : voyages) {
            // Récupérer la station de départ
            String stationDepart = voyage.getDepart().getNomStation();
            // Vérifier si la station de départ a déjà été traitée
            if (!stationsTraitees.contains(stationDepart)) {
                // Afficher les voyages associés à la station de départ
                System.out.println("Station : " + stationDepart);
                afficherVoyageAssocie(stationDepart);
                // Ajouter la station de départ à l'ensemble des stations traitées
                stationsTraitees.add(stationDepart);
            }

            // Récupérer les arrêts intermédiaires
            for (Arret arret : voyage.getArrets()) {
                String stationArret = arret.getStation().getNomStation();
                // Vérifier si la station d'arrêt a déjà été traitée
                if (!stationsTraitees.contains(stationArret)) {
                    // Afficher les voyages associés à la station d'arrêt
                    System.out.println("Station : " + stationArret);
                    afficherVoyageAssocie(stationArret);
                    // Ajouter la station d'arrêt à l'ensemble des stations traitées
                    stationsTraitees.add(stationArret);
                }
            }

            // Récupérer la station d'arrivée
            String stationArrivee = voyage.getArrivée().getNomStation();
            // Vérifier si la station d'arrivée a déjà été traitée
            if (!stationsTraitees.contains(stationArrivee)) {
                // Afficher les voyages associés à la station d'arrivée
                System.out.println("Station : " + stationArrivee);
                afficherVoyageAssocie(stationArrivee);
                // Ajouter la station d'arrivée à l'ensemble des stations traitées
                stationsTraitees.add(stationArrivee);
            }
        }

        System.out.println("------------------------------------------------------------------------");
    }

    private void afficherVoyageAssocie(String nomStation) {
        for (Voyage voyage : voyages) {
            if (voyage.getDepart().getNomStation().equals(nomStation) ||
                    voyage.getArrivée().getNomStation().equals(nomStation)) {
                System.out.println("  - Voyage : " + voyage.getIdVoyage());
            } else {
                for (Arret arret : voyage.getArrets()) {
                    if (arret.getStation().getNomStation().equals(nomStation)) {
                        System.out.println("  - Voyage : " + voyage.getIdVoyage());
                        break;
                    }
                }
            }
        }
    }

        //*********************************************************************
        ///////////////////////////////////////////////////////////
        public static void main(String[] args) {
            //*******************************************************************************************
            Busway B = new Busway();
            B.remplirVoyages();

            // Afficher la liste des voyages
            B.afficherListeVoyages();

            // Afficher les stations par voyage
            B.afficherStationsParVoyage();
            B.afficherStationsDepartParVoyage();
            B.afficherStationsArriveParVoyage();

            // Afficher les voyages associés à chaque station
            B.afficherVoyageParStation();
        }

}
