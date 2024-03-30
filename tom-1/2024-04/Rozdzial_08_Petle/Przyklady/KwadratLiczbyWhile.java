import java.util.Scanner;

public class KwadratLiczbyWhile {
  public static void main(String[] args) {
    int x;
    String czyKontynuowac = "t";

    while ("t".equals(czyKontynuowac)) {
      System.out.print("Podaj liczbę: ");
      x = pobierzLiczbe();

      System.out.println("Kwadrat tej liczby to: " + x * x);

      System.out.print(
          "Czy chcesz podać kolejną liczbę? [t/n] "
      );
      czyKontynuowac = pobierzSlowo();
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
