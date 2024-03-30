public class PrzeladowaneMetodyWypiszTekst {
  public static void main(String[] args) {
    wypiszTekst("Ala ma kota.");
    wypiszTekst("Halo? ", 3);
  }

  public static void wypiszTekst(String tekst) {
    System.out.println(tekst);
  }

  public static void wypiszTekst(
      String tekst, int ileRazy
  ) {
    for (int i = 0; i < ileRazy; i++) {
      System.out.print(tekst);
    }
    System.out.println();
  }
}
