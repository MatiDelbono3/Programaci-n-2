package Prototype;

public class Punto {
    private int X;
    private int Y;
    public Punto(int X, int Y) {
        this.setX(X);
        this.setY(Y);
    }

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
}
