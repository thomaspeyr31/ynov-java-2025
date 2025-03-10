package fr.ynov.java.easy;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez saisir un nombre : ");
        int nombre = sc.nextInt();

        System.out.print("Veuillez saisir un autre nombre : ");
        int nombre2 = sc.nextInt();

        System.out.println("Vous avez saisi " + nombre + " et " + nombre2);

        int resultat = nombre + nombre2;
        System.out.println("La somme est : " + resultat);

        sc.close();
    }
}
