package Ejercicio6;

public class Coche extends Vehiculo {
    private int NumeroPasajeros;
    private String Version;
    public Coche(String Marca, String Modelo,  int NumeroRuedas, int NumeroPasajeros, String Version ) {
        super(Marca, Modelo, NumeroRuedas);
        this.NumeroPasajeros=NumeroPasajeros;
        this.Version=Version;
    }
}
