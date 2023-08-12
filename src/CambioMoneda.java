import java.util.Scanner;
/*
Desarrollar un programa que pueda calcular el valor del tipo de
cambio de moneda (pesos colombianos– hacia dólar y viceversa)
 */
public class CambioMoneda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dinero: ");
        float cantidadDinero = sc.nextFloat();
        System.out.println("Ingrese la divisa:\n1. COP\n2. US");
        System.out.print("Respuesta: ");
        int divisa = sc.nextInt();

        switch (divisa) {
            case 1 -> System.out.println("La coversion de COP a US es: " + convercionCOP_US(cantidadDinero));
            case 2 -> System.out.println("La conversion de US a COP es: " + convercionUS_COP(cantidadDinero));
            default -> System.out.println("Opción no valida");
        }

    }
    public static float convercionCOP_US(float cantidadDinero){
        float dolarHoy = 4089f;

        float resultado =0f;
        resultado = cantidadDinero/dolarHoy;

        return resultado;
    }
    public  static  float convercionUS_COP(float cantidadDinero){
        float dolarHoy = 4089f;

        float resultado = 0f;
        resultado = cantidadDinero*dolarHoy;

        return  resultado;
    }
}
