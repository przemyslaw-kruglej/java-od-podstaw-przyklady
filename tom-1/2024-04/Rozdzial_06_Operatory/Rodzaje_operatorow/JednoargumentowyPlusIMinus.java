public class JednoargumentowyPlusIMinus {
  public static void main(String[] args) {
    int a = +5; // wystarczy samo 5
    int b = -10;
    int x = -(a + b);
    int y = x - -10;
    a = -a;

    System.out.println("Wartość a wynosi " + a);
    System.out.println("Wartość x wynosi " + x);
    System.out.println("Wartość y wynosi " + y);
  }
}
