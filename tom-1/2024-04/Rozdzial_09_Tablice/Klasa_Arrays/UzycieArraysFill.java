import java.util.Arrays;

public class UzycieArraysFill {
  public static void main(String[] args) {
    int[] liczby = new int[5];
    String[] piatki = new String[3];

    System.out.println(
        "liczby przed wypełnieniem: " +
        Arrays.toString(liczby)
    );
    System.out.println(
        "piatki przed wypełnieniem: " +
        Arrays.toString(piatki)
    );

    Arrays.fill(liczby, 7);
    Arrays.fill(piatki, "piątek");

    System.out.println(
        "liczby po wypełnieniu: " + Arrays.toString(liczby)
    );
    System.out.println(
        "piatki po wypełnieniu: " + Arrays.toString(piatki)
    );
  }
}
