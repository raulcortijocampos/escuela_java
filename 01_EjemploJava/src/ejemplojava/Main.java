
package ejemplojava;

import POO.Coche;
import POO.CocheRally;
import POO.TipoCarburante;
import clasesjava.ProbandoString;


public class Main {
    
     public static void main(String[] args) {
        ProbandoString.tratarCadenas();
     
     }
     
     
        public static void mainCoches(String[] args) {
        System.out.println("Empezando POO");
        Coche miCoche,miCoche2;
        
        //miCoche = new Coche("Kia", TipoCarburante.DIESEL, TipoColor.ROJO); // La instanciacion se hace con new
        miCoche = new Coche("bmw", TipoCarburante.DIESEL, "rojo");
        
        miCoche.echarCarburante(30); // Empezamos con medio deposito
        
        System.out.println("Todos los coches tienen: " + Coche.CAPACIDAD_DEPOSITO);
        System.out.println("Coche creado: " + miCoche.getMarca());
        System.out.println("Nivel deposito: " + miCoche.getNivelDep() + " litros");
        
        
        Coche otroCoche = miCoche; // new Coche();
        // otroCoche.marca = "Seat"; YA NO SE PUEDE
        System.out.println("Coche creado: " + otroCoche.getMarca());
        // vaciarDeposito(miCoche);
        miCoche.vaciarDeposito();
        System.out.println("Nivel deposito: " + otroCoche.getNivelDep() + " litros");
        
        miCoche.setArrancado(true);
        miCoche.echarCarburante(-2);
        for (int i = 0; i < 3; i++) 
            miCoche.acelerar();
        
        miCoche.mostrar();
        
        CocheRally miSupra = new CocheRally("TOYOTA", TipoCarburante.GASOLINA, "NEGRO", 2.1f);
        miSupra.echarCarburante(40);
        miSupra.setArrancado(true);
        miSupra.acelerar();
        miSupra.acelerar();
        miSupra.derrapar();
        miSupra.mostrar();
        
        Coche supraNormal = miSupra;   //Conversion implicita
        //supraNormal.explosionCilindro();
       // supraNormal.derrapar();
        supraNormal.acelerar();
        supraNormal.mostrar();
        
        CocheRally cr = (CocheRally) supraNormal; //Conversiono explicita o casting
        System.out.println("Y el rozamiento??"+ cr.getRozamiento());
        
        cr = (CocheRally) miCoche;
        System.out.println("Y el rozamiento??"+ cr.getRozamiento());

    }    
}