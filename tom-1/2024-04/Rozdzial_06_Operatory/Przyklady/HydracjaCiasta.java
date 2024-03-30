import java.util.Scanner;

public class HydracjaCiasta {
  public static void main(String[] args) {
    System.out.print("Ile mąki (w gramach) chcesz użyć? ");
    int iloscMaki = pobierzLiczbe();

    System.out.print(
        "Jaką % hydrację ciasta chcesz osiągnąć? "
    );
    int procentHydracji = pobierzLiczbe();

    int iloscWody = iloscMaki * procentHydracji / 100;

    System.out.printf("""
        Aby osiągnąć %d%% hydracji ciasta \
        przy użyciu %d gramów mąki, należy \
        użyć %d gramów wody.
        """,
        procentHydracji,
        iloscMaki,
        iloscWody
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
