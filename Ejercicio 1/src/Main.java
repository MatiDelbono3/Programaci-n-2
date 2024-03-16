import Ejercicio2.Calculadora;
import Persona.Estudiante;

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
        calculadora.metododivision(44,2);

        }
    }
