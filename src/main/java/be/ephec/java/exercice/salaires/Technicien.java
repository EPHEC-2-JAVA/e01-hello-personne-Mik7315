package be.ephec.java.exercice.salaires;

public class Technicien extends Employe {
    protected int unitesProduites;
    public Technicien(String prenom, String nom, int age, String annee, int unitesProduites) {
        super(prenom, nom, age, annee);
        this.unitesProduites = unitesProduites;
    }

    @Override
    public double calculerSalaire() {
        return this.unitesProduites * 5.0;
    }

    /*
    @Override
    public String getNom(){
        return "Le technicien " + this.prenom + " " + this.nom + " ";
    }
     */
}
