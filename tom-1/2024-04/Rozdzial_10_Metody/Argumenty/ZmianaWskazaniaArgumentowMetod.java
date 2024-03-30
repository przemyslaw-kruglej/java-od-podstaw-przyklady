import java.util.Arrays;

public class ZmianaWskazaniaArgumentowMetod {
  public static void main(String[] args) {
    int[] liczby = { 55, 19, 99, 24 };
    String slowo = "Java";

    przypiszDoTablicy(liczby);
    przypiszDoStringa(slowo);

    System.out.println(
        "Zawartość tablicy liczby: " +
        Arrays.toString(liczby)
    );
    System.out.println(
        "Zmienna slowo ma wartość: " + slowo
    );
  }

  public static void przypiszDoTablicy(int[] tabArg) {
    tabArg = new int[] { 7, 13, 42 };
  }

  public static void przypiszDoStringa(String tekstArg) {
    tekstArg = "nauka";
  }
}
