package Exercice_4;

public class Couleur {
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

    public String getNom() {
        return nom;
    }

    public int getRouge() {
        return rouge;
    }

    public int getVert() {
        return vert;
    }

    public int getBleu() {
        return bleu;
    }

    @Override
    public String toString() {
        return nom + " (" + rouge + ", " + vert + ", " + bleu + ")";
    }
}
