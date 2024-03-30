import java.util.Arrays;

public class UzycieArraysSort {
  public static void main(String[] args) {
    int[] liczby = { -1, 42, 7, -25, 99, 0 };
    char[] znaki = { 'z', 'c', 'f', 'k', 'a', 'B' };
    String[] slowa = { "java", "programowanie", "nauka" };

    Arrays.sort(liczby);
    Arrays.sort(znaki);
    Arrays.sort(slowa);

    System.out.println(
        "Posortowane liczby: " + Arrays.toString(liczby)
    );
    System.out.println(
        "Posortowane znaki: " + Arrays.toString(znaki)
    );
    System.out.println(
        "Posortowane słowa: " + Arrays.toString(slowa)
    );
  }
}
