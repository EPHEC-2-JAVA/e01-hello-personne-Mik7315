package be.ephec.java.exercice.salaires;

public class Vendeur extends Employe{
    double chiffreAffaire;
    public Vendeur(String prenom, String nom, int age, String annee, double chiffreAffaire) {
        super(prenom, nom, age, annee);
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public double calculerSalaire() {
        return (this.chiffreAffaire / 5.0 ) + 400.0;
    }

    /*
    @Override
    public String getNom(){
        return "Le vendeur " + this.prenom + " " + this.nom + " ";
    }
    */
}
