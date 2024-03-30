public class PrzeladowanaMetodaWypisz {
  public static void main(String[] args) {
    wypisz(77);
    wypisz(3.14);
  }

  public static void wypisz(int liczba) {
    System.out.println("Liczba całkowita: " + liczba);
  }

  public static void wypisz(double liczba) {
    System.out.println("Liczba rzeczywista: " + liczba);
  }
}
