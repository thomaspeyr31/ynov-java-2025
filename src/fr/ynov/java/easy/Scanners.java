package fr.ynov.java.easy;
import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom :");
        String nom = sc.nextLine();
        System.out.println("Vous avez saisi : "+nom);

    }
}