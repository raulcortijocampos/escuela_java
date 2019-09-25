package POO;
/**
 * @author Raul 
 */
public abstract class Vehiculo {

    private String matricula; 
    private final String marca;
    
    public Vehiculo(String marca, String matricula) {
        this.matricula=matricula;
        this.marca=marca;
    }
//    public Vehiculo() {
//        this.matricula="SIN MATRICULAR";
//    }
    
    public abstract void abrirPuerta();
    public abstract void acelerar();
    public abstract void echarCarburante(double cantidad);
    public abstract void vaciarDeposito();
    public abstract void hacerCaballito();
    public abstract void mostrar();
    public abstract String toString();
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMarca() {
        return marca;
    }
    
    //VEHICULO DECLARA (NO IMPLEMENTA) ALGUNOS METODOS DE COCHE
    
    
    
}
