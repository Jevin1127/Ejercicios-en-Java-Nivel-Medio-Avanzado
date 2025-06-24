public class operacionesMatematicas 
{
        
    //Atributos 
    double numero1, numero2;
     
    //Constructor
    public operacionesMatematicas (double numero1, double numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodos
    public double Suma () 
    {
      double resultadoSuma = 0; 
      resultadoSuma = this.numero1 + this.numero2;
      return resultadoSuma;
    }

    public double Resta () 
    {
      double resultadoResta = 0; 
      resultadoResta = this.numero1 - this.numero2;
      return resultadoResta;
    }

    public double Multiplicacion () 
    {
      double resultadoMultiplicacion = 0; 
      resultadoMultiplicacion = this.numero1 * this.numero2;
      return resultadoMultiplicacion;
    }

    public double Divicion () 
    {
      double resultadoDivicion = 0; 
      resultadoDivicion = this.numero1 / this.numero2;
      return resultadoDivicion;
    }

}
