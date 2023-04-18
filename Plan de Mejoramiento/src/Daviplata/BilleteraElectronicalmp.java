package Daviplata;
import java.util.Scanner;
public class BilleteraElectronicalmp extends BilleteraElectronica {

    private String usuario;
    private String contraseña;
    
    public BilleteraElectronicalmp() {
        usuario = "";
        contraseña = "";
    }
    
    public boolean loguearse(String usuario, String contraseña) {
        if (usuario.equals(usuario) && contraseña.equals(contraseña)) {
            this.usuario = usuario;
            this.contraseña = contraseña;
            return true;
        } else {
            return false;
        }
    }
    public void cerrarSesion() {
        usuario ="";
        contraseña = "";
    }
    
    public String Usuario() {
        return usuario;
    }
    
    public static void main(String[] args) {
        BilleteraElectronicalmp billetera = new BilleteraElectronicalmp();
        Scanner scanner = new Scanner(System.in);
        boolean autenticado = false;
        
        while (!autenticado) {
            System.out.print("Usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();
            
            autenticado = billetera.loguearse(usuario, contrasena);
            
            if (!autenticado) {
                System.out.println("Usuario y/o contraseña incorrectos.");
            }
        
        }
        
        System.out.println("Bienvenido, " + billetera.Usuario() + ".");
        
        boolean salir = false;

        
        while (!salir) {
            System.out.println("1. Meter plata.");
            System.out.println("2. Sacar plata.");
            System.out.println("3. Consultar saldo.");
            System.out.println("4. Realizar recarga.");
            System.out.println("5. Cerrar sesión.");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    billetera.meterPlata(cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    billetera.sacarPlata(cantidadRetiro);
                    break;
                case 3:
                    billetera.consultarSaldo();
                    break;
                case 4:
                    System.out.print("Cantidad a recargar: ");
                    double cantidadRecarga = scanner.nextDouble();
                    billetera.realizarRecarga(cantidadRecarga);
                    break;
                case 5:
                    billetera.cerrarSesion();
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        
        System.out.println("Sesión cerrada. Hasta luego, " + billetera . Usuario ());
         scanner.close();
}
}
