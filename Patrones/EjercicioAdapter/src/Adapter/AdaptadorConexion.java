package Adapter;

public class AdaptadorConexion implements Conexion{
    private ConexionEthernet conexionEthernet;
    // Constructor de la clase
    public AdaptadorConexion(ConexionEthernet conexionEthernet) {
        this.conexionEthernet=conexionEthernet;
    }
    // Sobreescritura método contenido en la interfaz
        @Override
       public String enviarMensaje(Mensaje mensaje) {
        conexionEthernet.enviarMensaje(mensaje);
        return null;
        }
}
