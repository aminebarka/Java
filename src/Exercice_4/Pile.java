package Exercice_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pile<T> {
    @Override
    public String toString() {
        return "Pile{" +
                "CAPACITE=" + CAPACITE +
                ", tableau=" + Arrays.toString(tableau) +
                ", nbeElement=" + nbeElement +
                '}';
    }

    private final int CAPACITE = 7;
    private T[] tableau;
    private int nbeElement;
    public Pile(Class<T> classeDeT){
        tableau= (T[]) Array.newInstance(classeDeT,CAPACITE );
        nbeElement = 0 ;
    }
    public void empiler(T element) throws PilePleine {
        if (nbeElement == CAPACITE ) {
            throw new PilePleine();
        }
        tableau[nbeElement++] = element;
    }
    public T getnbeElement() throws PileVide {
        if (nbeElement == -1) {
            throw new PileVide();
        }
        return tableau[nbeElement];
    }

    public T depiler() throws PileVide {
        if (nbeElement == 0) {
            throw new PileVide();
        }
        T element = tableau[nbeElement];
        tableau[nbeElement--] = null;
        return element;
    }

    public boolean estVide() {
        return nbeElement == -1;
    }

    public int getHauteur() {
        return nbeElement + 1;
    }

    public void afficher() {
        System.out.print("[ ");
        for (int i = nbeElement; i >= 0; i--) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println("]");
    }
}




