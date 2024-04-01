import java.util.Scanner;

public class KilkaCaseDoJednejInstrukcji {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    switch (dzienTygodnia) {
      case 1: case 2: case 3: case 4: case 5:
        System.out.println("Dzień roboczy.");
        break;
      case 6: case 7:
        System.out.println("Weekend.");
        break;
      default:
        System.out.println("Nieznany dzień tygodnia.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
