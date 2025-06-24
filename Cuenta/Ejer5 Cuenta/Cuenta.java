/**
 * La clase Cuenta con un constructor para 
 * inicializar la variable (atributo) saldo
 */
public class Cuenta {
    double saldo;

    //constructor
    public Cuenta(double saldoInicial) {
        //valida que el saldo saldoInicial sea mayor que 0
        if (saldoInicial > 0) {
            saldo = saldoInicial;
        }
        else {
            saldo = 0;
        }
    } //fin del constructor de Cuenta

    //abona (suma) un monto a la cuenta
    public void abonar(double monto) {
        saldo = saldo + monto;
    } //fin del método abonar
    
    //devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo;
    } //fin del método obtenerSaldo
}//fin de la clase Cuenta

//88101394