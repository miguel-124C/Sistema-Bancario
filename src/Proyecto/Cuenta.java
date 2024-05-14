//entidad cuenta:
package Proyecto;
public abstract class Cuenta {
    protected double saldo;     //es accesible desde sus clases hijas
    private int agencia;
    private int numero;
    private static int total = 0; //esta variable va a ser de la clase y no de la instancia
    //Cliente titular; //su valor por defecto es null
    private Cliente titular = new Cliente();
     
    private static int totalCuentas = 0;
    
    /*---------------------------------------------------------------------------------------------------------*/
    public Cuenta(int agencia,int numero){     //constructor
        if(agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        }else{
           this.agencia = agencia;
        }
        totalCuentas++;
        
        System.out.println("Se va creando: "+ totalCuentas+" cuentas");
    }
    /*
    public Cuenta(int numero){    
        this(numero,78); //se llama al constructor que tenga int,int como parametros... y se le envian los datos
        //this() => es como que fuera Constructor();
    }
    */
    /*
    public Cuenta(){
        this(12);   //hace referencia al Constructor que tenga como parametro solo un int
    }
    */
    /*-------------------------------------------------------------------------------------------------------------*/
    
    
    /*Getter totalCuentas*/
    public static int getTotalCuentas(){    //el static hace referencia a que el metodo será de la clase y no de la instancia
        return Cuenta.totalCuentas;
    }
    
    /*------- Set y geter Agencia*/
    public int getAgencia() {
        return agencia;
    }
    /*------------Set y Get Saldo----------------*/
    public double getSaldo(){
        return this.saldo;
    }    
    /*------------------------------------------*/
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }
    
    
    
    
    
    /*Metodos*/
    public abstract void depositar(double cantidadDinero);
    
    public boolean retirar(double cantidadDinero) {
        if (this.saldo >= cantidadDinero) {
            this.saldo -= cantidadDinero;
            return true;
        }
        return false;
    }
    public boolean transferir(double monto, Cuenta cuenta) {
        if(this.saldo >= monto){
            this.saca(monto);
            cuenta.depositar(monto);
            return true;
        }
        return false;
    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
