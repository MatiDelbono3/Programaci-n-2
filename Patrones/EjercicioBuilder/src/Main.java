import Builder.Auto;

import static Builder.Auto.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class ConstructorAuto {

    public static void main(String[] args) {
        Auto auto1= new Auto.Builder()
                .setMarca("Volkswagen")
                .setModelo("Suran")
                .setColor("Negro")
                .setNroAsientos(5)
                .setCapacidadMaletero(1525)
                .Construir();

    }
}