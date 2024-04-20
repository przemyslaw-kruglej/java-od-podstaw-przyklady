import java.util.Scanner;

public class PrzeliczanieDlugosciNaMetry {
  public static void main(String[] args) {
    System.out.print(
        "Podaj wartość i jednostkę oddzielone spacją: "
    );

    String dane = pobierzLinieTekstu();

    String[] wartoscIJednostka = dane.split(" ");

    if (wartoscIJednostka.length != 2) {
      System.out.println("Nieprawidłowy format danych.");
    } else {
      int wartosc = Integer.parseInt(wartoscIJednostka[0]);
      String jednostka = wartoscIJednostka[1];

      double wartoscWMetrach =
          zamienNaMetry(wartosc, jednostka);

      System.out.printf(
          "%d %s w metrach to: %.2f",
          wartosc, jednostka, wartoscWMetrach
      );
    }
  }

  public static String pobierzLinieTekstu() {
    return new Scanner(System.in).nextLine();
  }

  public static double zamienNaMetry(
      int wartosc, String jednostka
  ) {
    return switch (jednostka) {
      case "km" -> wartosc * 1000;
      case "mi" -> wartosc * 1609.344; // mile
      case "ft" -> wartosc * 0.30480; // stopy
      case "y" -> wartosc * 0.9144; // jardy
      case "in" -> wartosc * 0.0254; // cale
      default -> wartosc;
    };
  }
}
