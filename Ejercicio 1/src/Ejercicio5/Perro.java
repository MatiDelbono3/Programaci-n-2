package Ejercicio5;
import Ejercicio5.Animal;
public class Perro <T> extends Animal {
    @Override
    public <T> String Comunicar() {
        return "Ladra";
    }
}
