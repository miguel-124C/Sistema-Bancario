package Proyecto;

public class EjemploSobreCarga {

    private int contrasena;

    public int getContrasena() {
        return this.contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
/*-------------------------------------------------------------------*/
    //Sobrecarga => Hay 2 metodos con el mismo nombre pero distintos parametros
    public boolean autenticar(int contrasena) {
        return this.contrasena == contrasena;
    }

    public boolean autenticar(String login, int contrasena) {
        return this.contrasena == contrasena;
    }
/*-----------------------------------------------------------------*/
    public static void main(String[] args) {
        EjemploSobreCarga algo = new EjemploSobreCarga();
        algo.setContrasena(123);
        System.out.println(algo.autenticar(123));
    }

}
