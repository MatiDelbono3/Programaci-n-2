package Ejercicio7;

public class Empleado {
    private String Nombre;
    private double Salario;
    private String Departamento;


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getSalario() {
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
    public Empleado(String Nombre, double Salario, String departamento) {
        this.Nombre=Nombre;
        this.Salario=Salario;
        this.Departamento=departamento;
    }


    }
    // Preguntar

