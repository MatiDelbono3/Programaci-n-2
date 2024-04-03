package AbstractFactory;

public class FabricaAnimalesDomesticos implements FabricaAnimales{

@Override
    public Animal CrearGato() {
        return new Gato();
    }
    @Override
    public Animal CrearPerro() {
        return new Perro();
    }
@Override
    public  Animal CrearLeon() {
    return null;
    }
@Override
    public Animal CrearTigre() {
        return null;
    }
}
