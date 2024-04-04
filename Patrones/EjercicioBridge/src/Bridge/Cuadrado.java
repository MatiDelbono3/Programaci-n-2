package Bridge;

public class Cuadrado extends Forma{
    public Cuadrado(Color color) {
        super(color);
    }

    @Override
    public void Dibujar() {
        System.out.println ("Dibujando un cuadrado");

    }
}
