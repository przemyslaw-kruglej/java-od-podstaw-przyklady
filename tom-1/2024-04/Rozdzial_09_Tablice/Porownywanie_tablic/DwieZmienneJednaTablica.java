public class DwieZmienneJednaTablica {
  public static void main(String[] args) {
    int[] liczby = { -20, 42, 5, 23, 100 };
    int[] tezLiczby = liczby;

    tezLiczby[0] = 99;

    System.out.println("liczby[0]: " + liczby[0]);
    System.out.println("tezLiczby[0]: " + tezLiczby[0]);
  }
}
