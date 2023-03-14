package TP4.Exercice1;

public class TestConstruction {
    public static void main(String[] args) {
        Construction construction = new Construction();

        // Ajout de blocs
        construction.empiler(3);
        construction.empiler(5);
        construction.empiler(2);
        construction.empiler(8);
        construction.empiler(3);

        // Affichage de la construction
        System.out.println("Construction :");
        construction.afficher();

        // Hauteur et total
        System.out.println("Hauteur : " + construction.getHauteur());
        System.out.println("Total : " + construction.getTotal());

        // Recherche
        BlocLego blocRecherche = construction.rechercher(5);
        if (blocRecherche != null) {
            System.out.println("Bloc trouvé : " + blocRecherche.getValeur());
        } else {
            System.out.println("Bloc non trouvé.");
        }

        // Suppression
        BlocLego blocSupprime = construction.supprimer(2);
        if (blocSupprime != null) {
            System.out.println("Bloc supprimé : " + blocSupprime.getValeur());
        } else {
            System.out.println("Bloc non supprimé.");
        }

        // Insertion
        construction.inserer(1, 7);

        // Suppression de tous les blocs de valeur 3
        construction.supprimerTout(3);

        // Destruction de la construction
        construction.detruire();
    }
}

