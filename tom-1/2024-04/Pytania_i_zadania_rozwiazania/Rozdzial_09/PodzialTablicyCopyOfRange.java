import java.util.Arrays;

public class PodzialTablicyCopyOfRange {
  public static void main(String[] args) {
    int[] tablicaZrodlowa = { 1, 20, 100, 3, 40 };

    int dlugoscPierwszejPolowy =
        (int) Math.ceil(tablicaZrodlowa.length / 2.0);

    int[] pierwszaPolowa = Arrays.copyOfRange(
        tablicaZrodlowa, 0, dlugoscPierwszejPolowy
    );

    int[] drugaPolowa = Arrays.copyOfRange(
        tablicaZrodlowa,
        dlugoscPierwszejPolowy,
        tablicaZrodlowa.length
    );

    System.out.println(
        "Pierwsza połowa: " + Arrays.toString(pierwszaPolowa)
    );
    System.out.println(
        "Druga połowa: " + Arrays.toString(drugaPolowa)
    );
  }
}
