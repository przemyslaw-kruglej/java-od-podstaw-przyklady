import java.util.Scanner;

public class LiczenieCenyNetto {
  public static void main(String[] args) {
    System.out.print("Podaj cenę brutto produktu: ");
    int cenaBrutto = pobierzLiczbe();

    System.out.print("Podaj % VAT: ");
    int vat = pobierzLiczbe();

    double cenaNetto = cenaBrutto / (1 + vat / 100.0);

    System.out.printf("""
        Dla VATu wynoszącego %d%% produkt \
        o koszcie brutto %d kosztuje %.2f netto.
        """,
        vat,
        cenaBrutto,
        cenaNetto
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
