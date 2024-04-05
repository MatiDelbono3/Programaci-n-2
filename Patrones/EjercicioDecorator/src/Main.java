import Decorator.Borde;
import Decorator.Boton;
import Decorator.ComponenteGrafico;
import Decorator.Imagen;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args, Object Boton) {
        ComponenteGrafico boton=new Boton();
        boton=new Borde();
        boton=new Imagen();
        boton.Dibujar();

        }
    }
