package be.ephec.java.exercice.e03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Combien de lignes triangle de Pascal ?");
        int lignes = sc.nextInt();
            int[][] triangle = Pascal.triangle(lignes);

        if(triangle != null){
            for (int [] line : triangle){
                for (int val : line)
                    System.out.print(val + " ");
                System.out.println();
            }
        }
        else
            System.out.println("Ne fait rien");
    }
}