import java.util.Scanner;

public class KwadratLiczbyFor {
  public static void main(String[] args) {
    String czyKolejna = "t";

    for (int x; "t".equals(czyKolejna); czyKolejna = pobierzSlowo()) {
      System.out.print("Podaj liczbę: ");
      x = pobierzLiczbe();

      System.out.println("Kwadrat tej liczby to: " + x * x);
      System.out.print(
          "Czy chcesz podać kolejną liczbę? [t/n] "
      );
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }
}
