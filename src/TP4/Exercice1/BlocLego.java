package TP4.Exercice1;

public class BlocLego {
    private int valeur;

    public BlocLego(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void afficher() {
        System.out.println(valeur);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlocLego)) return false;
        BlocLego blocLego = (BlocLego) o;
        return valeur == blocLego.valeur;
    }
}

