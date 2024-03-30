public class ZmiennaLokalnaAktualizowana {
  public static void main(String[] args) {
    wypiszKomunikat("Uwaga! Będzie padać.");
    wypiszKomunikat("Uwaga! Nie będzie padać.");
    wypiszKomunikat("Uwaga! Wróżę pogodę z fusów.");
  }

  public static void wypiszKomunikat(String komunikat) {
    int ileRazyWywolana = 0;

    System.out.println("Komunikat: " + komunikat);

    ileRazyWywolana++;

    System.out.printf(
        "Ta metoda została już wywołana %d raz(y).\n\n",
        ileRazyWywolana
    );
  }
}
