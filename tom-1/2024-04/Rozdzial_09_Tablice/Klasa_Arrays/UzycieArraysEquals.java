import java.util.Arrays;

public class UzycieArraysEquals {
  public static void main(String[] args) {
    int[] liczby = { 7, 13, 42 };
    int[] inneLiczby = { 7, 13, 42 };

    if (Arrays.equals(liczby, inneLiczby)) {
      System.out.println("Tablice liczb są takie same.");
    } else {
      System.out.println("Tablice liczb się różnią.");
    }

    String[] slowa = { "Ala", "ma", null };
    String[] inneSlowa = { "Ala", "ma", null };

    if (Arrays.equals(slowa, inneSlowa)) {
      System.out.println("Tablice słów są takie same.");
    } else {
      System.out.println("Tablice słów nie są takie same.");
    }

    char[] znaki = null;
    char[] inneZnaki = null;

    if (Arrays.equals(znaki, inneZnaki)) {
      System.out.println("Tablice znaków są takie same.");
    } else {
      System.out.println("Tablice znaków się różnią.");
    }
  }
}
