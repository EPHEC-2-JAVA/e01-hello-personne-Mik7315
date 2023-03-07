package be.ephec.java.exercice.e02;

import java.util.Scanner;

public class Base {
    public static void exercice(){
    Scanner sc = new Scanner(System.in);
    int radix = 0;
    int nombre = 0;

    boolean baseOk = false;
    while(!baseOk) {
        System.out.println("Base ?");
        radix = sc.nextInt();
        if(Character.MIN_RADIX <= radix && radix <= Character.MAX_RADIX)
            baseOk = true;
    }

    System.out.println("Nombre ?");
    nombre = sc.nextInt(radix);
    System.out.println(nombre);
    }
}

