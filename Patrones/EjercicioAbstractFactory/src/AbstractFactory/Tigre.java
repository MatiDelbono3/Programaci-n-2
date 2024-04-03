package AbstractFactory;

public class Tigre extends Animal {
    public int Dimensiones;
    public int NroPresas;
    @Override
    public String ObtenerTipo() {
        return "Tigre";
    }
}
