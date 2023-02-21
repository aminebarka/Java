package pile;

public class TestPile {
    public static void main(String[] args) {
        Pile pile = new Pile(10);

        try {
            pile.empiler(5);
            pile.empiler(10);
            pile.empiler(15);
            pile.afficher();

            pile.depiler();
            pile.afficher();

            pile.empiler(20);
            pile.empiler(25);
            pile.empiler(30);
            pile.empiler(35);
            pile.empiler(40);
            pile.empiler(45);
            pile.empiler(50);
            pile.empiler(55);
            pile.empiler(60); // Pile pleine : lance une ExceptionPilePleine

            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler();
            pile.depiler(); // Pile vide : lance une ExceptionPileVide

            pile.afficher();
        } catch (ExceptionPilePleine e) {
            System.out.println("Pile pleine !");
        } catch (ExceptionPileVide e) {
            System.out.println("Pile vide !");
        }
    }
}
