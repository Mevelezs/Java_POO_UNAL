package Ejercicio5;

public class CuentaBancaria {
    enum tipoCuenta{AHORROS, CORRIENTE}
    String nombres;
    String apellidos;
    int numCuenta;
    tipoCuenta cuenta;
    float saldo = 0;

    public CuentaBancaria(String nombres, String apellidos, int numCuenta, tipoCuenta cuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numCuenta = numCuenta;
        this.cuenta = cuenta;
    }

    public void imprimir() {
        System.out.println("CuentaBancaria [ " +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                ", tipoCuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                ']');
    }
    void consultarSaldo() {
        System.out.println("El saldo actual es = " + saldo);
    }
    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }
    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $” + valor + “ en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }

    public static void main(String args[]) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Pérez", 123456789, tipoCuenta.CORRIENTE);
        cuenta.imprimir();
        cuenta.consignar(200000);
        cuenta.consignar(300000);
        cuenta.retirar(400000);
        cuenta.consultarSaldo();
    }
}
