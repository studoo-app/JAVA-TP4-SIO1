package com.sio;

import com.sio.models.Aliment;
import com.sio.models.Animal;
import com.sio.models.Soigneur;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Etape 2 : Instanciation et affichage d'un animal
        Animal lion = new Animal(1, "Simba", 5, "Lion");
        System.out.println("Affichage initial d'un animal :");
        lion.afficher();

        // Etape 3 : Modification des informations
        lion.setAge(6);
        lion.setNom("Simba Prime");
        System.out.println("Après modification :");
        lion.afficher();

        // Etape 4 : Création et gestion d'une collection d'animaux
        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(lion);
        animaux.add(new Animal(2, "Dumbo", 10, "Éléphant"));
        animaux.add(new Animal(3, "Tony", 3, "Tigre"));

        System.out.println("Affichage de tous les animaux du zoo :");
        for (Animal animal : animaux) {
            animal.afficher();
        }

        // Etape 5 : Ajout d'un soigneur et association aux animaux
        Soigneur soigneur1 = new Soigneur("Alice", "Martin");
        Soigneur soigneur2 = new Soigneur("Bob", "Durand");

        lion.setSoigneur(soigneur1);
        animaux.get(1).setSoigneur(soigneur2); // Pour Dumbo
        animaux.get(2).setSoigneur(soigneur1); // Pour Tony

        System.out.println("Affichage des animaux avec leurs soigneurs :");
        for (Animal animal : animaux) {
            animal.afficher();
        }

        // Etape 6 : Gestion des aliments
        Aliment aliment1 = new Aliment("Viande", false);
        Aliment aliment2 = new Aliment("Herbe", true);
        Aliment aliment3 = new Aliment("Fruit", true);

        // Ajouter des aliments aux animaux
        lion.ajouterAliment(aliment1);
        lion.ajouterAliment(aliment3);
        animaux.get(1).ajouterAliment(aliment2);
        animaux.get(2).ajouterAliment(aliment1);
        animaux.get(2).ajouterAliment(aliment2);

        System.out.println("Affichage final des animaux avec leurs aliments :");
        for (Animal animal : animaux) {
            animal.afficher();
        }
    }
}