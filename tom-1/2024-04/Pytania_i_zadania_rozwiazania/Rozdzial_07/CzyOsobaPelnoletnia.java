import java.util.Scanner;

public class CzyOsobaPelnoletnia {
  public static void main(String[] args) {
    System.out.print("Podaj swój wiek: ");
    int wiek = pobierzLiczbe();

    boolean czyOsobaPelnoletnia = wiek >= 18;

    if (czyOsobaPelnoletnia) {
      System.out.println("Jesteś osobą pełnoletnią.");
    } else {
      System.out.println("Nie jesteś osobą pełnoletnią.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
