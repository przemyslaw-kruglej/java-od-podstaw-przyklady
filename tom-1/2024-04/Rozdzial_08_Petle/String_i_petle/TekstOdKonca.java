public class TekstOdKonca {
  public static void main(String[] args) {
    String tekst = "Ala ma kota";

    for (int i = tekst.length() - 1; i >= 0; i--) {
      System.out.print(tekst.charAt(i));
    }
  }
}
