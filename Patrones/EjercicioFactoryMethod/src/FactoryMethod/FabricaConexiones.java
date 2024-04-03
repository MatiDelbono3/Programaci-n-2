package FactoryMethod;

public class FabricaConexiones {
    // método que retorna elementos según el tipo de conexión
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
