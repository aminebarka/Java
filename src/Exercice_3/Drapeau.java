package Exercice_3;

public class Drapeau {
    private String[] symboles;
    private String[] couleurs;

    public Drapeau(String[] symboles, String[] couleurs) {
        this.symboles = symboles;
        this.couleurs = couleurs;
    }

    public String[] getSymboles() {
        return this.symboles;
    }

    public String[] getCouleurs() {
        return this.couleurs;
    }

    public void setSymboles(String[] symboles) {
        this.symboles = symboles;
    }

    public void setCouleurs(String[] couleurs) {
        this.couleurs = couleurs;
    }

    public String toString() {
        return String.join(" + ", this.symboles) + " " + String.join(" + ", this.couleurs);
    }
}