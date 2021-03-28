
public class Calculadora {


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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1 = new Calculadora();
		System.out.println("Método suma: "+c1.suma(1, 2));
		System.out.println("Método resta: "+c1.resta(1, 2));

}
}
