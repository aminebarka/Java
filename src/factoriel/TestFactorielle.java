package factoriel;

public class TestFactorielle {
 public static void main(String[] args) {
  try {
   if (args.length == 0) {
    throw new ArrayIndexOutOfBoundsException("Pas d'argument lu");
   }

   int n = Integer.parseInt(args[0]);

   if (n < 0) {
    throw new ExceptionNegative("La valeur de l'argument est négative");
   }

   int resultat = factorielle(n);

   System.out.println(n + "! = " + resultat);
  } catch (ArrayIndexOutOfBoundsException e) {
   System.out.println("Erreur : " + e.getMessage());
  } catch (NumberFormatException e) {
   System.out.println("Erreur : la valeur de l'argument n'est pas entière");
  } catch (ExceptionNegative e) {
   System.out.println("Erreur : " + e.getMessage());
  }
 }

 public static int factorielle(int n) {
  if (n == 0) {
   return 1;
  } else {
   return n * factorielle(n - 1);
  }
 }
}

class ExceptionNegative extends Exception {
 public ExceptionNegative(String message) {
  super(message);
 }
}

