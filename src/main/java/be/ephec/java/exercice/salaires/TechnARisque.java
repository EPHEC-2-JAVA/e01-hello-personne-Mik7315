package be.ephec.java.exercice.salaires;

public class TechnARisque extends Technicien {
    public TechnARisque(String prenom, String nom, int age, String annee, int unitesProduites) {
        super(prenom, nom, age, annee, unitesProduites);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + 200.0;
    }
}
