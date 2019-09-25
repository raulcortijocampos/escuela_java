
package POO;

public class Coche extends Vehiculo { //hereda de Object
    
    public static final byte CAPACIDAD_DEPOSITO = 60;
    
    private final byte numRuedas;   // Valor constante por el final
    private final TipoCarburante carburante;
    private double nivDeposito;
    private boolean arrancado;
     
    
    private TipoColor color;
    
    
   
    
    public Coche(byte numRuedas, String marca, TipoCarburante carburante) {
        super(marca, "SIN MATRICULA");
        this.numRuedas = numRuedas;
        this.carburante = carburante;
    }
    public Coche(String marca) {
         super(marca, "SIN MATRICULA");
        this.numRuedas = 4;
        this.carburante = TipoCarburante.DIESEL;
        this.color=TipoColor.AZUL;
    }
    public Coche(String marca, String matricula) {
         super(marca, matricula);
        this.numRuedas = 4;
        this.carburante = TipoCarburante.DIESEL;
        this.color=TipoColor.AZUL;
    }
    public Coche(String marca, TipoCarburante carburante, TipoColor color) {
        super(marca, "SIN MATRICULA");
        this.numRuedas = 4;
        this.carburante = carburante;
        this.color = color;
    }
    /*
    public Coche(String marca, TipoCarburante carburante, String color) {
        this.numRuedas = 4;
        this.marca = marca;
        this.carburante = carburante;
        switch(color.toLowerCase()){
            case "negro":
                this.color=TipoColor.NEGRO;
            break;
            case "azul":
                this.color=TipoColor.AZUL;
            break;
            case "blanco":
                this.color=TipoColor.BLANCO;
            break;
            case "verde":
                this.color=TipoColor.VERDE;
            break;
            case "rojo":
                this.color=TipoColor.ROJO;
            break;
            case "plateado":
                this.color=TipoColor.PLATEADO;
            break;
            default:
                System.out.println("Ese color no esta disponible");
            break;
            
        }
        
       
    }*/
    
    public Coche(String marca, TipoCarburante carburante, String color) {
         super(marca, "SIN MATRICULA");
        this.numRuedas = 4;
        this.carburante = carburante;
        this.color = TipoColor.valueOf(color.toUpperCase());
        
    }

    public double getNivelDep() {
        return nivDeposito;
    }

    public byte getNumRuedas() {
        return numRuedas;
    }
    
    @Override
    public void echarCarburante(double cantidad) {
        if (cantidad > 0)
            this.nivDeposito += cantidad;
        
        if (nivDeposito > CAPACIDAD_DEPOSITO)
            nivDeposito = CAPACIDAD_DEPOSITO;
        System.out.println("deposito llenado "+cantidad + " litros");
    }
    @Override
    public void acelerar() {
        if (arrancado){
            nivDeposito -= 0.1;
            explosionCilindro();
        }
        
    }
    @Override
    public void vaciarDeposito() {
        // float nivelDeposito = 2;
        this.nivDeposito = 3;
        System.out.println("Deposito vaciado de " + this.toString()
                /*+ "\n   Nivel: " + nivelDeposito*/ );  
    }
    
    @Override
    public String toString() {
        return "Coche " + getMarca() + " nivel " + nivDeposito + "color " + color.toString();
    }
    @Override
    public void mostrar() {
        System.out.println(this.toString()); 
    }

    

    public TipoCarburante getTipoCarburante() {
        return carburante;
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public double getNivDeposito() {
        return nivDeposito;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public TipoColor getColor() {
        return color;
    }

    public void setColor(TipoColor color) {
        this.color = color;
    }
    
    protected void explosionCilindro(){
        System.out.println("Motor funcionando");
    }
    protected void setNivDeposito(double nuevoNiv){
        this.nivDeposito = nuevoNiv;
    }

    @Override
    public void abrirPuerta() {
        if(isArrancado())
            System.out.println("Abriendo puertas de coche");
    }

    @Override
    public void hacerCaballito() {
        System.out.println("No puedes hacerlo, eres un coche");
    }
}
