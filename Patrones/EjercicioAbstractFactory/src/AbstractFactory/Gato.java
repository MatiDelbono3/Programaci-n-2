package AbstractFactory;

public class Gato extends Animal{
    public int NroJuguetes;
    public String NombreDueños;
    @Override
    public String ObtenerTipo(){
        return "Gato";
    }
}
