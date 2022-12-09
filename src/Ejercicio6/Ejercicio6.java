package Ejercicio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        int option;
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");;
        System.out.println("4. Multiplicar");
            try {
                System.out.println("Escribe una de las opciones");
                option = random.nextInt();
                System.out.println("Que valores quieres calcular");
                int num1 = random.nextInt();
                int num2 = random.nextInt();
                switch (option) {
                    case 1:
                        int resultadosuma = sumar(num1, num2);
                        System.out.println(num1+" + "+num2+" = "+resultadosuma);
                        break;
                    case 2:
                        int resultadoresta = restar( num1, num2);
                        System.out.println(num1+" - "+num2+" = "+resultadoresta);
                        break;
                    case 3:
                        int resultadodivision = dividir( num1, num2);
                        System.out.println(num1+" / "+num2+" = "+resultadodivision);
                        break;
                    case 4:
                        int resultadomulti = multiplicar( num1, num2);
                        System.out.println(num1+" * "+num2+" = "+resultadomulti);
                        break;
                    default:
                        System.out.println("Solo números del 1 al 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
            }

    }

    public static int sumar(int a, int b) {
        int r1 =  a+b;
        return r1;
    }

    public static int restar(int a, int b) {
        int r2 = a-b;
        return r2;
    }

    public static int dividir(int a, int b) {
        int r3 = a/b;
        return r3;
    }

    public static int multiplicar (int a, int b) {
        int r4 = a*b;
        return r4;
    }
}