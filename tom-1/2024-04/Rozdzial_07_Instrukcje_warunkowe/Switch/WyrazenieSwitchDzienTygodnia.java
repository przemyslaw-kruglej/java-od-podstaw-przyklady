import java.util.Scanner;

public class WyrazenieSwitchDzienTygodnia {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    String nazwaDnia = switch (dzienTygodnia) {
      case 1 -> "Poniedziałek";
      case 2 -> "Wtorek";
      case 3 -> "Środa";
      case 4 -> "Czwartek";
      case 5 -> "Piątek";
      case 6 -> "Sobota";
      case 7 -> "Niedziela";
      default -> "Nieprawidłowy numer dnia.";
    };

    System.out.println(nazwaDnia);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
