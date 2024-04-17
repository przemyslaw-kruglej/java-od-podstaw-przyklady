import java.util.Scanner;

public class Choinka {
  public static void main(String[] args) {
    System.out.print("Podaj liczbę gwiazdek w podstawie: ");
    int liczbaGwiazdekWPodstawie = pobierzLiczbe();

    int liczbaGwiazdekNaSzczycie =
        liczbaGwiazdekWPodstawie % 2 == 0 ? 2 : 1;

    for (
        int gwiazdkiWRzedzie = liczbaGwiazdekNaSzczycie;
        gwiazdkiWRzedzie <= liczbaGwiazdekWPodstawie;
        gwiazdkiWRzedzie += 2
    ) {
      int liczbaSpacji =
          (liczbaGwiazdekWPodstawie - gwiazdkiWRzedzie) / 2;

      for (int i = 0; i < liczbaSpacji + gwiazdkiWRzedzie; i++) {
        System.out.print(i < liczbaSpacji ? " " : "*");
      }
      System.out.println();
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}