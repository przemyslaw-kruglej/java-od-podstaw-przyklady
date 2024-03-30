import java.util.Scanner;

public class JavadocProstyPrzyklad {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę: ");

    int x = pobierzLiczbe();

    System.out.println(
        "Ta liczba do kwadratu to " + policzKwadrat(x)
    );
  }

  /**
   * Czeka na podanie przez użytkownika liczby całkowitej,
   * po czym ją zwraca. Jeżeli podana zostanie wartość inna,
   * niż liczba, to działanie metody zakończy się błędem.
   *
   * @return liczba podana przez użytkownika
   */
  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  /**
   * Zwraca przesłaną liczbę podniesioną do kwadratu.
   * Przykład: dla argumentu 5 zwróci 25.
   *
   * @param liczba  wartość, którą chcemy
   *                podnieść do kwadratu
   * @return        wartość podniesiona do kwadratu
   */
  public static int policzKwadrat(int liczba) {
    return liczba * liczba;
  }
}
