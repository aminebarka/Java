package Tp3.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EtudiantTest {
    public static void main(String[] args) {
        ArrayList<Etudiant> etudiantList = new ArrayList<>();
        etudiantList.add(new Etudiant("Mohamed", "Ben Mohamed", 13.54));
        etudiantList.add(new Etudiant("Salah", "Ben Salah", 8.87));
        etudiantList.add(new Etudiant("Fatma", "Tounsi", 14.27));
        etudiantList.add(new Etudiant("Ali", "Ben Ali", 10.12));
        etudiantList.add(new Etudiant("Mahmoud", "Ben Mahmoud", 9.83));

        // Afficher tous les étudiants ainsi que leurs moyennes
        for (Etudiant etudiant : etudiantList) {
            System.out.println(etudiant);
        }

        // Calculer et afficher la moyenne de la classe
        double somme = 0;
        for (Etudiant etudiant : etudiantList) {
            somme += etudiant.getMoyenne();
        }
        double moyenneClasse = somme / etudiantList.size();
        System.out.println("Moyenne de la classe : " + moyenneClasse);

        // Afficher les étudiants par ordre décroissant de leurs moyennes
        Collections.sort(etudiantList, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return Double.compare(e2.getMoyenne(), e1.getMoyenne());
            }
        });
        System.out.println("Etudiants par ordre décroissant de leurs moyennes : ");
        for (Etudiant etudiant : etudiantList) {
            System.out.println(etudiant);
        }

        // Supprimer les étudiants n'ayant pas de moyenne de la liste etudiantList
        etudiantList.removeIf(e -> e.getMoyenne() == 0);
        System.out.println("Liste des étudiants après suppression des étudiants n'ayant pas de moyenne : ");
        for (Etudiant etudiant : etudiantList) {
            System.out.println(etudiant);
        }
    }
}
