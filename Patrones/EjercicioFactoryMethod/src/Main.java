import FactoryMethod.Conexion;
import FactoryMethod.FabricaConexiones;
import FactoryMethod.TipodeConexion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        FabricaConexiones fabricaConexiones=new FabricaConexiones();
        Conexion SQL=FabricaConexiones.ObtenerConexion("SQL");
        Conexion ORACLE=FabricaConexiones.ObtenerConexion("ORACLE");
    }
    }
