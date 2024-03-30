import java.util.Scanner;

public class DodawanieLiczbDoWhile {
  public static void main(String[] args) {
    int x, y;
    String czyDzialacDalej;

    do {
      System.out.print("Podaj pierwszą liczbę: ");
      x = pobierzLiczbe();

      System.out.print("Podaj drugą liczbę: ");
      y = pobierzLiczbe();

      System.out.println("Ich suma wynosi: " + (x + y));

      System.out.print(
          "Czy chcesz podać kolejne liczby? [t/n] "
      );
      czyDzialacDalej = pobierzSlowo();

      // wykonuj pętle dopóki użytkownik poda inną literę,
      // niż "t"
    } while ("t".equals(czyDzialacDalej));
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
