package POO;
/**
 * @author Raul 
 */
public class CocheRally extends Coche {
    private float rozamiento;
            
                
    public CocheRally(String marca, TipoCarburante carburante, TipoColor color, float roz){
        super(marca, carburante, color); //SE INVOCA AL CONSTRUCTOR PADRE
        this.rozamiento = roz;
    }
   public CocheRally(String marca){
        super(marca); //SE INVOCA AL CONSTRUCTOR PADRE
        this.rozamiento = 3.14f;
    }
    //Sobre carga de constructor
    public CocheRally(String marca, TipoCarburante carburante, String color, float roz){
        super(marca, carburante,color); //SE INVOCA AL CONSTRUCTOR PADRE
        this.rozamiento = roz;
    }
    
    public void derrapar(){
        System.out.println("Derrapeee!");
        super.explosionCilindro();
    }
    //Sobre carga del metodo
    public void derrapar(float cuanto){
        System.out.println("Derrapeee de " + cuanto + " newtons");
        super.explosionCilindro();
    }
    //Sobre escritura de metodos
    
    public void acelerar(){
        System.out.println("Acelerando a lo rally");
        if (this.isArrancado()){
            setNivDeposito(getNivDeposito() - 0.1);
            //nivDeposito -= 0.1;
            explosionCilindro();
        }
    }
    
    public float getRozamiento() {
        return rozamiento;
    }

    public void setRozamiento(float rozamiento) {
        this.rozamiento = rozamiento;
    }
}
