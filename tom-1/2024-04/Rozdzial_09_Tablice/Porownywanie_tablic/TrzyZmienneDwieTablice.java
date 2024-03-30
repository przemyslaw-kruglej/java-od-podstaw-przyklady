public class TrzyZmienneDwieTablice {
  public static void main(String[] args) {
    int[] liczby = { 7, 13, 42 };
    int[] tezLiczby = liczby;

    int[] inneLiczby = { 7, 13, 42 };

    if (liczby == tezLiczby) {
      System.out.println(
          "liczby i tezLiczby są sobie równe."
      );
    } else {
      System.out.println(
          "liczby i tezLiczby nie są równe."
      );
    }

    if (liczby == inneLiczby) {
      System.out.println(
          "liczby i inneLiczby są sobie równe."
      );
    } else {
      System.out.println(
          "liczby i inneLiczby nie są równe."
      );
    }
  }
}
