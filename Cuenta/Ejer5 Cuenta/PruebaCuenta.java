import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        double deposito;
        int opcion;
        Cuenta cuenta1 = new Cuenta(50);
        Cuenta cuenta2 = new Cuenta(-10.33);

        //muestra el saldo inicial de cada objeto
        System.out.println("Saldo inicial de cuenta 1: " + cuenta1.obtenerSaldo());
        System.out.println("Saldo inicial de cuenta 2: " + cuenta2.obtenerSaldo());

        Scanner entrada = new Scanner(System.in);
           

        do {
            System.out.println("En cuál cuenta desea hacer el depósito o ingrese 0 para salir");
            opcion = entrada.nextInt();
            System.out.println("Cuál es el valor del depósito");
            deposito = entrada.nextDouble();
                switch(opcion) {
                    case 1: cuenta1.abonar(deposito);
                            break;
                    case 2: cuenta2.abonar(deposito);
                            break;
                    default: System.out.println("La cuenta ingresada no es válida");
                            break;
                } //fin del switch
            } while (opcion!=0);//fin del while
        System.out.println("Saldo final de cuenta 1: " + cuenta1.obtenerSaldo());
        System.out.println("Saldo final de cuenta 2: " + cuenta2.obtenerSaldo());
    } //fin del main
} //fin de PruebaCuenta
