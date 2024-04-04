package Bridge;

public class Circulo extends Forma {
    public Circulo(Color color) {
        super(color);
    }

    @Override
    public void Dibujar() {
        System.out.println ("Dibujando un círculo");

    }
}
