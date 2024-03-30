import java.util.Scanner;

public class PoliczPoleKolaContinue {
  public static void main(String[] args) {
    int promien;

    do {
      System.out.print("Podaj promień koła: ");
      promien = pobierzLiczbe();

      if (promien <= 0) {
        System.out.println("""
            Nieprawidłowy promień. \
            Podaj liczbę większą od 0.
            """
        );
        continue;
      }

      double poleKola = Math.PI * promien * promien;
      System.out.printf(
          "Pole koła o tym promieniu wynosi: %.2f.",
          poleKola
      );
    } while (promien <= 0);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
