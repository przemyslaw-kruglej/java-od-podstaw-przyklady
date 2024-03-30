import java.util.Scanner;

public class DzienTygodnia {
  public static void main(String[] args) {
    System.out.print("Podaj numer dnia w tygodniu: ");
    int dzienTygodnia = pobierzLiczbe();

    if (dzienTygodnia < 1) {
      System.out.println(
          "Dzień tygodnia musi być większy bądź równy 1."
      );
    } else if (dzienTygodnia > 7) {
      System.out.println(
          "Dzień tygodnia musi być mniejszy bądź równy 7."
      );
    } else if (dzienTygodnia == 1) {
      System.out.println("Poniedziałek! Praca :(");
    } else if (dzienTygodnia == 2) {
      System.out.println("Wtorek: prawie połowa tygodnia.");
    } else if (dzienTygodnia == 3) {
      System.out.println("Środa: połowa za nami!");
    } else if (dzienTygodnia == 4) {
      System.out.println("Czwartek czyli mały piątek.");
    } else if (dzienTygodnia == 5) {
      System.out.println("PIĄTEK!");
    } else if (dzienTygodnia == 6) {
      System.out.println("Sobota! Wolne!");
    } else if (dzienTygodnia == 7) {
      System.out.println("Niedziela - nadal wolne!");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
