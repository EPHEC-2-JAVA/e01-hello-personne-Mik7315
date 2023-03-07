package be.ephec.java.exercice.e03;


public class Pascal {
    public static int[][] triangle(int nbreLignes) {
        if (nbreLignes < 1) {
            System.out.println("Impossible de créer un triangle de Pascal pour un nombre en dessous de 1");
            return null;
        }

        int[][] triangle = new int[nbreLignes][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;

        if (nbreLignes > 1) {
            for (int line = 1; line < nbreLignes; line++) {
                triangle[line] = new int[line+1];
                triangle[line][0] = 1;
                triangle[line][line] = 1;
                for (int cell = 1; cell < line; cell++)
                    triangle[line][cell] = triangle[line - 1][cell - 1] + triangle[line - 1][cell];
            }
        }
        return triangle;
    }

}

