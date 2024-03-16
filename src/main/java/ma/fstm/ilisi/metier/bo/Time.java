/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.fstm.ilisi.metier.bo;

public class Time {
        private int Heure;
          private int Min;

    public Time(int heureArrive, int minArrive) {
        this.Heure = heureArrive;
        this.Min = minArrive;
    }

    public int getHeure() {
        return Heure;
    }

    public void setHeure(int heureArrive) {
        this.Heure= heureArrive;
    }

    public int getMin() {
        return Min;
    }

    public void setMin(int minArrive) {
        this.Min = minArrive;
    }
}
