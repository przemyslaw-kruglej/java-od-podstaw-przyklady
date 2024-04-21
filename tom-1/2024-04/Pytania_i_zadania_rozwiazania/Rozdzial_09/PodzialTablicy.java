import java.util.Arrays;

public class PodzialTablicy {
  public static void main(String[] args) {
    int[] tablicaZrodlowa = { 1, 20, 100, 3, 40 };

    int dlugoscPierwszejPolowy =
        tablicaZrodlowa.length / 2;

    if (tablicaZrodlowa.length % 2 == 1) {
      dlugoscPierwszejPolowy++;
    }

    int dlugoscDrugiejPolowy =
        tablicaZrodlowa.length - dlugoscPierwszejPolowy;

    int[] pierwszaPolowa = new int[dlugoscPierwszejPolowy];
    int[] drugaPolowa = new int[dlugoscDrugiejPolowy];

    for (int i = 0; i < tablicaZrodlowa.length; i++) {
      if (i < dlugoscPierwszejPolowy) {
        pierwszaPolowa[i] = tablicaZrodlowa[i];
      } else {
        drugaPolowa[i - dlugoscPierwszejPolowy] =
            tablicaZrodlowa[i];
      }
    }

    System.out.println(
        "Pierwsza połowa: " + Arrays.toString(pierwszaPolowa)
    );
    System.out.println(
        "Druga połowa: " + Arrays.toString(drugaPolowa)
    );
  }
}
