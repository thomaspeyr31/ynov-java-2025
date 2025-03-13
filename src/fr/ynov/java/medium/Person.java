package fr.ynov.java.medium;

import java.time.LocalDate;

public class Person {
    String nom;
    String birthDate;
    String gender;
    float height;
    float weight;
    Nationality nationality;

    public enum Nationality {
        francais,
        anglais,
        belge,
        catalan,
        allemand,
    }

    public Person(String nom, String birthDate, String gender, float height, float weight, Nationality nationality) {
        this.nom = nom;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public static void showinfo() {
        System.out.println("Nom :");
        System.out.println("Age :");
        System.out.println("Gender :");
        System.out.println("Height :");
        System.out.println("Weight :");
        System.out.println("Nationality :");

    }

    public int calculerAge() {
        // Récupérer la date du jour
        // Convertir le String birthDate en date
        // Calculer la différence entre les deux
        // YYYY-MM-DD
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(this.birthDate);
        return today.getYear() - birthDate.getYear();
    }


}

