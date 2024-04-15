import java.util.Scanner;

public class PierwiastekKwadratowy {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");
    int liczba = pobierzLiczbe();

    double pierwiastekLiczby = Math.sqrt(liczba);

    System.out.printf(
        "Pierwiastek kwadratowy liczby %d wynosi %.2f.",
        liczba,
        pierwiastekLiczby
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
