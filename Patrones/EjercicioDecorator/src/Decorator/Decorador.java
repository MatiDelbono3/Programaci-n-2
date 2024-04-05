package Decorator;

public class Decorador implements ComponenteGrafico {
    protected ComponenteGrafico componenteGrafico;
    public Decorador(ComponenteGrafico componenteGrafico) {
        this.componenteGrafico=componenteGrafico;
    }
    @Override
    public void Dibujar() {
        componenteGrafico.Dibujar();
    }
}
