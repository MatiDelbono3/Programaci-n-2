package Ejercicio4;

public class Rectangulo {
    private int Ancho;
    private int Alto;
    private int Area;
    private int Perimetro;

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int alto) {
        Alto = alto;
    }
    public int CalcularPerimetro(int Alto, int Ancho) {
        Perimetro=(Ancho+Alto)*2;
        return Perimetro;
    }
    public int CalcularArea( int Alto, int Ancho) {
        Area=Alto*Ancho;
        return Area;
    }
}
