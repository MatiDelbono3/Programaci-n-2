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
import Ejercicio8.ExpresionesRegulares;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Persona.Estudiante;
import Ejercicio3.Punto;

import java.util.Scanner;






//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Ejercicio 9
 class CuentaRegresiva {
 public static void main(String[] args)  {
     Scanner scanner=new Scanner(System.in);
     System.out.println("ingrese las horas");
     int Horas= scanner.nextInt();
     System.out.println("ingrese los minutos");
     int Minutos= scanner.nextInt();
     System.out.println("ingrese los segundos");
     int Segundos= scanner.nextInt();

     int SegundosTotales=Horas*3600 + Minutos*60 + Segundos;

     for (int i= SegundosTotales; i>0; i--) {
         Horas=i/3600;
         Minutos=i/60;
         Segundos=i%60;
     }
     System.out.println("02d: 02d: %02d%n" + Horas + Minutos + Segundos );
     // Esperar 1 Segundo
     try {
         Thread.sleep(1000);

     } catch (InterruptedException e){
         e.printStackTrace();
     }

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

        // Ejercicio 8.1
        Scanner sc=new Scanner(System.in);
        String DNI="";
        System.out.println("ingrese un DNI");
        DNI=sc.nextLine();
        Pattern pat=Pattern.compile(" ^[0-9]");
        Matcher match=pat.matcher(DNI);
        if (match.find()) {
            System.out.println("DNI valido");
        }
        else {
            System.out.println("DNI NO valido");
        }


        // Ejercicio 8.2
        Scanner scan=new Scanner(System.in);
        String CUIT="";
        System.out.println("ingrese un CUIT");
        CUIT= scan.nextLine();
        Pattern patt=Pattern.compile(" ^[0-9]");
        Matcher mat=patt.matcher(CUIT);
        if (mat.find()) {
        System.out.println("CUIT valido");
    }
        else {
        System.out.println("CUIT NO valido");
    }
        // Ejercicio 8.3
        Scanner sca=new Scanner(System.in);
        String Nombre="";
        System.out.println("ingrese un Nombre");
        Nombre= scan.nextLine();
        Pattern pa=Pattern.compile(" ^[a-zA-z]");
        Matcher ma=pa.matcher(CUIT);
        if (ma.find()) {
            System.out.println("Nombre valido");
    }
        else {
            System.out.println("Nombre NO valido");
        }


    // Ejercicio 8.4
    Scanner s=new Scanner(System.in);
    String Patente="";
    System.out.println("ingrese una patente");
    Patente= scan.nextLine();
    Pattern p=Pattern.compile(" ^[a-zA-z a-zA-Z a-zA-z 0-90-90-9]");
    Matcher m=pa.matcher(CUIT);
        if (m.find()) {
        System.out.println("Patente valida");
        }
        else {
        System.out.println("Patente NO valida");
    }


    }

}
}