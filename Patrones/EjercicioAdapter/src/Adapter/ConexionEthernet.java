package Adapter;

public class ConexionEthernet implements Conexion{
    private String TipoConexion;
    // Sobreescritura del método de interfaz
    @Override
    public String enviarMensaje(Mensaje mensaje) {
        return "Se envía el mensaje correspondiente" + mensaje;
    }

}
