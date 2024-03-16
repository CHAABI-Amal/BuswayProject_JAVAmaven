package ma.fstm.ilisi.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import ma.fstm.ilisi.metier.bo.*;

import ma.fstm.ilisi.presentation.Recherche;

public class Busway {
    private final ArrayList<Voyage> voyages;
    private Station station;
    private ArrayList<String> resultats;
    public ArrayList<Voyage> VoyageConvonable;
    private Passager passager;
    public static Voyage voyageReserver;
    private Reservation reservation;
    private ArrayList<InformationsPaiement> InfoPaiement;
    public static CompteBancaire compte;
    private ArrayList<CompteUser> comptesUtilisateurs;

    //----------------------------------------------------------------------------------------------

    public ArrayList<InformationsPaiement> getInfoPaiement() {
        return InfoPaiement;
    }

    public void setInfoPaiement(ArrayList<InformationsPaiement> InfoPaiement) {
        this.InfoPaiement = InfoPaiement;
    }

    public ArrayList<CompteUser> getComptesUtilisateurs() {
        return comptesUtilisateurs;
    }

    public void setComptesUtilisateurs(ArrayList<CompteUser> comptesUtilisateurs) {
        this.comptesUtilisateurs = comptesUtilisateurs;
    }


    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Voyage getVoyage1() {
        return voyage1;
    }

