public class WartosciWStringachPrzedJava21 {
  public static void main(String[] args) {
    int a = 5, b = 10;

    System.out.println(
        "Pole prostokąta o bokach " + a + " i " + b +
        " to: " + (a * b)
    );

    System.out.printf(
        "Pole prostokąta o bokach %d i %d to: %d",
        a,
        b,
        a * b
    );
  }
}
