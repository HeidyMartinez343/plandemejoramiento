package Daviplata;
     public abstract class BilleteraElectronica implements Interfaz  {
        private double saldo;
        
        public BilleteraElectronica() {
            saldo = 0;
        }
        
        public void meterPlata(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                System.out.println("Se ha depositado " + cantidad + " en su cuenta.");
                System.out.println("Su nuevo saldo es de: " + saldo);
            } else {
                System.out.println("Cantidad inválida.");
            }
        }
        
        public void sacarPlata(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Se ha retirado " + cantidad + " de su cuenta.");
                System.out.println("Su nuevo saldo es de: " + saldo);
            } else {
                System.out.println("Cantidad inválida o saldo insuficiente.");
            }
        }
        
        public void consultarSaldo() {
            System.out.println("Su saldo actual es de: " + saldo);
        }
        
        public void realizarRecarga(double cantidad) {
            if (cantidad > 0 && cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Se ha realizado una recarga de " + cantidad + ".");
                System.out.println("Su nuevo saldo es de: " + saldo);
            } else {
                System.out.println("Cantidad inválida o saldo insuficiente.");
            }
        }
        
        public abstract String Usuario();
    } 

