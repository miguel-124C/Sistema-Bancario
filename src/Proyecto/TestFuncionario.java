package Proyecto;

public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario miguel = new Contador();
        miguel.setNombre("Miguel");
        miguel.setDocumento("444455666");
        miguel.setSalario(2000);
        
        System.out.println(miguel.getSalario());
        System.out.println(miguel.getBonificacion());
    }
}
