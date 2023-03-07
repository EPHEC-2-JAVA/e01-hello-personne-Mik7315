package be.ephec.java.exercice.exception;
public class Point {
    private int x, y;
    public Point(int x, int y) throws ConstructorException {
        if ((x < 0) || (y < 0)) throw new ConstructorException();
        this.x = x;
        this.y = y;
    }
    public void affiche() {
        System.out.println("coordonnees : " + x + " " + y);
    }

    public void deplace(int dx, int dy) throws MoveException{
        if(x + dx < 0 || y + dy < 0) throw new MoveException();
        x += dx;
        y += dy;
    }
}
class ConstructorException extends Exception {}
class MoveException extends Exception {}
