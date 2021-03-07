package calculadora;

import java.util.Scanner;

public class Calculadora {

	static Scanner sc;
	static Cociente cociente;
	static Resta resta;
	static Suma suma;
	static Producto producto;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);

		System.out.println("Que opcion quieres hacer? 1 = dividir, 2 = resta, 3 = suma");
		int respuesta = Integer.parseInt(sc.nextLine());
		
		switch (respuesta) {
		case 1: {
			dividir("Introduce lo que quieras hacer? (1 = dividir reales, 2 = dividir enteros,"
					+ " 3 = Inverso real, 4 = raiz)");
			break;
		} 	case 2: {
			Resta("Introduce lo que quieras hacer? (1 = Restar reales, 2 = Restar enteros,"
					+ " 3 = Restar 3 real, 4 = resta acumulada)");
			break;
		} 	case 3: {
			Suma("Introduce lo que quieras hacer? (1 = sumar reales, 2 = sumar enteros,"
					+ " 3 = sumar 3 real, 4 = suma acumulada)");
			break;
		}  	case 4: {
			Producto("Introduce lo que quieras hacer? (1 = multiplicar reales, 2 = multiplicar enteros,"
					+ " 3 = producto 3 real, 4 = potencia)");
			break;
		}

		}
	}

	private static void Producto(String mensaje) {
		System.out.println(mensaje);
		int respuestaR = Integer.parseInt(sc.nextLine());
		
		switch (respuestaR) {
		case 1: {
			multiplicarReales();
			break;
		} 	case 2: {
			multiplicarEnteros();
			break;
		} 	case 3: {
			producto3Real();
			break;
		} case 4:
			potencia();
		}
		
	}

	private static void potencia() {
		System.out.println("Introduce la base");
		int base = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce potencia");
		int potencia = Integer.parseInt(sc.nextLine());
		producto.multiplicarEnteros(base, potencia);
		
	}

	private static void producto3Real() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el tercer numero");
		int tercerNumero = Integer.parseInt(sc.nextLine());
		producto.producto3Real(primerNumero, segundoNumero, tercerNumero);	
		
	}

	private static void multiplicarEnteros() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		producto.multiplicarEnteros(primerNumero, segundoNumero);
		
	}

	private static void multiplicarReales() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		producto.multiplicarReales(primerNumero, segundoNumero);
		
	}

	private static void Suma(String mensaje) {
		System.out.println(mensaje);
		int respuestaR = Integer.parseInt(sc.nextLine());
		
		switch (respuestaR) {
		case 1: {
			sumaReal();
			break;
		} 	case 2: {
			sumaEntero();
			break;
		} 	case 3: {
			suma3Real();
			break;
		} case 4:
			sumaAcum();
		}
		
	}

	private static void Resta(String mensaje) {
		System.out.println(mensaje);
		int respuestaC = Integer.parseInt(sc.nextLine());
		
		switch (respuestaC) {
		case 1: {
			restaReal();
			break;
		} 	case 2: {
			restaEntero();
			break;
		} 	case 3: {
			resta3Real();
			break;
		} case 4:
			restAcum();
		}
		
	}

	private static void sumaAcum() {
		System.out.println("Introduce el numero");
		int numeros = Integer.parseInt(sc.nextLine());
		suma.sumaAcum(numeros);
		
	}

	private static void suma3Real() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el tercer numero");
		int tercerNumero = Integer.parseInt(sc.nextLine());
		suma.suma3Real(primerNumero, segundoNumero, tercerNumero);	
		
	}

	private static void sumaEntero() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		suma.sumaEntero(primerNumero, segundoNumero);
		
	}

	private static void sumaReal() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		suma.sumaReal(primerNumero, segundoNumero);
		
	}

	private static void restAcum() {
		System.out.println("Introduce el numero");
		int numeros = Integer.parseInt(sc.nextLine());
		resta.restAcum(numeros);
	}

	private static void resta3Real() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el tercer numero");
		int tercerNumero = Integer.parseInt(sc.nextLine());
		resta.resta3Real(primerNumero, segundoNumero, tercerNumero);	
	}

	private static void restaEntero() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		resta.restaEntero(primerNumero, segundoNumero);
		
	}

	private static void restaReal() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		resta.restaReal(primerNumero, segundoNumero);
		
		
	}

	private static void dividir(String mensaje) {
		System.out.println(mensaje);
		int respuestaC = Integer.parseInt(sc.nextLine());
		
		switch (respuestaC) {
		case 1: {
			dividirReales();
			break;
		} 	case 2: {
			dividirEnteros();
			break;
		} 	case 3: {
			inversoReal();
			break;
		} case 4:
			raiz();
		}
		cociente = new Cociente();	
	}

	private static void raiz() {
		System.out.println("Introduce el numero");
		int numero = Integer.parseInt(sc.nextLine());
		cociente.inversoReal(numero); 
	}

	private static void inversoReal() {
		System.out.println("Introduce el numero");
		int numero = Integer.parseInt(sc.nextLine());
		cociente.inversoReal(numero);
	}

	private static void dividirEnteros() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		cociente.dividirEnteros(primerNumero, segundoNumero);
	}

	private static void dividirReales() {
		System.out.println("Introduce el primer numero");
		int primerNumero = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el segundo numero");
		int segundoNumero = Integer.parseInt(sc.nextLine());
		cociente.dividirReales(primerNumero, segundoNumero);
	}
}
