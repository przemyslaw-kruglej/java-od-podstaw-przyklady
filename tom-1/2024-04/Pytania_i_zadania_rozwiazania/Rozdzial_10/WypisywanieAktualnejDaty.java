import java.time.LocalDate;

public class WypisywanieAktualnejDaty {
  public static void main(String[] args) {
    wypiszAktulnaDate();
  }

  public static void wypiszAktulnaDate() {
    LocalDate aktualnaData = LocalDate.now();
    int numerDniaTygodnia =
        aktualnaData.getDayOfWeek().getValue();
    int numerMiesiaca = aktualnaData.getMonthValue();
    int numerDniaMiesiaca = aktualnaData.getDayOfMonth();
    int rok = aktualnaData.getYear();

    System.out.printf(
        "Dzisiaj jest %s, %d dzień %s, %d roku. ",
        zamienDzienTygodniaNaNazwe(numerDniaTygodnia),
        numerDniaMiesiaca,
        zamienNumerMiesiacaNaNazwe(numerMiesiaca),
        rok
    );
  }

  public static String zamienDzienTygodniaNaNazwe(
      int numerDniaTygodnia
  ) {
    return switch (numerDniaTygodnia) {
      case 1 -> "poniedziałek";
      case 2 -> "wtorek";
      case 3 -> "środa";
      case 4 -> "czwartek";
      case 5 -> "piątek";
      case 6 -> "sobota";
      case 7 -> "niedziela";
      default -> "nieznany dzień";
    };
  }

  public static String zamienNumerMiesiacaNaNazwe(
      int numerMiesiaca
  ) {
    return switch (numerMiesiaca) {
      case 1 -> "stycznia";
      case 2 -> "lutego";
      case 3 -> "marca";
      case 4 -> "kwietnia";
      case 5 -> "maja";
      case 6 -> "czerwca";
      case 7 -> "lipca";
      case 8 -> "sierpnia";
      case 9 -> "września";
      case 10 -> "października";
      case 11 -> "listopada";
      case 12 -> "grudnia";
      default -> "nieznany miesiąc";
    };
  }
}
