package Exercice_5;

public abstract class Couleur implements Comparable {
    private String nom;
    private int rouge;
    private int vert;
    private int bleu;

    public Couleur(String nom, int rouge, int vert, int bleu) {
        this.nom = nom;
        this.rouge = rouge;
        this.vert = vert;
        this.bleu = bleu;
    }

}