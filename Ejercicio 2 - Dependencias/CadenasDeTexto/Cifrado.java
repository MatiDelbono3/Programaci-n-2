import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;




        public class Cifrado {
            String Cadena="123456";

            public String Cifrar(String Cadena) {
                byte[] nuevaCadena=null;
                try {
                    nuevaCadena= MessageDigest.getInstance("SHA").digest(Cadena.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
                    e.printStackTrace();
                }
                String encriptado=Base64.getEncoder().encodeToString(nuevaCadena);
                System.out.println(encriptado);
                return encriptado;
            }
    }
