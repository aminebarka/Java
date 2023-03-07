package Exercice_4;

public class TestPile {
    public static void main(String[] args) throws PileVide, PilePleine {
        Pile <Integer> p=new Pile<>(Integer.class);

        try {
            p.empiler(7);
            p.empiler(47);
            p.empiler(45);
            p.empiler(99);
            p.empiler(100);
            p.empiler(478);
            p.empiler(789);

            p.afficher();

            p.depiler();
            p.depiler();
            p.depiler();
            p.depiler();

        } finally {
            p.afficher();
        }

    }
}
