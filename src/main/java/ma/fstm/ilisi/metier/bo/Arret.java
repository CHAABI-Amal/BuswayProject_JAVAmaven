package ma.fstm.ilisi.metier.bo;

public class Arret {
    private int idArret;//pas besoin
    private Time tempsArret;
    private Voyage voyage;//
    private Station station;//
    private int nbDescendu;//zadt
    private boolean traversed;//zadt

//*********************************************************************************

    public Arret() {
    }

    public Arret(int idArret, Time time,Station stationArret,Voyage voyage) {
        this.idArret = idArret;
        this.tempsArret = time;
        this.voyage = voyage;
        this.station = stationArret;
        this.nbDescendu = nbDescendu;
        this.traversed = true;
    }
    //*********************************************************


    public Time getTempsArret() {
        return tempsArret;
    }

    public void setTempsArret(Time tempsArret) {
        this.tempsArret = tempsArret;
    }

    public int getIdArret() {
        return idArret;
    }



    public Voyage getVoyage() {
        return voyage;
    }

    public Station getStation() {
        return station;
    }

    public int getNbDescendu() {
        return nbDescendu;
    }

    public boolean isTraversed() {
        return traversed;
    }

    public void setIdArret(int idArret) {
        this.idArret = idArret;
    }



    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public void setNbDescendu(int nbDescendu) {
        this.nbDescendu = nbDescendu;
    }

    public void setTraversed(boolean traversed) {
        this.traversed = traversed;
    }

    @Override
    public String toString() {
        return "Arret{" +
                "idArret=" + idArret +
                ", Arret=" +tempsArret +
                ", voyage=" + voyage +
                ", station=" + station +
                ", nbDescendu=" + nbDescendu +
                ", traversed=" + traversed +
                '}';
    }
}
