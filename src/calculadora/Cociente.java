package calculadora;

public class Cociente {

	public int dividirReales (int num1,int num2) {
		System.out.println("Reales: " + num1 + "/" + num2 + " = " + num1/num2);
		return num1/num2;
	}
	
	public int dividirEnteros(int num1,int num2) {
		
		if (num1 < 0) {
			num1 += num1*-2;
		} else if (num2 < 0) {
			num2 += num2*-2;
		} 
		System.out.println("Enteros: " + num1 + "/" + num2 + " = " + num1/num2);
		return num1/num2;
	}
	
	public double inversoReal(double num) {
		double respuesta;
		respuesta = 1/num;
		System.out.println("El inverso de "+ num + " es: " + respuesta);
		return respuesta;
	}
	
	public int raiz (int num) {
		int i;
		int auxiliar = 0;
		boolean raiz = false;
		for (i = 1; i < num; i++) {
			if (i * i == num) {
				auxiliar = num;
				num = i;
				raiz = true;
			} 
		}
		if (!raiz) {
			System.out.println("El numero: " + num + " no tiene raiz");
		} else {
			System.out.println("La raiz de " + auxiliar + " es: " + num);
		}
		return num;
	}
	
}
