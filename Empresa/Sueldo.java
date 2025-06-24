public class Sueldo {

    static void Main(string[] args) {
        
 {
        double horasTrabajadas, horaSalida;
        double sueldoEmpleado = 0, sueldoTotal = 0;
        int K = 0;
        Scanner Entrada = new Scanner(System.in);

        System.out.println("Programa que calcula el sueldo de tres empleados");
        System.out.println("************************************************");

        while (k<3) {
            System.out.println("Ingrese las horas trabajadas");
            horasTrabajadas = Entrada.nextDouble();
            System.out.println("Ingrese el sueldo por hora");
            horasSalida = Entrada.nextDouble();

            sueldoEmpleado = horasTrabajadas * horaSalida;

            System.out.println("El sueldo del empleado es: " + sueldoEmpleado);

            sueldoTotal += sueldoEmpleado;
            K+=1;
        } 
        System.out.println("El sueldo del empleado es: " + sueldoTotal);
    }
    
}
}