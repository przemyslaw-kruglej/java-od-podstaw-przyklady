import java.util.Scanner;

public class InstrukcjaSwitchDzienTygodniaBezBreak {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    switch (dzienTygodnia) {
      case 1: System.out.println("Poniedziałek.");
      case 2: System.out.println("Wtorek.");
      case 3: System.out.println("Środa.");
      case 4: System.out.println("Czwartek.");
      case 5: System.out.println("Piątek.");
      case 6: System.out.println("Sobota.");
      case 7: System.out.println("Niedziela.");
      default:
        System.out.println(
            "Nieznany dzień tygodnia: " + dzienTygodnia
        );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