    public void setVoyage1(Voyage voyage1) {
        this.voyage1 = voyage1;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public ArrayList<String> getResultats() {
        return resultats;
    }

    public void setResultats(ArrayList<String> resultats) {
        this.resultats = resultats;
    }

    public Busway() {
        this.voyages = new ArrayList<>();
        this.resultats = new ArrayList<>();
        this.VoyageConvonable= new ArrayList<>();
        this.InfoPaiement= new ArrayList<>();
        this.comptesUtilisateurs=new ArrayList<>();
    }

    Voyage voyage1;


    public void remplirInfoPaiement()
    {


        InformationsPaiement informationsPaiement1 = new InformationsPaiement(123, 123);
        InformationsPaiement informationsPaiement2 = new InformationsPaiement(1234,1234);
        InfoPaiement.add(informationsPaiement1);
        InfoPaiement.add(informationsPaiement2);

    }

    public void remplirPassager(){
        passager = new Passager("amal","amal","060606060","amal@gmail.com");

    }


    public void remplirVoyages() {
        // Créer des objets de voyage avec des données réelles
        voyage1 =
                new Voyage("1",
                        new Bus(1, 800, 0),
                        new Time(7, 00),
                        new Time(10, 00),
                        10.
                );
        Voyage voyage2 =
                new Voyage("2",
                        new Bus(1, 800, 50),
                        new Time(15,00),
                        new Time(18,00),
                        10.
                );
        Voyage voyage3 =
                new Voyage("3",

                        new Bus(1, 800, 60),
                        new Time(15, 30),
                        new Time(18, 30),
                        10.
                );
        Voyage voyage4 =
                new Voyage("4",

                        new Bus(1, 800, 60),
                        new Time(18, 30),
                        new Time(21, 30),
                        10.
                );
        Voyage voyage5 =
                new Voyage("5",
                        new Bus(2, 50, 70),
                        new Time(14,00),
                        new Time(16,00),
                        7.
                );
        Voyage voyage6 =
                new Voyage("6",
                        new Bus(2, 50, 70),
                        new Time(16, 00),
                        new Time(18, 00),
                        7.
                );
        // Ajouter les stations et les arrêts correspondants à ce voyage
        // Supposons que vous avez déjà les stations et les arrêts


        voyage1.addStation("A",new Arret(7,0));
        voyage1.addStation("B",new Arret(8,0));
        voyage1.addStation("C",new Arret(9,0));
        voyage1.addStation("D",new Arret(10,0)); //V1= A B F D   prix=10  //   V2= B F D=10 ||  F D= 10


        voyage2.addStation("D",new Arret(15,0));
        voyage2.addStation("C",new Arret(16,0));
        voyage2.addStation("B",new Arret(17,0));
        voyage2.addStation("A",new Arret(18,0));

        voyage3.addStation("A",new Arret(15,0));
        voyage3.addStation("B",new Arret(16,0));
        voyage3.addStation("C",new Arret(17,0));
        voyage3.addStation("D",new Arret(18,0));

        voyage4.addStation("D",new Arret(18,30));
        voyage4.addStation("B",new Arret(19,0));
        voyage4.addStation("c",new Arret(20,14));
        voyage4.addStation("A",new Arret(21,30));

        voyage5.addStation("E",new Arret(14,0));
        voyage5.addStation("B",new Arret(15,0));
        voyage5.addStation("D",new Arret(16,0));

        voyage6.addStation("D",new Arret(16,0));
        voyage6.addStation("B",new Arret(17,0));
        voyage6.addStation("E",new Arret(18,0));

        // Ajoutez d'autres arrêts et stations au besoin

        // Ajouter le voyage à la liste des voyages
        voyages.add(voyage1);
        voyages.add(voyage2);
        voyages.add(voyage3);
        voyages.add(voyage4);
        voyages.add(voyage5);
    }

    public boolean recherche(String depart, String arrive) {
        // Remplir la liste des voyages
        remplirVoyages();
        // Créer une nouvelle station pour le départ
        Station stationDepart = new Station(depart);
        for (Voyage voyage : voyages) {
            // System.out.println("dfghjui");
            voyage.afficherArretsParStation();
        }
        // Vérifier les départs pour trouver les voyages correspondants
        ArrayList<Voyage> NouveauVoyageDepart = stationDepart.VerifierDepart(depart, voyages);
        // Vérifier les destinations pour les voyages correspondants aux départs
        VoyageConvonable= stationDepart.VerifierDestination(arrive, NouveauVoyageDepart);
        // ArrayList<Voyage> VoyageConvonable = new ArrayList<>();

        return VoyageConvonable !=null;
    }

    public  void construireResultats(Voyage voyage) {
        LinkedHashMap<Station, Arret> arretsParStation = voyage.getArretsParStation();
        for(Map.Entry<Station, Arret> entry : voyage.getArretsParStation().entrySet()){
            Station station = entry.getKey();
            Arret arret = entry.getValue();

            // Ajouter des informations sur le bus passant par cette station
            String busInfo = null;
            Bus bus = voyage.getBus();
            if (bus != null) {

                // Ajouter l'heure de départ du bus si la station correspond à la station de départ

                resultats.add("  Station: " + station.getNom() + ", Heure d'arret: " + arret.getHeureArret() + ":" + arret.getMinArret());
            } else {
                busInfo += "Informations non disponibles";
            }
            resultats.add(busInfo);
        }
    }
    public Voyage reserver(Voyage voyage,Reservation R) {

        if(voyage.getBus().getNombrePlaceLibre()==0){
            JOptionPane.showMessageDialog(null,"pas de place disponible dans le bus "
                    + voyage.getBus().getNumeroBus() +"","Attention ", 0);

            new Recherche().setVisible(true);
            return null;
        }
        voyage.getBus().decrementer();

        //reservation = new Reservation(null, voyage, voyage.premierArret().getKey(), voyage.dernierArret().getKey()); //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        reservation = new Reservation(null,voyageReserver,R.getReserveFrom(),R.getReserveTo());
        // System.out.println("JE SUIS DANS FONCTION RESERVER not0"+voyage);
        return voyage;
    }


    //----------------------------------------------------------------------------


  /*  public void goToPaiment(Reservation R) {
        System.out.println("gotoPaiement"+R);
        new Paiement(R).setVisible(true);

    }
*/

    public Boolean verifierInfoPaiement(String nom, String cvv, String dateExpiration,Reservation R) {
        Boolean res = false;
        remplirInfoPaiement();
        remplirPassager();

        for (InformationsPaiement infoPai : InfoPaiement) {
            // Vérifier si les informations de paiement correspondent
            if (passager.getPrenom().equals(nom) && String.valueOf(infoPai.getCvv()).equals(cvv)) {
                System.out.println("ANA FIIIIIIIIIIIIIIIIIIIIIIIIIII busway "+R);
                // Convertir la chaîne de date d'expiration en objet LocalDate
                LocalDate expiration = LocalDate.parse(dateExpiration, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                // Vérifier si la date d'expiration est postérieure à la date actuelle
                if (expiration.isAfter(LocalDate.now())) {

                    //reservation is null here
                    res = true; // La carte est valide
                }
            }
        }

        return res;
    }
/*
    public void goTOmes_coordonnees(Reservation R) {
        new mes_coordonnees(R).setVisible(true);

    }
*/
    public void goToRecherche() {
        new  Recherche().setVisible(true);

    }
/*
    public  void  reserverPourPassager(String numero, String adress,Reservation R)
    {
        Passager passagerReserve = new Passager(R.getReservePassager().getNom(),R.getReservePassager().getPrenom(),numero,adress);
        reservation=   new Reservation(passagerReserve,R.getReserveVoyage(),R.getReserveFrom(),R.getReserveTo());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        new Paiement(R).setVisible(true);

    }



    public void goToConfirmerPaiement(Reservation R) {
        reservation =R;
        new ConfirmerPaiement(R).setVisible(true);

    }
*/

    ///**********************************************************
    public boolean sendMail(String mail,int x)
    {
        return true;
    }


    public boolean payer()
    {

        // effectuation de retrait
        compte.retrait();
        voyageReserver.getBus().decrementer();
        new Recherche().setVisible(true);
        return true;
    }
    /*
    public void reenvoyer()
    {
        Random rand = new Random();
        int x = rand.nextInt(1000) + 3;
        if(sendMail(reservation.getReservePassager().getGmail(),1))
            new ConfirmerPaiement().setVisible(true);//badaltha ana dira reservation
    }
    public void toConfirmePaiement(String numeroCompte,String code)
    {

        try {
            compte = new CompteBancaire(numeroCompte,code);
            Random rand = new Random();
            int x = rand.nextInt(1000) + 3;
            if(sendMail(reservation.getReservePassager().getGmail(),1))
                new ConfirmerPaiement().setVisible(true);////badaltha ana dira reservation

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "attention " +e, "erreur",0);

        }

    }
*/
    public boolean infoValide(String email, String motDePasse) {
        for (CompteUser compte : comptesUtilisateurs) {
            if (compte.getGmail().equals(email) && compte.getGmail().equals(motDePasse)) {
                return true; // Les informations sont valides, le compte utilisateur existe
            }
        }
        return false;
    }
/*
    public void GoToAuthentification(Reservation R) {
        new authentification(R).setVisible(true);
    }

    public void GoToQR_Code(Reservation R, ImageIcon icon) {
        System.out.println("anaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaGoToQR_Code"+R);
        new QR_Code(R,icon).setVisible(true);
    }

    public void goToTicket(Reservation R) {

        new Ticket(R).setVisible(true);

    }

 */
    public static void main(String[] args) {
        Busway B= new Busway();
        B.remplirVoyages();

            System.out.println(B.voyage1);

    }
}




