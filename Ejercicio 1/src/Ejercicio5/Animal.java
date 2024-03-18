package Ejercicio5;

public class  Animal {
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    Animal animal=new Animal();
    Perro perro=new Perro();
    Gato gato=new Gato();
    public  <T> String Comunicar() {
       if (animal.getClass().getSimpleName().equals("Perro"))
           return "Ladra";
       else if (animal.getClass().getSimpleName().equals("Gato"))
           return "maulla";

        return null;
        
    }

}


