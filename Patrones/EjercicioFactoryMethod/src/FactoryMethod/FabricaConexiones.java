package FactoryMethod;

public class FabricaConexiones {
    public static Conexion ObtenerConexion(String tipoConexion) throws NoSuchFieldException {
        if (tipoConexion.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }
        else if (tipoConexion.equalsIgnoreCase("SQL")) {
            return new ConexionMySQL();
        };

        return null;
    }
}
