package TP4.Exercice1;

import java.util.LinkedList;

public class Construction {
    private LinkedList<BlocLego> blocs;

    public Construction() {
        blocs = new LinkedList<>();
    }

    public void empiler(BlocLego bloc) {
        blocs.push(bloc);
    }

    public void empiler(int valeur) {
        BlocLego bloc = new BlocLego(valeur);
        empiler(bloc);
    }

    public boolean inserer(int indice, BlocLego bloc) {
        if (indice < 0 || indice > blocs.size()) {
            return false;
        }
        blocs.add(indice, bloc);
        return true;
    }

    public boolean inserer(int indice, int valeur) {
        BlocLego bloc = new BlocLego(valeur);
        return inserer(indice, bloc);
    }

    public void afficher() {
        for (BlocLego bloc : blocs) {
            bloc.afficher();
        }
    }

    public int getHauteur() {
        return blocs.size();
    }

    public int getTotal() {
        int total = 0;
        for (BlocLego bloc : blocs) {
            total += bloc.getValeur();
        }
        return total;
    }

    public BlocLego rechercher(int valeur) {
        for (BlocLego bloc : blocs) {
            if (bloc.getValeur() == valeur) {
                return bloc;
            }
        }
        return null;
    }

    public BlocLego depiler() {
        return blocs.pop();
    }

    public BlocLego supprimer(int indice) {
        if (indice < 0 || indice >= blocs.size()) {
            return null;
        }
        return blocs.remove(indice);
    }

    public void supprimerTout(int valeur) {
        blocs.removeIf(bloc -> bloc.getValeur() == valeur);
    }

    public void detruire() {
        blocs.clear();
    }
}

