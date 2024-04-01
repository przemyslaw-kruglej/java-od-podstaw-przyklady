import java.util.Scanner;

public class UproszczonaInstrukcjaSwitch {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    String nazwaDnia;

    switch (dzienTygodnia) {
      case 1 -> nazwaDnia = "Poniedziałek";
      case 2 -> nazwaDnia = "Wtorek";
      case 3 -> nazwaDnia = "Środa";
      case 4 -> nazwaDnia = "Czwartek";
      case 5 -> {
        nazwaDnia = "Piątek";
        System.out.println("Jutro weekend!");
      }
      case 6 -> nazwaDnia = "Sobota";
      case 7 -> nazwaDnia = "Niedziela";
      default -> nazwaDnia = "Nieprawidłowy numer dnia.";
    }

    System.out.println(nazwaDnia);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
