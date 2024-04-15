import java.util.Scanner;

public class PoleIObwodKwadratu {
  public static void main(String[] args) {
    System.out.print("Podaj długość boku kwadratu: ");
    int bok = pobierzLiczbe();

    int poleKwadratu = bok * bok;
    int obwodKwadratu = 4 * bok;

    System.out.printf(
        "Pole kwadratu o boku %d to %d, a jego obwód to %d.",
        bok, poleKwadratu, obwodKwadratu
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
