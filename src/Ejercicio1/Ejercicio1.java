package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        System.out.println("Escribe cualquier número: ");
        int a = random.nextInt();
        System.out.println("Escribe otro número: ");
        int b = random.nextInt();
        boolean r = multiplo( a , b);
        System.out.println("Son ambos números múltiplos?\n"+r);
    }

    public static boolean multiplo(int n1, int n2){
        boolean resultado;
        if (n1 % n2 == 0 | n2 % n1 == 0) {
            resultado = true;
        } else{
            resultado = false;
        }
        return resultado;
    }
}