package Proyecto;

public class ControlBonificacion {

    private double suma;

    public double registrarSalario(Funcionario funcionario) {   //Polimorfismo
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("calculo actual" + this.suma);
        return this.suma;
    }
}
