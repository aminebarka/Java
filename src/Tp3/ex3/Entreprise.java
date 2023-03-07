package Tp3.ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Création d'une entreprise
        Entreprise entreprise = new Entreprise("MaCompagnie");

        // Ajout de deux départements
        entreprise.ajouterDepartement("Département A");
        entreprise.ajouterDepartement("Département B");

        // Ajout d'employés
        Employe employe1 = new Employe("Doe", "John", "1234", 3000);
        entreprise.ajouterEmploye("Département A", employe1);

        Employe employe2 = new Employe("Smith", "Jane", "5678", 2500);
        entreprise.ajouterEmploye("Département A", employe2);

        Employe employe3 = new Employe("Martin", "Pierre", "91011", 4000);
        entreprise.ajouterEmploye("Département B", employe3);

        // Affichage des informations de l'entreprise
        entreprise.afficheEntrepriseInfo();

        // Reaffectation d'un employé à un autre département
        entreprise.reaffecterEmploye("1234", "Département B");

        // Affichage des informations de l'entreprise après la réaffectation
        entreprise.afficheEntrepriseInfo();
    }
}
