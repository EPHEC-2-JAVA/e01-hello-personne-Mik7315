package be.ephec.java.exercice.exception;

public class compte {
    private double solde;
    public compte(double solde){
        this.solde = solde;
    }
    public double getSolde() {
        return solde;
    }
    public void ajoute(double montant){
        solde = solde + montant;
    }

    public double retire(double montant){
        if(solde < montant)
            montant = solde;
        solde = solde - montant;
        return montant;
    }
}
