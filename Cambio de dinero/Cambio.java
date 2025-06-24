import java.util.Scanner;

public class Cambio {
    public static void main(String[] args) 
    {
        double Dolar = 24.61, Euro = 28.18, lempiraDolar = 0.041, lempiraEuro = 0.035, Lempira, dolarConvertido , euroConvertido, lempiraConvertido;
        int opcion, opcion2, seguir = 1;
        Scanner Entrada = new Scanner(System.in);

        System.out.println(" Programa de cambio de dinero El Pumita Alegre ");
        System.out.println(" **************************** ");

        while (seguir == 1)

        {
            System.out.println(" Eliga la opción que desea convertir: ");
            System.out.println("");
            System.out.println(" 1) Lempiras a Dolares y viceversa");
            System.out.println(" 2) Lempiras a Euros y viceversa");
            opcion = Entrada.nextInt();

            if (opcion == 1)
            {
                System.out.println(" Ha elegido Lempiras a Dolares y viceversa ");
                System.out.println("");
                System.out.println(" Eliga como desea convertir su dinero: ");
                System.out.println(" 1) Lempiras a Dolares");
                System.out.println(" 2) Dolares a Lempiras");
                opcion2 = Entrada.nextInt();

                if (opcion2 == 1)
                {
                    System.out.println(" Ha elegido Lempiras a Dolares ");
                    System.out.println("");
                    System.out.println(" Ingrese los Lempiras que desea convertir: ");
                    System.out.println("");
                    Lempira = Entrada.nextInt();
                    dolarConvertido = Lempira * lempiraDolar;
                    System.out.println("Su cambio a Dolares es: " + dolarConvertido + " USD");
                }

                if (opcion2 == 2)
                {
                    System.out.println(" Ha elegido Dolares a Lempiras ");
                    System.out.println("");
                    System.out.println(" Ingrese los Dolares que desea convertir: ");
                    System.out.println("");
                    Lempira = Entrada.nextInt();
                    lempiraConvertido = Lempira * Dolar;
                    System.out.println("Su cambio a Lempiras es: " + lempiraConvertido + " LPS");
                }   
            }

            if (opcion == 2)
            {
                   System.out.println(" Ha elegido Lempiras a Euros y viceversa ");
                   System.out.println("");
                   System.out.println(" Eliga como desea convertir su dinero: ");
                   System.out.println(" 1) Lempiras a Euros");
                   System.out.println(" 2) Euros a Lempiras");
                   opcion2 = Entrada.nextInt();
   
                   if (opcion2 == 1)
                   {
                       System.out.println(" Ha elegido Lempiras a Euros ");
                       System.out.println("");
                       System.out.println(" Ingrese los Lempiras que desea convertir: ");
                       System.out.println("");
                       Lempira = Entrada.nextInt();
                       euroConvertido = Lempira * lempiraEuro;
                       System.out.println("Su cambio a Euros es: " + euroConvertido + " EUR");
                   }
   
                   if (opcion2 == 2)
                   {
                       System.out.println(" Ha elegido Euros a Lempiras ");
                       System.out.println("");
                       System.out.println(" Ingrese los Euros que desea convertir: ");
                       System.out.println("");
                       Lempira = Entrada.nextInt();
                       lempiraConvertido = Lempira * Euro;
                       System.out.println("Su cambio a Lempiras es: " + lempiraConvertido + " LPS");
                    }
            }
            System.out.printf("¿Desea Continuar?");
            System.out.println("");
            System.out.println(" 1) SI");
            System.out.println(" 2) NO");
            seguir = Entrada.nextInt();
        }
    }
  
}