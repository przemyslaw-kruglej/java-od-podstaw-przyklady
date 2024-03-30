import java.util.Scanner;

public class PorownywanieStringowIgnoreCase {
  public static void main(String[] args) {
    String tajneHaslo = "pass123!";

    System.out.print("Podaj hasło: ");
    String podaneHaslo = pobierzSlowo();

    if (tajneHaslo.equalsIgnoreCase(podaneHaslo)) {
      System.out.println("Zgadza się!");
    } else {
      System.out.println("Błędne hasło!");
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
