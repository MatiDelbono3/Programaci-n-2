package Ejercicio3;

public class Punto
{
    private int X;
    private int Y;

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
    public int DistanciaEntrePuntos(int A, int B) {
        return Math.abs(B-A);
    }
}

