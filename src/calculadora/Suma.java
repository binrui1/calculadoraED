package calculadora;

public class Suma {
	
	private double array[]= new double[1];
	
	public Suma(double[] array) {
		this.array = array;
	}

	public String sumaReal(int num1,int num2) {
		double suma = num1+num2;
		return "el resultado de la suma de dos n�meros reales es: "+suma;
	}
	
	public String sumaEntero(int num1, int num2) {
		double suma=0;
		if (num1<=0 || num2<=0) {
			System.out.println("Uno de los n�meros introducidos no es un n�mero entero, aprendete lo que es un n�mero entero y vuelves luego.");
		}else {
			suma = num1+num2;
		}
		return "el resultado de la suma de dos n�meros enteros es: "+suma;
	}
	public String suma3Real(int num1,int num2,int num3) {
		double suma=0;
		suma=num1+num2+num3;
		return "el resultado de la suma de tres n�meros reales es: "+suma;
	}
	public double[] sumaAcum(int num) {
		array[0]+=num;
		return array;
	}
}