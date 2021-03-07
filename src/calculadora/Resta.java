package calculadora;

public class Resta {
	
	private double array[]= new double[1];
	
	public Resta(double[] array) {
		this.array = array;
	}

	public String restaReal(int num1,int num2) {
		double rest = num1-num2;
		return "el resultado de la resta de dos números reales es: "+rest;
	}
	
	public String restaEntero(int num1, int num2) {
		double rest=0;
		if (num1<=0 || num2<=0) {
			System.out.println("Uno de los números introducidos no es un número entero, aprendete lo que es un número entero y vuelves luego.");
		}else {
			rest = num1-num2;
		}
		return "el resultado de la resta de dos números enteros es: "+rest;
	}
	public String resta3Real(int num1,int num2,int num3) {
		double rest=0;
		rest=num1-num2-num3;
		return "el resultado de la resta de tres números reales es: "+rest;
	}
	public double[] restAcum(int num) {
		array[0]-=num;
		return array;
	}
}
