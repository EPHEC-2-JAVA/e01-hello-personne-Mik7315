package be.ephec.java.exercice.salaires;

import java.util.ArrayList;
import java.util.List;

public class Personnel {
    List<Employe> employes = new ArrayList<Employe>();
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    public void afficherSalaires() {
        for (Employe employe : employes)
            System.out.println(employe.getNom() + "gagne " + employe.calculerSalaire() + " EUR.");
    }

    public double salaireMoyen() {
        double total = 0.0;
        for (Employe employe : employes)
            total += employe.calculerSalaire();
        return total / employes.size();
    }
}
