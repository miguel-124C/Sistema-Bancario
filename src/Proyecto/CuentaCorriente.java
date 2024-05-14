package Proyecto;

public class CuentaCorriente extends Cuenta {
    public CuentaCorriente(int agencia, int numero){
        super(agencia,numero);
    }
    
    @Override   //método sobreescrito
    public boolean saca(double valor) {
        double comision = 0.2;
        return super.saca(valor + comision); 
    }

    @Override
    public void depositar(double cantidadDinero) {
        this.saldo += cantidadDinero;
    }
}
