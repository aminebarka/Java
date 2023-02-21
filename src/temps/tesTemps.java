package temps;

import java.util.Scanner;

public class tesTemps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temps t = null ;
        while (t == null) {
            try {
                System.out.println("h:");
                int h = sc.nextInt() ;
                System.out.println("m:");
                int m = sc.nextInt() ;
                System.out.println("s:");
                int s = sc.nextInt() ;
                t = new Temps(h,m,s) ;
            } catch (TempsProblem e ){
                System.out.println(e.getMessage());
            }
        }
        if (t != null)
            t.afficher() ;

    }
}