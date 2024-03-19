package Ejercicio7;

public class Empleado {
    private String Nombre;
    private int Salario;
    private String Departamento;


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    Empleado empleado=new Empleado();



    public int CalcularSueldos() {
        return Salario;
    }
    // Preguntar
}
