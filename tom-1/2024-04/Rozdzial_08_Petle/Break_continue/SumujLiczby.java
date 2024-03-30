import java.util.Scanner;

public class SumujLiczby {
  public static void main(String[] args) {
    System.out.println(
        "Podaj liczby do zsumowania lub 0, aby zakończyć."
    );

    int suma = 0;
    int liczba;

    while (true) {
      System.out.print("Podaj liczbę: ");
      liczba = pobierzLiczbe();

      if (liczba == 0) {
        break;
      }

      suma += liczba;
    }

    System.out.println(
        "Suma podanych liczb wynosi: " + suma
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
