package be.ephec.java.exercice.e01;

import java.util.Scanner;

public class Program {
    public void Exercice() {
        Scanner sc = new Scanner(System.in);
        Person mik = new Person();

        System.out.println("Prenom ?");
        mik.firstName = sc.nextLine();

        System.out.println("Nom ?");
        mik.lastName = sc.nextLine();

        System.out.println("Annee de naissance ?");
        mik.yearOfBirth = sc.nextInt();

        System.out.println("Annee en cours ?");
        mik.computeAge(sc.nextInt());

        mik.display();

        sc.close();
    }
}