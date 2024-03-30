import java.util.Scanner;

public class PorownywanieStringowZaprzeczenie {
  public static void main(String[] args) {
    String tajneHaslo = "pass123!";

    System.out.print("Podaj hasło: ");
    String podaneHaslo = pobierzSlowo();

    if (!tajneHaslo.equals(podaneHaslo)) {
      System.out.println("Błędne hasło!");
    } else {
      System.out.println("Zgadza się!");
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
