import Prototype.Circulo;
import Prototype.Punto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circulo orig=new Circulo(5,new Punto(0,0));
        Circulo clonado=new Circulo(7, new Punto(0,0));
        clonado.getCentro().setX(10);
        System.out.println(orig);
        System.out.println(clonado);
    }
}