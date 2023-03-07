package be.ephec.java.exercice.salaires;

public class ManutARisque extends Manutentionnaire {
    public ManutARisque(String prenom, String nom, int age, String annee, int heuresTravail) {
        super(prenom, nom, age, annee, heuresTravail);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + 200.0;
    }
}
