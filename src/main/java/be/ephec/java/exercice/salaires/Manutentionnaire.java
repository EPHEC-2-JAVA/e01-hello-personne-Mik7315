package be.ephec.java.exercice.salaires;

public class Manutentionnaire extends Employe {
    protected double heuresTravail;
    public Manutentionnaire(String prenom, String nom, int age, String annee, int heuresTravail) {
        super(prenom, nom, age, annee);
        this.heuresTravail = heuresTravail;
    }

    @Override
    public double calculerSalaire() {
        return this.heuresTravail * 65.0;
    }

    /*
    @Override
    public String getNom(){
        return "Le manutentionnaire " + this.prenom + " " + this.nom + " ";
    }
     */
}
