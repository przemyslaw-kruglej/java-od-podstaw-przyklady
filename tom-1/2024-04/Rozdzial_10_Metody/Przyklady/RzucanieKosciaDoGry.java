import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RzucanieKosciaDoGry {
  public static void main(String[] args) {
    System.out.print("Ile razy chcesz rzucić kostką? ");
    int ileRazy = pobierzLiczbe();

    if (ileRazy < 0) {
      System.out.println(
          "Spodziewałem się liczby nieujemnej."
      );
    } else {
      for (int i = 1; i <= ileRazy; i++) {
        System.out.printf(
            "\nRzut kostką #%d: %d",
            i,
            wylosujLiczbeZZakresu(1, 7)
        );
      }
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static int wylosujLiczbeZZakresu(int min, int max) {
    return ThreadLocalRandom.current().nextInt(min, max);
  }
}
