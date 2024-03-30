import java.util.Arrays;

public class ZwracanieTablicy {
  public static void main(String[] args) {
    int[] fortunnaTablica = stworzIWypelnijTablice(3, 7);

    System.out.println(Arrays.toString(fortunnaTablica));
  }

  public static int[] stworzIWypelnijTablice(
      int ileElementow, int domyslnaWartosc
  ) {
    int[] tab = new int[ileElementow];

    for (int i = 0; i < tab.length; i++) {
      tab[i] = domyslnaWartosc;
    }

    return tab;
  }
}
