import java.util.Scanner;

public class WyrazenieSwitchDzienTygodniaBezDefault {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    // błąd - brakuje sekcji default
    // odkomentuj poniższy kod, aby zobaczyć
    // jaki błąd zgłosi kompilator
    /*String nazwaDnia = switch (dzienTygodnia) {
      case 1 -> "Poniedziałek";
      case 2 -> "Wtorek";
      case 3 -> "Środa";
      case 4 -> "Czwartek";
      case 5 -> "Piątek";
      case 6 -> "Sobota";
      case 7 -> "Niedziela";
    };

    System.out.println(nazwaDnia);*/
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
