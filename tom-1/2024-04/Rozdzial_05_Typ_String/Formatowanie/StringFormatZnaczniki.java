public class StringFormatZnaczniki {
  public static void main(String[] args) {
    String dzienTygodnia = "czwartek";
    String miesiac = "marzec";
    int dzienMiesiaca = 28;
    int rok = 2024;

    String aktualnaData = String.format(
        "Dzisiaj jest %s, miesiąc %s, dzień %d, rok %d",
        dzienTygodnia,
        miesiac,
        dzienMiesiaca,
        rok
    );
    System.out.println(aktualnaData);

    float liczbaPi = 3.14f;

    System.out.println(
        "Liczba Pi to w przybliżeniu %f".formatted(liczbaPi)
    );
  }
}
