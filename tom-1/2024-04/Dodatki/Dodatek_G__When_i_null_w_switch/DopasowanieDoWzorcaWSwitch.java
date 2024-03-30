import java.util.Scanner;

public class DopasowanieDoWzorcaWSwitch {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    String dzienTygodnia = pobierzSlowo();

    String rodzajDnia = switch (dzienTygodnia) {
      case null -> "<brak wartości>";
      case "1", "2", "3", "4", "5" -> "dzień roboczy";
      case "6", "7" -> "weekend";
      case String s
      when s.equalsIgnoreCase("poniedzialek") ||
           s.equalsIgnoreCase("wtorek") ||
           s.equalsIgnoreCase("sroda") ||
           s.equalsIgnoreCase("czwartek") ||
           s.equalsIgnoreCase("piatek") -> "dzień roboczy";
      case String s
      when s.equalsIgnoreCase("sobota") ||
           s.equalsIgnoreCase("niedziela") -> "weekend";
      default -> "nieznany dzień";
    };

    System.out.println("Jest to " + rodzajDnia);
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
