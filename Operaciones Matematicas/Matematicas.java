import java.util.Scanner;

public class Matematicas 
{ 
     public static void main(String[] args) 
    {
        int Numero1, Numero2, resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision, opcion, seguir = 1;
        Scanner Entrada = new Scanner(System.in);
        System.out.println(" Calculadora el Pumita Alegre ");
        System.out.println(" **************************** ");

            while (seguir == 1)
            {
                System.out.println("    Operaciones Disponibles   ");
                System.out.println("          1- Suma ");
                System.out.println("          2- Resta ");
                System.out.println("          3- Multiplicacion ");
                System.out.println("          4- Divicion ");
                System.out.println("");
                System.out.println(" Eliga que operacion desea ejecutar: ");
                opcion = Entrada.nextInt();

                switch (opcion)
                {
                  case 1:
                  System.out.println(" Ha Elegido suma");
                  System.out.println(" Ingrese el primer numero: ");
                  Numero1 =  Entrada.nextInt();
                  System.out.println(" Ingrese el segundo numero: ");
                  Numero2 =  Entrada.nextInt();
                  resultadoSuma = Numero1 + Numero2;
                  System.out.println(" El resultado de la suma es: " + resultadoSuma);
                  break;

                  case 2:
                  System.out.println(" Ha Elegido Resta");
                  System.out.println(" Ingrese el primer numero: ");
                  Numero1 =  Entrada.nextInt();
                  System.out.println(" Ingrese el segundo numero: ");
                  Numero2 =  Entrada.nextInt();
                  resultadoResta = Numero1 - Numero2;
                  System.out.println(" El resultado de la resta es: " + resultadoResta);
                  break;

                  case 3:
                  System.out.println(" Ha Elegido Multiplicacion");
                  System.out.println(" Ingrese el primer numero: ");
                  Numero1 =  Entrada.nextInt();
                  System.out.println(" Ingrese el segundo numero: ");
                  Numero2 =  Entrada.nextInt();
                  resultadoMultiplicacion = Numero1 * Numero2;
                  System.out.println(" El resultado de la multiplicacion es: " + resultadoMultiplicacion);
                  break;

                  case 4:
                  System.out.println(" Ha Elegido Division");
                  System.out.println(" Ingrese el primer numero: ");
                  Numero1 =  Entrada.nextInt();
                  System.out.println(" Ingrese el segundo numero: ");
                  Numero2 =  Entrada.nextInt();
                  resultadoDivision = Numero1 / Numero2;
                  System.out.println(" El resultado de la division es: " + resultadoDivision);
                  break;
              }

              System.out.printf("¿Desea Continuar?");
              System.out.println("");
              System.out.println(" 1) SI");
              System.out.println(" 2) NO");
              seguir = Entrada.nextInt();
            }
    }

}