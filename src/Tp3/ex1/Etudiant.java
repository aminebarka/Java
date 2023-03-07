package Tp3.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Etudiant {
    private String nom;
    private String prenom;
    private double moyenne;

    public Etudiant(String nom, String prenom, double moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " - Moyenne : " + moyenne;
    }
}

