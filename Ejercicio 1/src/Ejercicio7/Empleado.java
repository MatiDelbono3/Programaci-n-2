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
    Empleado[] empleados=new Empleado[]{new Empleado("Matías Delbono", 350000, "Sistemas"), new Empleado("Agustín Duelli", 500000, "Facturación")};
    public double CalcularSalario(Empleado[] empleados){
        double SalarioTotal=0;
        for (Empleado empleado: empleados){
            SalarioTotal+= empleado.getSalario();

        }
        return SalarioTotal;
}
}


