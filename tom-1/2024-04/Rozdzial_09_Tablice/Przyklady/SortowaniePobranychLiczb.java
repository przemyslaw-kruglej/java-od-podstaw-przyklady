import java.util.Scanner;

public class SortowaniePobranychLiczb {
  public static void main(String[] args) {
    System.out.print("Ile liczb chcesz posortować? ");
    int ileLiczb = pobierzLiczbe();

    int[] liczby = new int[ileLiczb];

    for (int i = 0; i < liczby.length; i++) {
      System.out.printf("Podaj liczbę #%d: ", i + 1);
      liczby[i] = pobierzLiczbe();
    }

    for (int i = 1; i < liczby.length; i++) {
      int aktualnaLiczba = liczby[i];
      int j = i - 1; // wyznacza poprzedni element

      // dopóki poprzedni element jest większy niż aktualny,
      // przesuwamy go w prawo o jedno miejsce
      while (j >= 0 && liczby[j] > aktualnaLiczba) {
        liczby[j + 1] = liczby[j];
        j--;
      }

      // gdy pętla while się kończy, j + 1 wyznacza indeks
      // dla wartości, dla której szukaliśmy miejsca
      liczby[j + 1] = aktualnaLiczba;
    }

    System.out.println("Posortowane liczby:");

    for (int i = 0; i < liczby.length; i++) {
      System.out.print(liczby[i] + " ");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
