import Ejercicio2.Calculadora;
import Ejercicio4.Rectangulo;
import Ejercicio5.Animal;
import Ejercicio5.Gato;
import Ejercicio5.Perro;
import Ejercicio6.Camion;
import Ejercicio6.Coche;
import Ejercicio6.Moto;
import Ejercicio7.Empleado;
import Ejercicio7.Programador;
import Ejercicio7.Director;
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

        // Ejercicio 6
        Coche coche=new Coche("Volkswagen", "Suran", 4, 5, "Comfortline");
        Moto moto=new Moto("Honda", "SH125", 2, 125);
        Camion camion=new Camion("Iveco", "Stralis", 8,"Electrodomésticos", 543215);

        // Ejercicio 7
        Empleado[] empleados=new Empleado[3];
        // Todo objeto creado en otra clase, se debe crear también en el main
        Empleado empleado=new Empleado("Hernán Poi", 950000, "Producción");
        Director director=new Director("Maxi Lovera", 1000000,"Sistemas", 25, 100000);
        Programador programador=new Programador("Martín Valvo", 800000, "Sitios Web", 8);
        double SalarioDeLaEmpresa=empleado.CalcularSalario(empleados);
        System.out.println("El sueldo total de los empleados es " + empleado.CalcularSalario(empleados));
        }
    }
