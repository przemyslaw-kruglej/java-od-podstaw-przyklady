public class RozmiarStringITablicy {
  public static void main(String[] args) {
    String tekst = "programowanie";

    String[] slowa = { "Ania", "ma", "kota" };

    System.out.println(
        "Liczba znaków w zmiennej tekst: " + tekst.length()
    );

    System.out.println(
        "Liczba elementów w tablicy: " + slowa.length
    );

    System.out.println(
        "Liczba znaków w pierwszym stringu w tablicy: " +
        slowa[0].length()
    );
  }
}
