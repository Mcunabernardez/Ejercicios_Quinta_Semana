package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Dame el valor de la base: ");
        float base = random.nextFloat();
        System.out.println("Dame el valor de la altura: ");
        float altura = random.nextFloat();
        float res = calculoArea(base, altura);
        System.out.println("El area es: "+res);
    }

    public static float calculoArea(float n1, float n2) {
        float resultado = n1 * n2;
        return resultado;
    }
}