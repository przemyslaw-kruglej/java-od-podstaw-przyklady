import java.util.Scanner;

public class TrojargumentowyOperatorLogiczny2 {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int x = pobierzLiczbe();

    int wartoscAbsolutna = x >= 0 ? x : -x;

    System.out.printf(
        "Wartość absolutna liczby %d wynosi %d",
        x, wartoscAbsolutna
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
