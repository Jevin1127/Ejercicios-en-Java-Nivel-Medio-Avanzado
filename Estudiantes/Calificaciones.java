import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calificaciones 
{
  public static void main(String[] args)
  {
    double a;
    int seguir = 1;
    String nombreAlumno ; 
    try (Scanner Entrada = new Scanner(System.in)) {
        List<Estudiantes> list= new ArrayList<>();  

        //List<Integer> myArrayList = new ArrayList<>(); 

        System.out.println(" Sistema de calificaciones de LP3 ");
        System.out.println(" **************************** ");
        System.out.println(" Bienvenido, este un programa de registro de alumnos ");

            while (seguir == 1)
            { 
                try 
                {               
                    System.out.println(" Ingrese el nombre del Alumno: ");
                    nombreAlumno =  Entrada.toString();
                    System.out.println("  Ingrese la Nota del Estudiante: ");
                    a = Entrada.nextDouble();

                    Estudiantes Estudiantes1 = new Estudiantes(nombreAlumno, a);
  
                    list.add(Estudiantes1);

                    System.out.println(" ¿Desea Agregar mas alumnos?");
                    System.out.println("");
                    System.out.println(" 1) SI");
                    System.out.println(" 2) NO");
                    seguir = Entrada.nextInt();            

                } 
                catch (Exception e) 
                {
                    System.out.println("Ha habido un error al ingresar el dato: " + e.getMessage());
                } 
            }
/*
            double notaMaxima = 0;

            for (Estudiantes estudiante : list) 
            {
            if (notaMaxima < estudiante.Calificacion){
               notaMaxima = estudiante.Calificacion;
           }
        }

        System.out.println(" La nota maxima de todos los alumnos es: " + notaMaxima);
*/
    }
}

}
