import javax.swing.plaf.basic.BasicBorders.MarginBorder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
     {
         //Declaración de la variables a utilizar
        double notaAlumno, notapromedioAlumno;
        Estudiante notaMaximaAlumno, notaminimaAlumno;
        int seguir = 1;
        String nombreAlumno; 
        Scanner Entrada = new Scanner(System.in);
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        //Excepción para tirar error por si se ingresa datos invalidos
        try 
        {
            //Un ciclo while para determinar si el usuario quiere agregar mas alumnos o no
            while (seguir == 1){
                System.out.println(" Sistema de calificaciones de LP3 ");
                System.out.println(" **************************** ");
                System.out.println(" Bienvenido, este un programa de registro de alumnos ");
                System.out.println(" Ingrese el nombre del alumno: ");
                nombreAlumno = Entrada.next();
                System.out.println(" Ingrese el nota del alumno: ");
                notaAlumno = Entrada.nextDouble();

                //Validación que el numero ingresado esté en el rago de 0 a 100
                if (notaAlumno > 100 || notaAlumno < 0){
                    System.out.println(" La nota que ingresó no está en el rago de 1 a 100 ");
                }
                else {
                    System.out.println(" Desea agregar mas estudiantes: ");
                    System.out.println("");
                    System.out.println(" 1) SI");
                    System.out.println(" 2) NO");
                    seguir = Entrada.nextInt();
        
                    Estudiante jevin = new Estudiante(nombreAlumno, notaAlumno);
                    listaEstudiantes.add(jevin);
                }
              }

              //Ciclo for donde se guarda los datos de los estudiantes en un objeto
              for (Estudiante estudiante : listaEstudiantes) {
                System.out.println(" El estudiante: " + estudiante.nombreEstudiante);
                System.out.println(" obtuvo la nota: " + estudiante.notaEstudiante);
              }
    
              //Validación traida de la clase estudiante para la nota mas alta
              System.out.println("");
              notaMaximaAlumno = Estudiante.notaMaxima(listaEstudiantes);
              System.out.println(" El estudiante con la nota maxima fué: " + notaMaximaAlumno.nombreEstudiante);
              System.out.println(" y su nota minima fué: " + notaMaximaAlumno.notaEstudiante);
    
            //Validación traida de la clase estudiante para la nota mas baja
              System.out.println("");
              notaminimaAlumno = Estudiante.notaMinima(listaEstudiantes);
              System.out.println(" El estudiante con la nota minima fué: " + notaminimaAlumno.nombreEstudiante);
              System.out.println(" y su nota minima fué: " + notaminimaAlumno.notaEstudiante);

             //Validación traida de la clase estudiante para el promedio
              System.out.println("");
              notapromedioAlumno = Estudiante.notaPromedio(listaEstudiantes);
              System.out.println(" La nota promedio de todos los estudiantes es:  " + notapromedioAlumno);
    
        } catch (Exception e){
            System.out.println("Ha habido un error al ingresar el dato: " + e.getMessage());           
        }
    }

}
