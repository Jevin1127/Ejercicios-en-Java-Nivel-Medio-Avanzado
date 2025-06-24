import java.util.Scanner;

public class Matematicas 
{ 
     public static void main(String[] args) 
    {

        double a, b;
        int opcion, seguir = 1;
        Scanner Entrada = new Scanner(System.in);

        System.out.println(" Calculadora el Pumita Alegre ");
        System.out.println(" **************************** ");

        //Ciclo while para que usuario cuando quiera dejar de continuar presione la tecla "1"
            while (seguir == 1)
            { 
                try 
                {
                    System.out.println("    Operaciones Disponibles   ");
                    System.out.println("          1- Suma ");
                    System.out.println("          2- Resta ");
                    System.out.println("          3- Multiplicacion ");
                    System.out.println("          4- Divicion ");
                    System.out.println("");
                    System.out.println(" Eliga que operacion desea ejecutar: ");
                    opcion = Entrada.nextInt();
                    
                    //Un switch dependiendo de la eleccion del usuario hara diferentes acciones
                    switch (opcion)
                    {
                      case 1:
                      System.out.println(" Ha Elegido Suma");
                      System.out.println(" Ingrese el primer numero: ");
                      a =  Entrada.nextInt();
                      System.out.println(" Ingrese el segundo numero: ");
                      b =  Entrada.nextInt();
                      operacionesMatematicas operacionesMatematicas1 = new operacionesMatematicas(a, b);
                      System.out.println(" El resultado de la Suma es: " + operacionesMatematicas1.Suma());
                      break;
    
                      case 2:
                      System.out.println(" Ha Elegido Resta");
                      System.out.println(" Ingrese el primer numero: ");
                      a =  Entrada.nextInt();
                      System.out.println(" Ingrese el segundo numero: ");
                      b =  Entrada.nextInt();
                      operacionesMatematicas operacionesMatematicas2 = new operacionesMatematicas(a, b);
                      System.out.println(" El resultado de la Resta es: " + operacionesMatematicas2.Resta());
                      break;
    
                      case 3:
                      System.out.println(" Ha Elegido Multiplicacion");
                      System.out.println(" Ingrese el primer numero: ");
                      a =  Entrada.nextInt();
                      System.out.println(" Ingrese el segundo numero: ");
                      b =  Entrada.nextInt();
                      operacionesMatematicas operacionesMatematicas3 = new operacionesMatematicas(a, b);
                      System.out.println(" El resultado de la Multiplicacion es: " + operacionesMatematicas3.Multiplicacion());
                      break;
    
                      case 4:
                      System.out.println(" Ha Elegido Division");
                      System.out.println(" Ingrese el primer numero: ");
                      a =  Entrada.nextInt();
                      System.out.println(" Ingrese el segundo numero: ");
                      b =  Entrada.nextInt();
                      operacionesMatematicas operacionesMatematicas4 = new operacionesMatematicas(a, b);
                      System.out.println(" El resultado de la Division es: " + operacionesMatematicas4.Divicion());
                      break;
                    }

                } 
                catch (Exception e) 
                {
                    System.out.println("Ha habido un error al ingresar el dato: " + e.getMessage());
                } 
                
                    System.out.printf("¿Desea Continuar?");
                    System.out.println("");
                    System.out.println(" 1) SI");
                    System.out.println(" 2) NO");
                    seguir = Entrada.nextInt();

            }

        }

    }

