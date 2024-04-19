import java.util.Arrays;
import java.util.Scanner;

public class KolkoIKrzyzyk {
  public static void main(String[] args) {
    Character[] znaki = new Character[9];
    Arrays.fill(znaki, ' ');
    int liczbaMozliwychRuchow = znaki.length;
    char znakAktualnegoGracza = 'x';
    String wynik = null;

    while (wynik == null) {
      wyswietlPlansze(znaki);
      int ruchGracza =
          pobierzRuchGracza(znakAktualnegoGracza);

      if (czyRuchPoprawny(ruchGracza, znaki)) {
        znaki[ruchGracza] = znakAktualnegoGracza;
        liczbaMozliwychRuchow--;

        if (sprawdzCzyWygrana(znaki, znakAktualnegoGracza)) {
          wynik = "Wygrał gracz " + znakAktualnegoGracza;
        } else if (liczbaMozliwychRuchow == 0) {
          wynik = "Remis!";
        } else {
          znakAktualnegoGracza =
              znakAktualnegoGracza == 'x' ? 'o' : 'x';
        }
      }
    }

    // musimy jeszcze raz wyświetlić planszę,
    // aby pokazać ostatni ruch
    wyswietlPlansze(znaki);
    System.out.println(wynik);
  }

  public static void wyswietlPlansze(Character[] znaki) {
    System.out.printf("""
        \n %s | %s | %s
        -----------
         %s | %s | %s
        -----------
         %s | %s | %s
        \n""", znaki);
  }

  public static int pobierzRuchGracza(char znakGracza) {
    System.out.println("Ruch gracza '" + znakGracza + "'");
    System.out.print("\nGdzie chcesz umieścić znak? [1-9] ");
    return pobierzLiczbe() - 1;
  }

  public static boolean czyRuchPoprawny(
      int ruchGracza, Character[] znaki
  ) {
    if (ruchGracza < 0 || ruchGracza >= znaki.length) {
      System.out.println("\n----- Nieprawidłowy ruch.\n");
      return false;
    } else if (znaki[ruchGracza] != ' ') {
      System.out.println("\n----- To pole jest już zajęte.\n");
      return false;
    }
    return true;
  }

  public static boolean sprawdzCzyWygrana(
      Character[] znaki, char znakGracza
  ) {
    int[][] polaWygrywajace = {
        { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, // rzędy
        { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, // kolumny
        { 0, 4, 8 }, { 2, 4, 6 } // lewa i prawa przekątna
    };
    for (int[] zestawPol : polaWygrywajace) {
      if (znaki[zestawPol[0]] == znaki[zestawPol[1]] &&
          znaki[zestawPol[1]] == znaki[zestawPol[2]] &&
          znaki[zestawPol[2]] == znakGracza) {
        return true;
      }
    }
    return false;
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
