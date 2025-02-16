package com.sio.models;

public class Aliment {
    private String nom;
    private boolean estBio;

    public Aliment(String nom, boolean estBio) {
        this.nom = nom;
        this.estBio = estBio;
    }

    // Affichage des informations de l'aliment
    public void afficher() {
        System.out.println("Aliment : " + nom + " - Bio : " + (estBio ? "Oui" : "Non"));
    }
}
