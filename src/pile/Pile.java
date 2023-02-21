package pile;

public class Pile {
    private int[] pile;
    private int taille;
    private int sommet;

    public Pile(int taille) {
        this.taille = taille;
        pile = new int[taille];
        sommet = -1;
    }

    public void empiler(int e) throws ExceptionPilePleine {
        if (pilePleine()) {
            throw new ExceptionPilePleine();
        }
        sommet++;
        pile[sommet] = e;
    }

    public void depiler() throws ExceptionPileVide {
        if (pileVide()) {
            throw new ExceptionPileVide();
        }
        sommet--;
    }

    public boolean pilePleine() {
        return (sommet == taille-1);
    }

    public boolean pileVide() {
        return (sommet == -1);
    }

    public void afficher() {
        if (pileVide()) {
            System.out.println("La pile est vide");
        } else {
            for (int i = sommet; i >= 0; i--) {
                System.out.println(pile[i]);
            }
        }
    }
}
