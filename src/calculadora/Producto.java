package calculadora;

public class Producto {

    public int multiplicarReales (int num1,int num2) {
        System.out.println("Reales: " + num1 + "x" + num2 + " = " + num1*num2);
        return num1*num2;
    }

    public int multiplicarEnteros(int num1,int num2) {

        if (num1 < 1) {
            num1 += num1-2;
        } else if (num2 < 1) {
            num2 += num2-2;
        } 
        System.out.println("Enteros: " + num1 + "" + num2 + " = " + num1*num2);
        return num1*num2;
    }
    public String producto3Real(int num1,int num2,int num3) {
        double rest=0;
        rest=num1*num2*num3;
        return "el resultado del producto de tres números reales es: "+rest;
    }
    public int potencia(int base, int exponente) {
        int rest =base;
        for (int i = 1; i < exponente; i++) {
            rest *= base;
        }
        return rest;

    }

}