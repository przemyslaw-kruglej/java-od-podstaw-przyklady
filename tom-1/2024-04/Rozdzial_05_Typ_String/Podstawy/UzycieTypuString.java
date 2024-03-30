public class UzycieTypuString {
  public static void main(String[] args) {
    String imie = "Jan";
    String nazwisko = "Nowak";

    String osoba = imie + " " + nazwisko;
    int wiek = 25;

    String komunikat = osoba + " ma " + wiek + " lat.";

    System.out.println(komunikat);
  }
}