import java.util.Arrays;

public class ScalanieTablic {
  public static void main(String[] args) {
    int[] liczby1 = new int[] { 7, 13, 42 };
    int[] liczby2 = new int[] { 100 };
    int[] liczby3 = new int[] { -5, 99, 12, 999 };

    int[] scaloneWartosci =
        scalTablice(liczby1, liczby2, liczby3);

    System.out.println(Arrays.toString(scaloneWartosci));
  }

  public static int[] scalTablice(int[]... tablice) {
    int ileElementowLacznie = 0;

    for (int[] tablica : tablice) {
      ileElementowLacznie += tablica.length;
    }
    int[] scaloneTablice = new int[ileElementowLacznie];

    int aktualnyIndeks = 0;

    for (int[] tablica : tablice) {
      for (int element : tablica) {
        scaloneTablice[aktualnyIndeks++] = element;
      }
    }

    return scaloneTablice;
  }
}
