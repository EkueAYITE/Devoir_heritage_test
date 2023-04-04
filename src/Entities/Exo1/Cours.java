package Entities.Exo1;

import java.util.ArrayList;

public class Cours implements ICalcul, Comparable
{
    private double prixCours;
    private int idCours;

    public Cours(double prixCours, int idCours) {
        this.prixCours = prixCours;
        this.idCours = idCours;
    }


    public int getIdCours() {
        return idCours;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public double getPrix() {
        return 0;
    }
}
