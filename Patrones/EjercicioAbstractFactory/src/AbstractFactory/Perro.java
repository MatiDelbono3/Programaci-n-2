package AbstractFactory;

public class Perro extends Animal {
    public int HorasPaseo;
    public String NombreDueño;
    @Override
    public String ObtenerTipo() {
        return "Perro";
    }
}
