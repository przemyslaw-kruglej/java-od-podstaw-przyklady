import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ZgadywanieSlowa {
  public static void main(String[] args) {
    String haslo = wylosujHaslo();
    char[] odgadnieteLitery = new char[haslo.length()];
    Arrays.fill(odgadnieteLitery, '_');
    int ileLiterOdgadnieto = 0;

    System.out.println("Odgadnij hasło!");
    wypiszHaslo(odgadnieteLitery);

    do {
      System.out.print(
          "\nPodaj literę lub odgadnięte hasło: "
      );
      String literaLubHaslo = pobierzSlowo();

      if (literaLubHaslo.length() == 1) {
        for (int i = 0; i < haslo.length(); i++) {
          if (
              haslo.charAt(i) == literaLubHaslo.charAt(0) &&
              odgadnieteLitery[i] == '_'
          ) {
            ileLiterOdgadnieto++;
            odgadnieteLitery[i] = haslo.charAt(i);
          }
        }
        wypiszHaslo(odgadnieteLitery);
      } else {
        if (haslo.equalsIgnoreCase(literaLubHaslo)) {
          System.out.println(
              "Gratulacje! Odgadłeś(-aś) hasło."
          );
          break;
        } else {
          System.out.println("Nieprawidłowe hasło.");
        }
      }
    } while (ileLiterOdgadnieto < haslo.length());

    if (ileLiterOdgadnieto == haslo.length()) {
      System.out.println(
          "Gratulacje! Podałeś(-aś) wszystkie litery hasła."
      );
    }
  }

  public static String wylosujHaslo() {
    String[] hasla = {
        "programowanie", "nauka", "hipopotam", "kapibara",
        "herbata", "java", "samolot", "lemoniada", "pizza",
        "spacer", "muzyka", "telewizor", "kosmos", "gitara"
    };

    int losowyIndeksHasla =
        ThreadLocalRandom.current().nextInt(hasla.length);

    return hasla[losowyIndeksHasla];
  }

  public static void wypiszHaslo(char[] literyHasla) {
    for (char znak : literyHasla) {
      System.out.print(znak + " ");
    }
    System.out.println();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
