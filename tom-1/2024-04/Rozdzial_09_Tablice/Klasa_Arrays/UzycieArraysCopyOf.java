import java.util.Arrays;

public class UzycieArraysCopyOf {
  public static void main(String[] args) {
    int[] liczby = { 10, 20, 30, 40, 50 };

    int[] mniejLiczb = Arrays.copyOf(liczby, 3);

    int[] takieSameLiczby =
        Arrays.copyOf(liczby, liczby.length);

    int[] wiecejLiczb = Arrays.copyOf(liczby, 10);

    System.out.println(
        "mniejLiczb: " + Arrays.toString(mniejLiczb)
    );
    System.out.println(
        "takieSameLiczby: " +
        Arrays.toString(takieSameLiczby)
    );
    System.out.println(
        "wiecejLiczb: " + Arrays.toString(wiecejLiczb)
    );
  }
}
