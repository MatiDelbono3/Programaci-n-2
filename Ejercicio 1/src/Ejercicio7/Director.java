package Ejercicio7;

 public class Director extends Empleado {
    private int PersonasACargo;
    private int Bono;
    public Director(String Nombre, double Salario, String Departamento, int PersonasACargo, int Bono){
        // Super se usa para referirse a la clase padre
       super(Nombre, Salario, Departamento);
       this.PersonasACargo=PersonasACargo;
       this.Bono=Bono;
    }


        }


