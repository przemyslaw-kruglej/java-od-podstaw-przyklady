import java.util.Scanner;

public class PorownywanieStringowEqualsLiteral {
  public static void main(String[] args) {
    System.out.print("Podaj hasło: ");
    String podaneHaslo = pobierzSlowo();

    if ("pass123!".equals(podaneHaslo)) {
      System.out.println("Zgadza się!");
    } else {
      System.out.println("Błędne hasło!");
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
