package Proyecto;

public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario miguel = new Contador();
        miguel.setSalario(2000);
        
        Gerente melissa = new Gerente();
        melissa.setSalario(10000);
        
        Contador alex = new Contador();
        alex.setSalario(5000);
        
        ControlBonificacion control = new ControlBonificacion();
        
        control.registrarSalario(miguel);
        control.registrarSalario(melissa);
        control.registrarSalario(alex);
    }
}
