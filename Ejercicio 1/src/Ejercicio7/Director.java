package Ejercicio7;

public class Director extends Empleado {
    private int PersonasACargo;
    private int Bono;
    public Director(String Nombre, int Salario, String Departamento, int PersonasACargo, int Bono){
        Nombre="Matías Delbono";
        Salario=200000;
        Departamento="Recursos Humanos";
        PersonasACargo=35;
        Bono=30000;
    }

        @Override
        public int CalcularSueldos() {
            return 1;
        }
    }

