package Ejercicio7;

public class Programador extends Empleado{
    private int NumeroProyectos;

    public Programador(String Nombre, double Salario, String departamento, int NumeroProyectos) {
        // Super devuelve las propiedades comunes
        super(Nombre, Salario, departamento);
        // this se usa en el constructor para las propiedades únicas de la subclase.
        this.NumeroProyectos=NumeroProyectos;


    }
}
