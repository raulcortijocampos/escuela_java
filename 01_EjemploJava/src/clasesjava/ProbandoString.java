package clasesjava;
/**
 * @author Raul 
 */
public class ProbandoString {
    public static void tratarCadenas(){
        String texto= "En un lugar de la Mancha de cuyo nombre no quiero acordarme, vivia...";
        System.out.println(texto);
        System.out.println("Cuarta letra "+ texto.charAt(3));
        
        //Comparaciones
        String texto2 = "En un lugar de Madrid";
        System.out.println("Comparacion: " + texto.compareTo(texto2));
        
        texto2=texto2.substring(0,10);
        System.out.println("texto2 ahora es "+texto2);
        
        if(texto.contains(texto2)){
            System.out.println("texto contiene texto 2");
        }else{
            System.out.println("texto NO contiene texto 2");
        }
        System.out.println("\"Mancha\" esta en la posicion "+texto.indexOf("Mancha"));
        texto = texto.replace("lugar", "bar");
        System.out.println(texto);
        
       String texto3="       en    un       LUGAR  ha    ";
        //texto3=texto3.toUpperCase().trim();
        //System.out.println(texto3);
        
        int cont=0;
        String nuevoTexto="";
        texto3.trim();
            for (int i=0; i < texto3.length(); i++) {
                if (texto3.charAt(i) != ' '){
                  nuevoTexto = nuevoTexto + texto3.charAt(i);
                }else if(texto3.charAt(i-1)!= ' '){
                    cont++;
                    nuevoTexto = nuevoTexto + texto3.charAt(i);
                }
            }
            texto3=nuevoTexto;
        System.out.println(texto3);
        System.out.println("Hay "+(cont+1)+" palabras");
        /*
        StringAux lala(texto3);
        lala.metodo();*/

    }
}
