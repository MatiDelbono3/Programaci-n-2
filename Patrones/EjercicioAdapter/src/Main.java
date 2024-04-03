import Adapter.AdaptadorConexion;
import Adapter.Cliente;
import Adapter.ConexionEthernet;
import Adapter.Mensaje;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConexionEthernet conexionEthernet=new ConexionEthernet();
        AdaptadorConexion Adaptador=new AdaptadorConexion(conexionEthernet);
        Cliente cliente=new Cliente(Adaptador);
        ;
        }
    }
