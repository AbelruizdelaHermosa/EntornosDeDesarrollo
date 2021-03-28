/**
 * 
 * @author abelr
 *@version 3.0
 */

public class Calculadora {
/**
 * @param operando1 Valor entero que representa el operando 1
 * @param operando2 Valor entero que representa el operando 2
 * @param resultado Valor entero que representa el resultado de las operaciones
 * @return devuelve un entero
 * 
 */

	float resultado;
	
	public Calculadora() 
	{
		// TODO Auto-generated constructor stub
	}
	public void pedirOperandos()
	{
		System.out.println("Por favor introduzca el primer operando");
	}
	
	public float suma(float operando1, float operando2)
	{
		resultado = operando1 + operando2;
		return resultado;
	}

	public float resta(float operando1, float operando2)
	{
		resultado = operando1 - operando2;
		return resultado;
	}
	
	public float multiplicar(float operando1, float operando2)
	{
		resultado = operando1 * operando2;
		return resultado;
	}
	
	public float division(float operando1, float operando2)
	{
		if(operando2!=0)
		{
			resultado = operando1 / operando2;
			return resultado;
		}
		else 
		{
			System.out.println("El segundo operando no puede ser 0");
			return -1;
		}
	}
	
	public float raiz_cuadrada(float operando1)
	{
		if(operando1>=1)
		{
			return (float) Math.sqrt(operando1);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1 = new Calculadora();
		System.out.println("Método suma: "+c1.suma(1, 2));
		System.out.println("Método resta: "+c1.resta(1, 2));
		System.out.println("Metodo multiplicar: " + c1.multiplicar(3,2));
		System.out.println("Método division: "+c1.division(1, 0));
		System.out.println("Método raíz cuadrada: "+c1.raiz_cuadrada(-4));
}
}
