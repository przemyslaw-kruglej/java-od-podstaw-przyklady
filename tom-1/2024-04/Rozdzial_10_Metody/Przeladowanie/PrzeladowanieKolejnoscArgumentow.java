public class PrzeladowanieKolejnoscArgumentow {
  public static void main(String[] args) {
    wypisz("Liczba dni w tygodniu to:", 7);
    wypisz(10, "*");
  }

  public static void wypisz(String tekst, int liczba) {
    System.out.println(tekst + " " + liczba);
  }

  public static void wypisz(int liczba, String tekst) {
    for (int i = 0; i < liczba; i++) {
      System.out.print(tekst);
    }
    System.out.println();
  }
}
