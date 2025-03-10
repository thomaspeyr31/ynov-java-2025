package fr.ynov.java.easy;

public class Square {

    public static int carre(int nombre) {
        return nombre * nombre;
    }

    public static void main(String[] args) {
        int nombre = 5;
        int resultat = carre(nombre);
        System.out.println("Le carré de " + nombre + " est : " + resultat);
    }
}
