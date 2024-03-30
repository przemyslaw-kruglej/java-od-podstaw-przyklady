import java.util.Scanner;

public class DopasowanieDoWzorcaPrzedJava21 {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    String dzienTygodnia = pobierzSlowo();

    String rodzajDnia;

    if (dzienTygodnia == null) {
      rodzajDnia = "<brak wartości>";
    } else {
      String dzienTygodniaMalymiLiterami =
          dzienTygodnia.toLowerCase();

      rodzajDnia = switch (dzienTygodniaMalymiLiterami) {
        case "1", "2", "3", "4", "5",
            "poniedzialek", "wtorek", "sroda",
            "czwartek", "piatek" -> "dzień roboczy";
        case "6", "7", "sobota", "niedziela" -> "weekend";
        default -> "nieznany dzień";
      };
    }

    System.out.println("Jest to " + rodzajDnia);
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
