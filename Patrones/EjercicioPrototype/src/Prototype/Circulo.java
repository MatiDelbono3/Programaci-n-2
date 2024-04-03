package Prototype;
import java.util.Objects;
public  class Circulo implements Cloneable {

    private double radio;
    private Punto Centro;

    public Circulo(double radio, Punto Centro) {
        this.radio=radio;
        this.Centro=Centro;

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Punto getCentro() {
        return Centro;
    }

    public void setCentro(Punto centro) {
        Centro = centro;
    }


    @Override
    public Object clonar() {
        return new Circulo(this.radio,new Punto(this.Centro.getX(), this.Centro.getY()));

        }
    }


