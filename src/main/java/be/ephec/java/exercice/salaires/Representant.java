package be.ephec.java.exercice.salaires;

public class Representant extends Vendeur {
    public Representant(String nom, String prenom, int age, String annee, int chiffreAffaire) {
        super(nom, prenom, age, annee, chiffreAffaire);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + 400.0;
    }

    /*
    @Override
    public String getNom(){
        return "Le Représentant " + this.prenom + " " + this.nom + " ";
    }
    */

}
