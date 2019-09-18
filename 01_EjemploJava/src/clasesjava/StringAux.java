package clasesjava;
/**
 * @author Raul 
 */
public class StringAux{
    
    public String quitarEspSobrantes(){
        return quitarEspSobrantes(string);
    }
    public int contarPalabras(){
        return contarPalabras(string);
    }
    /*
    public String quitarEspSobrantes(String texto){
        String nuevoTexto="";
          for (int i=0; i < texto.length(); i++) {
                if (texto.charAt(i) != ' '){
                  nuevoTexto = nuevoTexto + texto.charAt(i);
                }else if(texto.charAt(i-1)!= ' '){
                    nuevoTexto = nuevoTexto + texto.charAt(i);
                }
      }
          return nuevoTexto;
          //return "en un LUGAR";
    }*/
    public String quitarEspSobrantes(String texto){
        String[] palabras = texto.split(" ");
        String result = " ";
        for(String palabra : palabras){
            if(!palabra.isEmpty())
            result += palabra + " ";
        }
        return result.trim();
    }
      
    public int contarPalabras(String texto){
        int cont=1;
        for (int i=0; i < texto.length(); i++) {
            if(texto.charAt(i-1)!= ' ' && texto.charAt(i) == ' '){
                cont++;
            }
            
        
     }
        return cont;
    }

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public StringAux(String string) {
        this.string = string;
    }
  
}
