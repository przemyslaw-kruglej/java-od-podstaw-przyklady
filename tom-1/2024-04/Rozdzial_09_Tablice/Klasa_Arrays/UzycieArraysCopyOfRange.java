import java.util.Arrays;

public class UzycieArraysCopyOfRange {
  public static void main(String[] args) {
    int[] liczby = { 10, 20, 30, 40, 50 };

    int[] fragmentLiczb = Arrays.copyOfRange(liczby, 0, 1);

    int[] innyFragmentLiczb =
        Arrays.copyOfRange(liczby, 1, 5);

    System.out.println(
        "fragmentLiczb: " + Arrays.toString(fragmentLiczb)
    );
    System.out.println(
        "innyFragmentLiczb: " +
        Arrays.toString(innyFragmentLiczb)
    );
  }
}
