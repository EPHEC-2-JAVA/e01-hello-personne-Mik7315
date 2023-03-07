package be.ephec.java.exercice.exception2;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        int t[];
        int taille;
        int index;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau :");
        taille = sc.nextInt();
        t = new int[taille];
        System.out.println("Dans quelle case voulez vous mettre la valeur 12 ?");
        index = sc.nextInt() - 1;
        t[index] = 12;
    }
}
