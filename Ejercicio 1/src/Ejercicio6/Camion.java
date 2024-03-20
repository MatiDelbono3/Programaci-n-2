package Ejercicio6;

import java.util.HashMap;
import java.util.Map;

public class Camion extends Vehiculo {
    private String TipoCarga;
    private int ID;
    public Camion(String Marca, String Modelo, int NumeroRuedas, String TipoCarga, int ID) {
        super(Marca, Modelo, NumeroRuedas);
        this.TipoCarga=TipoCarga;
        this.ID=ID;
    }

}
