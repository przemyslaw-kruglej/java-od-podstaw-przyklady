import java.util.Scanner;

public class NumerMiesiacaBezDefault {
  public static void main(String[] args) {
    System.out.print("Podaj numer miesiąca: ");
    int numerMiesiaca = pobierzLiczbe();

    if (numerMiesiaca < 1 || numerMiesiaca > 12) {
      System.out.println("Nieprawidłowy numer miesiąca.");
    } else {
      String nazwaMiesiaca = switch (numerMiesiaca) {
        case 1 -> "styczeń";
        case 2 -> "luty";
        case 3 -> "marzec";
        case 4 -> "kwiecień";
        case 5 -> "maj";
        case 6 -> "czerwiec";
        case 7 -> "lipiec";
        case 8 -> "sierpień";
        case 9 -> "wrzesień";
        case 10 -> "październik";
        case 11 -> "listopad";
        default -> "grudzień";
      };

      System.out.printf(
          "Miesiąc o numerze %d to %s.",
          numerMiesiaca,
          nazwaMiesiaca
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
