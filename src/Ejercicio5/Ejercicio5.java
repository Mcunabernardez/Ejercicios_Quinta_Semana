package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner random = new Scanner(System.in);
        int media = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("introduce el número " + (i + 1));
            int dato = random.nextInt();
            media += dato;
        }
        System.out.println("la media es " + (media / 10));
    }
}