package EjercicioSingleton;

public class Configuracion {
    private String URL;
    private String BasedeDatos;
    private String Cookies;
    private static Configuracion instance;

   private Configuracion(String URL, String BasedeDatos, String Cookies) {
       this.setURL(URL);
       this.setBasedeDatos(BasedeDatos);
       this.setCookies(Cookies);
   }
   public static Configuracion getInstance(String URL, String BasedeDatos, String Cookies) {
       if (instance==null) {
            instance=new Configuracion(URL, BasedeDatos, Cookies );
       }
       return instance;

   }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getBasedeDatos() {
        return BasedeDatos;
    }

    public void setBasedeDatos(String basedeDatos) {
        BasedeDatos = basedeDatos;
    }

    public String getCookies() {
        return Cookies;
    }

    public void setCookies(String cookies) {
        Cookies = cookies;
    }
}
