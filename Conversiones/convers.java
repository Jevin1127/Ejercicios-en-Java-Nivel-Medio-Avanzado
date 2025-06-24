import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class convers {

// TAREA OPERACIONES +,-,*,/

 final double Pies = 3.28;
 final double Kilometros = 1.6;
 final double Pulgadas = 3.28;     
    
 double resultado = 0, valor;
 int opcion;
 DecimalFormat formatodeNumero = new DecimalFormat("###,###,###.##");

 String Mensaje1 = "Metros a pies";
 String Mensaje2 = "Millas a kilometros";
 String Mensaje3 = "Pies a pulgadas";

 Scanner entrada = new Scanner(System.in);

 System.out.println("Programa para conversión de unidades basica")
 
 System.out.println("1.- " + Mensaje1 + "    1 metro = 3.28 pies")
 System.out.println("2.- " + Mensaje2 + "    1 milla = 1.6 kilometros")
 System.out.println("3.- " + Mensaje3 + "    1 milla = 12 pulgadas")
 System.out.println("Elija una opcion: ")

 opcion = entrada.nextInt();

 switch (opcion){
     case 1: System.out.println("Ha elegido convertir " + Mensaje1.toUpperCase());
             System.out.println("1.- " + Mensaje1 + "    1 metro = 3.28 pies");
             valor = entrada.nextDouble();
             resultado = valor * Pies;
             System.out.println("El resultado es:" + formatodeNumero.format(resultado));
             break;
 }

}