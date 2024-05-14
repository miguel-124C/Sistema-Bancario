package Proyecto;

public abstract class Funcionario {
    private String nombre;
    private String documento;
    private double salario;
    
    public Funcionario(){
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getDocumento(){
        return this.documento;
    }    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    
    //Sobre escritura de metodos
    public abstract double getBonificacion();
}
