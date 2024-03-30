public class RoznaIloscElementowWPodTablicach {
  public static void main(String[] args) {
    int[][] liczby =
        { { 100 }, { 7, 13, 42 }, { -10, -243, 999, 1000 } };

    System.out.println(
        "Długość pierwszej pod-tablicy: " + liczby[0].length
    );
    System.out.println(
        "Długość drugiej pod-tablicy: " + liczby[1].length
    );
    System.out.println(
        "Długość trzeciej pod-tablicy: " + liczby[2].length
    );
  }
}
