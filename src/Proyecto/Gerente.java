package Proyecto;

public class Gerente extends Funcionario implements Autenticable {

    private int contrasena;

    public Gerente() {

    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public int getContrasena() {
        return contrasena;
    }

    public boolean autenticar(int contrasena) {
        return this.contrasena == contrasena;
    }

    public boolean iniciarSesion(String clave) {
        return clave == "AluraCursosOnline";
    }

    @Override
    public double getBonificacion() {
        return super.getSalario() + super.getSalario() * 0.05;
    }

    @Override
    public void setClave(String clave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
