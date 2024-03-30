import java.util.Scanner;

public class TrojargumentowyOperatorLogiczny {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int x = pobierzLiczbe();

    int wartoscAbsolutna;

    if (x >= 0) {
      wartoscAbsolutna = x;
    } else {
      wartoscAbsolutna = -x;
    }

    System.out.printf(
        "Wartość absolutna liczby %d wynosi %d",
        x, wartoscAbsolutna
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
