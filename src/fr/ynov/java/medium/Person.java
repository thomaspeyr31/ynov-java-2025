package fr.ynov.java.medium;

public class Person {
    String nom;
    int age;
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

    public Person(String nom, int age, String gender, float height, float weight, Nationality nationality) {
        this.nom = nom;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }
    public static void showinfo (){
        System.out.println("Nom :");
        System.out.println("Age :");
        System.out.println("Gender :");
        System.out.println("Height :");
        System.out.println("Weight :");
        System.out.println("Nationality :");

    }

}

