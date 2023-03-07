package Tp3.ex2;

import java.util.ArrayList;

public class TestStatistique {
    public static void main(String[] args) {
        Mesure[] tableau = Util.getTableau();
        ArrayList<Mesure> alMesures = new ArrayList<Mesure>();
        for (int i = 0; i < tableau.length; i++) {
            alMesures.add(tableau[i]);
        }
        Statistique s = new Statistique(alMesures);
        System.out.println("Liste des mesures :");

    }}
