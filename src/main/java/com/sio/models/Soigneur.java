package com.sio.models;

public class Soigneur {
    private String prenom;
    private String nom;

    public Soigneur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    // Affichage des informations du soigneur
    public void afficher() {
        System.out.println(prenom + " " + nom);
    }
}
