import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PapierKamienNozyce {
  public static void main(String[] args) {
    final int PAPIER = 0, KAMIEN = 1, NOZYCE = 2;
    final String[] NAZWY_ZNAKOW = {
        "PAPIER", "KAMIEŃ", "NOŻYCE"
    };

    do {
      System.out.println("""
          \nZagrajmy w papier-kamień-nożyce!
          1 - papier
          2 - kamień
          3 - nożyce""");

      System.out.print("\nJaki znak chcesz zagrać? ");
      int znakGracza = pobierzLiczbe() - 1;

      if (znakGracza < 0 || znakGracza > 2) {
        System.out.println("\nNieprawidłowy znak.\n");
      } else {
        int znakKomputera =
            ThreadLocalRandom.current().nextInt(3);

        System.out.printf(
            "\nZnak gracza vs. znak komputera: %s vs. %s\n",
            NAZWY_ZNAKOW[znakGracza],
            NAZWY_ZNAKOW[znakKomputera]
        );

        if (znakGracza == znakKomputera) {
          System.out.println("\n--- Remis! ---\n");
        } else if (
            (znakGracza == PAPIER && znakKomputera == KAMIEN) ||
            (znakGracza == KAMIEN && znakKomputera == NOZYCE) ||
            (znakGracza == NOZYCE && znakKomputera == PAPIER)
        ) {
          System.out.println("\nWygrałeś!\n");
        } else {
          System.out.println("\nPrzegrałeś!\n");
        }
      }

      System.out.print(
          "Czy chcesz zagrać ponownie? [t/n] "
      );
    } while ("t".equals(pobierzSlowo()));
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
