import java.util.Scanner;

public class UproszczonaInstrukcjaSwitchCaseRazem {
  public static void main(String[] args) {
    System.out.print("Podaj dzień tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    switch (dzienTygodnia) {
      case 1, 2, 3, 4, 5 ->
          System.out.println("Dzień roboczy.");
      case 6, 7 -> System.out.println("Weekend.");
      default ->
          System.out.println("Nieznany dzień tygodnia.");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
