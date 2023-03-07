package Tp3.ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Statistique {
    private ArrayList<Mesure> alMesures;

    public Statistique() {
        alMesures = new ArrayList<Mesure>();
    }

    public Statistique(ArrayList<Mesure> alMesures) {
        this.alMesures = alMesures;
    }

    public boolean ajouter(Mesure m) {
        return alMesures.add(m);
    }

    public void afficher() {
        for (Mesure m : alMesures) {
            m.afficher();
        }
    }

    public void trierParAnnee() {
        Collections.sort(alMesures, new Comparator<Mesure>() {
            public int compare(Mesure m1, Mesure m2) {
                return m1.getAnnee() - m2.getAnnee();
            }
        });
    }

    public void trierParStation() {
        Collections.sort(alMesures, new Comparator<Mesure>() {
            public int compare(Mesure m1, Mesure m2) {
                return m1.getStation().compareTo(m2.getStation());
            }
        });
    }

    public void trierParQuantite() {
        Collections.sort(alMesures, new Comparator<Mesure>() {
            public int compare(Mesure m1, Mesure m2) {
                return Double.compare(m1.getQuantite(), m2.getQuantite());
            }
        });
    }

    public Statistique mesuresAnnee(int annee) {
        Statistique s = new Statistique();
        for (Mesure m : alMesures) {
            if (m.getAnnee() == annee) {
                s.ajouter(m);
            }
        }
        return s;
    }

    public Statistique mesuresStation(String station) {
        Statistique s = new Statistique();
        for (Mesure m : alMesures) {
            if (m.getStation().equals(station)) {
                s.ajouter(m);
            }
        }
        return s;
    }

    public void afficherMesureQuantiteMaximale() {
        Mesure max = Collections.max(alMesures, new Comparator<Mesure>() {
            public int compare(Mesure m1, Mesure m2) {
                return Double.compare(m1.getQuantite(), m2.getQuantite());
            }
        });
        max.afficher();
    }

    public void afficherQuantiteMoyenne() {
        double total = 0;
        int count = 0;
        for (Mesure m : alMesures) {
            total += m.getQuantite();
            count++;
        }
        double moyenne = total / count;
        System.out.println("Moyenne des quantités : " + moyenne);
    }
}
