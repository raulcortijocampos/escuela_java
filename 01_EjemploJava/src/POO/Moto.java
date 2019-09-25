package POO;
/**
 * @author Raul 
 */
public class Moto extends Vehiculo{

    public Moto(String marca) {
        super(marca, "SIN MATRICULAR");
    }


    @Override
    public void abrirPuerta() {
        System.out.println("no hay puertas");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void echarCarburante(double cantidad) {
        System.out.println("echando carburante en moto");
    }

    @Override
    public void vaciarDeposito() {
        System.out.println("vaciando deposito de moto");
    }
   @Override 
    public void hacerCaballito(){
        System.out.println("Haciendo caballitoo");
    }

    @Override
    public void mostrar() {
        System.out.println(this.toString()); 
    }

    @Override
    public String toString() {
        return "Moto " + getMatricula();
    }
}
