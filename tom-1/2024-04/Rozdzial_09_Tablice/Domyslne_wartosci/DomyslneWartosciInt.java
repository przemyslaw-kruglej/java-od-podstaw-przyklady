public class DomyslneWartosciInt {
  public static void main(String[] args) {
    int[] liczby = new int[10];

    System.out.println("Pierwszy element: " + liczby[0]);

    liczby[0] = 77;

    System.out.println(
        "Pierwszy element po zmianie wartości: " + liczby[0]
    );
  }
}
