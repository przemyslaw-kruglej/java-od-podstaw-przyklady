import java.util.Scanner;

public class ListaZadan {
  public static void main(String[] args) {
    String[] zadania = wczytajZadania();

    while (zadania.length > 0) {
      wyswietlZadania(zadania);

      System.out.print("\nKtóre zadanie wykonałeś(-aś)? ");
      int wykonaneZadanie = pobierzLiczbe() - 1;

      if (
          wykonaneZadanie < 0 ||
          wykonaneZadanie >= zadania.length
      ) {
        System.out.println("Nieprawidłowy numer zadania.");
      } else {
        System.out.println("Super! Jedno zadanie z głowy!");
        zadania = usunElement(zadania, wykonaneZadanie);
      }
    }

    System.out.println("\nBrak zadań - siesta.");
  }

  public static String[] wczytajZadania() {
    System.out.print("Ile zadań masz do wykonania? ");
    int ileZadan = pobierzLiczbe();

    String[] zadania = new String[Math.max(ileZadan, 0)];

    for (int i = 0; i < ileZadan; i++) {
      System.out.printf("Podaj zadanie nr #%d: ", i + 1);
      zadania[i] = pobierzLinieTekstu();
    }

    return zadania;
  }

  public static void wyswietlZadania(String[] zadania) {
    System.out.println("\nTwoja lista zadań to:");

    for (int i = 0; i < zadania.length; i++) {
      System.out.printf(
          "Zadanie #%d: %s\n", i + 1, zadania[i]
      );
    }
  }

  public static String[] usunElement(
      String[] tab, int indeksElementuDoUsuniecia
  ) {
    String[] kopiaBezJednegoElementu =
        new String[tab.length - 1];

    for (int i = 0; i < tab.length; i++) {
      if (i < indeksElementuDoUsuniecia) {
        kopiaBezJednegoElementu[i] = tab[i];
      } else if (i > indeksElementuDoUsuniecia) {
        kopiaBezJednegoElementu[i - 1] = tab[i];
      }
    }

    return kopiaBezJednegoElementu;
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static String pobierzLinieTekstu() {
    return new Scanner(System.in).nextLine();
  }
}
