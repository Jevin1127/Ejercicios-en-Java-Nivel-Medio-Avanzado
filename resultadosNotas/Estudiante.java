import java.util.List;

public class Estudiante 
{
    //Declaración de las variables del estudiante a usar 
    String nombreEstudiante;
    double notaEstudiante;

    //Metodo constuctor donde iran los datos del estudiante
    public Estudiante(String nombreEstudiante, double notaEstudiante)
    {
      this. nombreEstudiante = nombreEstudiante;
      this.notaEstudiante = notaEstudiante;
    }

    //función que valida cual es la nota maxima de los estudiantes mediante un for creando una variable nueva 
    //que es notaMaxima para almacenar en esta la nota del estudiante mandada a llamar de la clase main
    public static Estudiante notaMaxima(List<Estudiante> LstEstudiante)
    {
        double notaMaxima = 0;
        Estudiante estudianteNotaMaxima = new Estudiante("", 0);

        for (Estudiante estudiante : LstEstudiante)
         {

            if (notaMaxima < estudiante.notaEstudiante){
                estudianteNotaMaxima = estudiante;
            }
         }
        return estudianteNotaMaxima;
    }

    //función que valida cual es la nota maxima de los estudiantes mediante un for creando una variable nueva 
    //que en este caso es la notaMinima para almacenar en esta la nota del estudiante mandada a llamar de la clase main
    public static Estudiante notaMinima(List<Estudiante> LstEstudiante)
    {
        double notaMinima = 100;
        Estudiante estudianteNotaMinima = new Estudiante("", 100);

        for (Estudiante estudiante : LstEstudiante)
         {

            if (notaMinima > estudiante.notaEstudiante){
                estudianteNotaMinima = estudiante;
                notaMinima = estudiante.notaEstudiante;
            }
         }
        return estudianteNotaMinima;
    }
    
    //funcion donde sacaremos el promedio de cada estudiante ingresado, sumando todas las notas y dividiendola
    //entre ellas, guardando las notas en un contador, sumando las suma total de las notas y luego diviediendola entre ellas
    public static double notaPromedio(List<Estudiante> LstEstudiante)
    {

        double sumaNotas = 0, promedio = 0;
        int contador = 0;

        for (Estudiante estudiante : LstEstudiante)
         {

            sumaNotas = sumaNotas + estudiante.notaEstudiante;
            contador = contador + 1;
         }
         promedio = sumaNotas / contador;
        return promedio;
    }


}