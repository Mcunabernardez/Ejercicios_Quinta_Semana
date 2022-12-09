package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Escribe cualquier número: ");
        int a = random.nextInt();
        boolean resultado1 = mayor100( a);
        boolean resultado2 = primo ( a);
        if (resultado1 == true){
            if (resultado2 == true) {
                System.out.println("El número es mayor que 100 y es primo");
            } else {
                System.out.println("El número no es mayor que 100 y no es primo");
            }
        } else if (resultado1 ==false){
            if (resultado2 == true) {
            System.out.println("El número no es mayor que 100 y es primo");
            } else {
                System.out.println("El número no es mayor que 100 y no es primo");
            }

        }

    }
    public static boolean mayor100 (int n1) {
        boolean rm100;
        rm100 = n1 > 100;
        return rm100;
    }
    public static boolean primo (int n2) {
        boolean rprimo = true;
        int i = 2;
        while (rprimo && i<n2){
            if (n2 % 2 == 0) {
                rprimo = false;
            } else {
                i++;
            }

        }
        return rprimo;
    }
}