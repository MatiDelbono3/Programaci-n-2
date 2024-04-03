package Builder;


public class Auto {
    private String Marca;
    private String Modelo;
    private String Color;
    private int NroAsientos;
    private int CapacidadMaletero;

    public static class Builder {
        private Auto auto;
       private String Marca;
       private String Modelo;
       private String Color;
       private int NroAsientos;
       private int CapacidadMaletero;

        public Auto.Builder setMarca(String marca) {
            this.Marca = marca;
            return this;
        }

        public Auto.Builder setModelo(String modelo) {
            this.Modelo = modelo;
            return this;
        }

        public Auto.Builder setColor(String color) {
            this.Color = color;
            return this;
        }

        public Auto.Builder setNroAsientos(int nroAsientos) {
            this.NroAsientos = nroAsientos;
            return this;
        }

        public Auto.Builder setCapacidadMaletero(int capacidadMaletero) {
            this.CapacidadMaletero = capacidadMaletero;
            return this;
        }
        public Auto Construir(){
            return auto;
        }

   }
}

