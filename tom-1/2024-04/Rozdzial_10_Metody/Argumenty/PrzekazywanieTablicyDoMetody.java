public class PrzekazywanieTablicyDoMetody {
  public static void main(String[] args) {
    int[] mojaTablica = { 7, 13, 42 };

    opiszTablice(mojaTablica);

    opiszTablice(new int[] { 5, 10, 15, 20, 25 });
    opiszTablice(new int[0]);
    opiszTablice(null);
  }

  public static void opiszTablice(int[] tab) {
    if (tab == null) {
      System.out.println("Tablica jest nullem.");
    } else if (tab.length == 0){
      System.out.println("Tablica jest pusta.");
    } else {
      System.out.println(
          "Liczba elementów w tablicy: " + tab.length
      );
    }
  }
}
