package be.ephec.java.exercice.salaires;

public abstract class Employe {
    protected String nom, prenom, annee;
    protected int age;


    public Employe(String prenom, String nom, int age, String annee){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.annee = annee;
    }

    public abstract double calculerSalaire();
    public String getNom(){
        //return "L'employé " + this.prenom + " " + this.nom + " ";
        return new StringBuffer(getClass().getSimpleName()).append(" ").append(this.prenom).append(" ").append(this.nom).append(" ").toString();
    }
}
