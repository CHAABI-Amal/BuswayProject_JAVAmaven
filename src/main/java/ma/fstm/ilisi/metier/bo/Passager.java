/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

public class Passager {
    private int id_passager;
    private String Gmail;
    private float  Longitude;//zadt
    private float Latitude;//zadt

    //**********************


    public Passager() {
    }

    public Passager(int id_passager, int longitude, int latitude) {
        this.id_passager = id_passager;
        Longitude = longitude;
        Latitude = latitude;
    }

    public int getId_passager() {
        return id_passager;
    }

    public void setId_passager(int id_passager) {
        this.id_passager = id_passager;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

    @Override
    public String toString() {
        return "Passager{" +
                "id_passager=" + id_passager +
                ", Longitude=" + Longitude +
                ", Latitude=" + Latitude +
                '}';
    }
}
