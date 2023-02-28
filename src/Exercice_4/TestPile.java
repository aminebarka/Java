package Exercice_4;

public class TestPile {
    public static void main(String[] args) {
        Pile <Integer> p=new Pile<>(Integer.class);

        try {
            p.empiler(7);
            p.empiler(7);
            p.empiler(7);
            p.empiler(7);
            p.empiler(7);
            p.empiler(7);
            p.empiler(7);
            System.out.println(p.toString());
        } catch (PilePleine e) {
        //    throw new RuntimeException(e);
        }
        try {
            p.depiler() ;
        } catch (PileVide e) {
           // throw new RuntimeException(e);
        }
        System.out.println(p.toString());
    }
}
