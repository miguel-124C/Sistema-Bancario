package Proyecto;

public class TestReferencias {
    public static void main(String[] args) {
        Funcionario funcionario = new Contador();
        funcionario.setNombre("Miguel");
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Melissa");
        
        funcionario.setSalario(2000);
        gerente.setSalario(10000);
        
        
        
    }
}