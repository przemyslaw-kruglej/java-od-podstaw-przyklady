public class LiczenieCenyZakupow {
  public static void main(String[] args) {
    int liczbaSztuk = 5;
    double cenaJednostkowaNetto = 28.56;
    double stawkaVAT = 0.05;

    System.out.println(
        "Liczymy cenę zakupu " + liczbaSztuk +
        " sztuk książki kosztującej " + cenaJednostkowaNetto
    );
    System.out.println("Stawka VAT: " + stawkaVAT);

    double cenaNetto = liczbaSztuk * cenaJednostkowaNetto;
    double wartoscVAT = cenaNetto * stawkaVAT;
    double cenaBrutto = cenaNetto + wartoscVAT;

    System.out.println("Cena netto: " + cenaNetto);
    System.out.println("Wartość VAT: " + wartoscVAT);
    System.out.println("Cena brutto: " + cenaBrutto);
  }
}
