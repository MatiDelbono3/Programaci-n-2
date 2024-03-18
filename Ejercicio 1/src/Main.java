import Ejercicio2.Calculadora;
import Ejercicio4.Rectangulo;
import Ejercicio5.Animal;
import Ejercicio5.Gato;
import Ejercicio5.Perro;
import Persona.Estudiante;
import Ejercicio3.Punto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        Estudiante estudiante=new Estudiante();
        estudiante.setNombre("Matías");
        estudiante.setApellido("Delbono");
        estudiante.setEdad(23);
        // Ejercicio 2
        Calculadora calculadora=new Calculadora();
        calculadora.metodoSuma(2,3);
        calculadora.metodoResta(4,3);
        calculadora.metodomultiplicacion(3,5);
        calculadora.metododivision(4,2);
        // Ejercicio 3
        Punto punto=new Punto();
        punto.DistanciaEntrePuntos(8,4);

        // Ejercicio 4
        Rectangulo rectangulo=new Rectangulo();
        rectangulo.CalcularArea(3, 5);
        rectangulo.CalcularPerimetro(4,6);

        //Ejercicio 5
        Animal animal=new Animal();
        Gato gato=new Gato();
        Perro perro=new Perro();

        }
    }
