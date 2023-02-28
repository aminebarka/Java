package Exercice_3;

public class TestPaire {
    public static void main(String[] args) {
        Paire <String,Integer >pInt=new Paire<String,Integer>("A",5) ;
        pInt.afficher();



        Paire<Pays, Drapeau>[] tPaysDrapeaux = new Paire[5];


        for (int i = 0; i < tPaysDrapeaux.length; i++) {
            if (i == 0) {
                tPaysDrapeaux[i] = new Paire<>(new Pays("Tunisie", "Afrique"), new Drapeau(new String[]{"Cercle", "Croissant", "Etoile"}, new String[]{"Rouge", "Blanc"}));
            } else if (i == 1) {
                tPaysDrapeaux[i] = new Paire<>(new Pays("Algérie", "Afrique"), new Drapeau(new String[]{"Croissant", "Etoile"}, new String[]{"Rouge", "Blanc", "Vert"}));
            } else if (i == 2) {
                tPaysDrapeaux[i] = new Paire<>(new Pays("Maroc", "Afrique"), new Drapeau(new String[]{"Etoile"}, new String[]{"Rouge", "Vert"}));
            } else if (i == 3) {
                tPaysDrapeaux[i] = new Paire<>(new Pays("Libye", "Afrique"), new Drapeau(new String[]{"Croissant", "Etoile"}, new String[]{"Rouge", "Blanc"}));
            } else if (i == 4) {
                tPaysDrapeaux[i] = new Paire<>(new Pays("Egypte", "Afrique"), new Drapeau(new String[]{"Aigle"}, new String[]{"Rouge", "Blanc", "Noir"}));
            }
        }
        for (int i = 0; i < tPaysDrapeaux.length; i++) {
            tPaysDrapeaux[i].afficher();
        }
        for (Paire<Pays, Drapeau> p : tPaysDrapeaux) {
            p.afficher();
        }

    }};