import java.util.Arrays;

public class TabliceWielowymiaroweIKlasaArrays {
  public static void main(String[] args) {
    int[][] liczby = {
        { 5, 10, 15 },
        { 7, 13, 42 },
        { -1, 0, 1 },
        { 100, 1000, 10000 },
        { -33, 66, 99 }
    };

    System.out.println(
        "liczby: " + Arrays.deepToString(liczby)
    );

    String[][] zdania = {
        { "Ala", "ma", "kota"},
        { "Kot", "ma", "beztroskie", "życie" }
    };
    String[][] inneZdania = {
        { "Ala", "ma", "kota" },
        { "Kot", "ma", "beztroskie", "życie" }
    };

    if (Arrays.deepEquals(zdania, inneZdania)) {
      System.out.println(
          "Tablice stringów mają taką samą zawartość."
      );
    }
  }
}
