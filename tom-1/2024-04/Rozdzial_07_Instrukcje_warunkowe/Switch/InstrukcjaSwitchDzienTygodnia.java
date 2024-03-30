import java.util.Scanner;

public class InstrukcjaSwitchDzienTygodnia {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    switch (dzienTygodnia) {
      case 1:
        System.out.println("Poniedziałek.");
        break;
      case 2:
        System.out.println("Wtorek.");
        break;
      case 3:
        System.out.println("Środa.");
        break;
      case 4:
        System.out.println("Czwartek.");
        break;
      case 5:
        System.out.println("Piątek.");
        break;
      case 6:
        System.out.println("Sobota.");
        break;
      case 7:
        System.out.println("Niedziela.");
        break;
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
