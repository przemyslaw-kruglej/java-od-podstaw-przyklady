import java.util.Scanner;

public class SprawdzImie {
  public static void main(String[] args) {
    System.out.print("Podaj swoje imię: ");
    String imie = pobierzSlowo();

    if (imie.equals("Przemek")) {
      System.out.println("Mamy takie samie imiona.");
    } else {
      System.out.println("Mamy różne imiona.");
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}