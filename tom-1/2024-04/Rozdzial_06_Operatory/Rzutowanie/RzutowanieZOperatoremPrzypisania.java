public class RzutowanieZOperatoremPrzypisania {
  public static void main(String[] args) {
    int x = 10;

    // błąd kompilacji
    // x = x + 5.5;

    x += 5.5; // ok - automatyczne rzutowanie

    System.out.println("x ma wartość " + x);
  }
}
