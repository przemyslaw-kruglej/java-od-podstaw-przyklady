public class RezultatMetodyNieUzyty {
  public static void main(String[] args) {
    poleKwadratu(10);
  }

  public static int poleKwadratu(int bok) {
    int pole = bok * bok;

    System.out.printf(
        "Pole kwadratu o boku %d wynosi %d.", bok, pole
    );

    return pole;
  }
}
