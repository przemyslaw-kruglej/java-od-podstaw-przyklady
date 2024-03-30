import java.util.Arrays;

public class WysylanieTablicyDoMetody {
  public static void main(String[] args) {
    int[] liczby = { 5, 20, 99, 77 };
    wypelnijTablice(liczby, 42);

    System.out.println(Arrays.toString(liczby));
  }

  public static void wypelnijTablice(
      int[] tabArg, int wartosc
  ) {
    for (int i = 0; i < tabArg.length; i++) {
      tabArg[i] = wartosc;
    }
  }
}
