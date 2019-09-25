package Threads;
/**
 * @author Raul 
 */
public class HiloFichStrAux3 extends HiloFichero {
public static String  quitarEspSobrantes(String texto) {
        texto = texto.trim();
        
        while (texto.contains("  ")) {
            texto = texto.replace("  ", " ");
        }
        return texto;
    }
}
