public class Temps {
    private  int heurs  ;
   private int minutes  ;
    private  int  secondes  ;
    public Temps (int heurs,int minutes,int secondes)
        throws TempsProblem {
        if (heurs <0 || heurs >23 )
            throw  new TempsProblem("l'heur doit être entre 0 et 23 ") ;
        if (minutes<0 || minutes>59)
            throw new TempsProblem("minutes invalide ") ;
        if (secondes <0 || secondes >59)
            throw new TempsProblem("le secondes est invalide ") ;
        this.secondes= secondes;
        this.minutes= minutes ;
        this.heurs = heurs ;

    }
    public void afficher () {
        System.out.println(String.format("%02d",heurs )+":"+String.format("%02d",minutes )+":"+String.format("%02d",secondes )) ;

    }
}
