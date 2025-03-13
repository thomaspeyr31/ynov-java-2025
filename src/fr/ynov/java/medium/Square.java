package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {

    public static int carre(int nombre) {
        return nombre * nombre;
    }
//creation fe func
    public static void main(String[] args) {
        int nombre;

        if (args.length > 0) {

            try {
                nombre = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide en argument.");
                return;
            }
        } else {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre : ");
            nombre = scanner.nextInt();
            scanner.close();
        }

        int resultat = carre(nombre);
        System.out.println("Le carré de " + nombre + " est : " + resultat);
    }
}