package Ejercicio6;

public class Moto extends Vehiculo {
    private int Cilindrada;
    public Moto(String Marca, String Modelo, int NumeroRuedas, int Cilindrada) {
        super(Marca, Modelo, NumeroRuedas);
        this.Cilindrada=Cilindrada;
    }
}
