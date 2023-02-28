package Exercice_3;

public class Pays {
    private String nom;
    private String continent;

    public Pays(String nom, String continent) {
        this.nom = nom;
        this.continent = continent;
    }

    public String getNom() {
        return this.nom;
    }

    public String getContinent() {
        return this.continent;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String toString() {
        return this.nom + " (" + this.continent + ")";
    }
}



