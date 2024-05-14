package Proyecto;

public class SistemaInterno {
    String clave = "12345";
    
    public boolean autenticar(Autenticable gerente){
        boolean puedeIniciar = gerente.iniciarSesion(clave);
        if(puedeIniciar){
            System.out.println("Login exitoso");
            return true;
        }else{
            System.out.println("Error Login");
            return false;
        }
    };
}
