package Exercice_3;

public class Paire<T, U> {
    private T premier;
    private U second;

    public Paire(T premier, U second) {
        this.premier = premier;
        this.second = second;
    }

    public T getPremier() {
        return this.premier;
    }

    public U getSecond() {
        return this.second;
    }

    public void setPremier(T premier) {
        this.premier = premier;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public void afficher() {
        System.out.println("(" + this.premier + ", " + this.second + ")");
    }
}

