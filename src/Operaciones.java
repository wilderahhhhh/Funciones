/*
Diseñe un programa en java que muestre un menú al usuario con las
siguientes opciones: potenciación, raíz cuadrada y terminar, que cada opción
la realice un método.
 */

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("1. Potenciación\n2. Raíz cuadrada\n3. Terminar");
        System.out.print("Ingrese el indice de la operación que desea realizar: ");
        int operacion = sc.nextInt();


        switch (operacion) {
            case 1 -> System.out.println("El resultado de la potenciación es: " + potencia());
            case 2 -> System.out.println("El resultado de la raiz cuadrada es: " + raizCuadrada());
            case 3 -> System.out.println("Terminar");
            default -> System.out.println("Opción no validad");
        }
    }

    public static double potencia(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero de la base: ");
        double num1=sc.nextDouble();
        System.out.print("Ingrese el numero del exponente: ");
        double num2=sc.nextDouble();

        double resultadoPotencia = 0;
        resultadoPotencia = Math.pow(num1, num2);

        return resultadoPotencia;
    }

    public static double raizCuadrada(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double num1=sc.nextDouble();
        double resultadoRaizCuadrada =0;
        resultadoRaizCuadrada = Math.sqrt(num1);

        return resultadoRaizCuadrada;
    }

}