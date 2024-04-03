package AbstractFactory;

public class FabricaAnimalesSalvajes implements FabricaAnimales{

    @Override
    public Animal CrearGato()  {
        return null;
    }
    @Override
    public Animal CrearPerro() {
        return null;
    }
    @Override
    public Animal CrearLeon() {
        return new Leon();
    }

    @Override
    public Animal CrearTigre() {
        return new Tigre();
    }
}
