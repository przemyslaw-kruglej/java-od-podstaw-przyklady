import java.util.Scanner;

public class WypiszStringPodanaLiczbeRazy {
  public static void main(String[] args) {
    System.out.print("Ile gwiazdek wypisać? ");

    int liczbaGwiazdek = pobierzLiczbe();

    wypiszWielokrotnosc("*", liczbaGwiazdek);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static void wypiszWielokrotnosc(
      String tekst, int ileRazy
  ) {
    for (int i = 0; i < ileRazy; i++) {
      System.out.print(tekst);
    }
  }
}
