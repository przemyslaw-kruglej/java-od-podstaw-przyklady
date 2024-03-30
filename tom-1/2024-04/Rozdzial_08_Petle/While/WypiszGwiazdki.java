import java.util.Scanner;

public class WypiszGwiazdki {
  public static void main(String[] args) {
    System.out.print("Ile gwiazdek wypisać? ");
    int liczbaGwiazdek = pobierzLiczbe();

    // dopóki liczba gwiazdek do wypisania
    // jest wieksza od zero...
    while (liczbaGwiazdek > 0) {
      // ...wypisz na ekran gwiazdkę
      System.out.print("*");
      liczbaGwiazdek--;
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
