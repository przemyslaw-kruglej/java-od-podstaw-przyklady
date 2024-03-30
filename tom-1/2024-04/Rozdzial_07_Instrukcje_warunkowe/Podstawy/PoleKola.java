import java.util.Scanner;

public class PoleKola {
  public static void main(String[] args) {
    System.out.print("Podaj promień koła: ");
    int promien = pobierzLiczbe();

    if (promien > 0) {
      double poleKola = Math.PI * promien * promien;
      System.out.printf(
          "Pole koła o promieniu %d wynosi %.2f",
          promien, poleKola
      );
    } else {
      System.out.println(
          "Promień koła musi być większy od zero."
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
