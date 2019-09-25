package Threads;
/**
 * @author Raul 
 */
public class HiloFichStrAux2 extends HiloFichero {
public static String  quitarEspSobrantes(String texto) {
        texto = texto.trim();
        String[] palabras = texto.split(" ");
        String result = "";
        for (String palabra : palabras) {
            if ( ! palabra.isEmpty())
                result += palabra + " ";
        }
        return result.trim();
    }
}
