package Entities.Exo1;

public class CoursCollectif extends Cours
{

    private String nomCours;
    private int nbPlacesMaxi;
    private int ageMini;

    public CoursCollectif(double prixCours, int idCours,String nomCours, int nbPlacesMaxi, int ageMini) {
        super(prixCours, idCours);
        this.nomCours = nomCours;
        this.nbPlacesMaxi = nbPlacesMaxi;
        this.ageMini = ageMini;
    }

    @Override
    public double getPrix() {
        return super.getPrix();
    }
}
