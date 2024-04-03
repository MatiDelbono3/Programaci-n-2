package Adapter;

public class Cliente {
    private Conexion conexion;
    public Cliente (Conexion conexion) {
        this.conexion=conexion;
    }
    public  String enviar(Mensaje mensaje) {
        conexion.enviarMensaje(mensaje);
    }
}
