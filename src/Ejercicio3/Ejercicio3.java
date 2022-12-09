package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner random = new Scanner(System.in);
        System.out.println("Escribe cualquier cosa");
        String imput = random.nextLine();
        for (int i=0; i<imput.length();i++){
            System.out.println(imput.charAt(i));
        }
    }
}