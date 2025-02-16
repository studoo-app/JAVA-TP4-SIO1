package com.sio.models;

import java.util.ArrayList;

public class Animal {
    private int id;
    private String nom;
    private int age;
    private String espece;
    private Soigneur soigneur; // chaque animal est suivi par un soigneur
    private ArrayList<Aliment> aliments; // liste des aliments consommés par l'animal

    // Constructeur de base
    public Animal(int id, String nom, int age, String espece) {
        this.id = id;
        this.nom = nom;
        this.age = age;
        this.espece = espece;
        this.aliments = new ArrayList<>();
    }

    // Constructeur surchargé pour associer un soigneur dès la création
    public Animal(int id, String nom, int age, String espece, Soigneur soigneur) {
        this(id, nom, age, espece);
        this.soigneur = soigneur;
    }

    // Setter pour modifier l'âge
    public void setAge(int age) {
        this.age = age;
    }

    // Setter pour modifier le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Setter pour associer ou modifier le soigneur
    public void setSoigneur(Soigneur soigneur) {
        this.soigneur = soigneur;
    }

    // Méthode pour ajouter un aliment à la liste
    public void ajouterAliment(Aliment aliment) {
        this.aliments.add(aliment);
    }

    // Affichage de la liste des aliments consommés
    public void afficherAliments() {
        System.out.println("Liste des aliments consommés par " + nom + " :");
        for (Aliment aliment : aliments) {
            aliment.afficher();
        }
    }

    // Méthode d'affichage de toutes les informations sur l'animal
    public void afficher() {
        System.out.println("Animal ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Âge : " + age);
        System.out.println("Espèce : " + espece);
        if (soigneur != null) {
            System.out.print("Soigneur : ");
            soigneur.afficher();
        } else {
            System.out.println("Soigneur : non attribué");
        }
        if (aliments.isEmpty()) {
            System.out.println("Aucun aliment ajouté.");
        } else {
            afficherAliments();
        }
        System.out.println("-----------------------");
    }
}
