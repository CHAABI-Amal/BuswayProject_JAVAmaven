package ma.fstm.ilisi.metier.bo;

public class Arret {
    private int idArret;
    private int heureArret;
    private int minArret;
    private Voyage voyage;
    private Station station;

    //*************************************





    public Arret(){
        
    }
    public int getHeureArret() {
        return heureArret;
    }

    public void setHeureArret(int heureArret) {
        this.heureArret = heureArret;
    }

    public Arret(int heureArret, int minArret) {
        this.heureArret = heureArret;
        this.minArret = minArret;
    }

    public int getMinArret() {
        return minArret;
    }

    public void setMinArret(int minArret) {
        this.minArret = minArret;
    }
    
}
