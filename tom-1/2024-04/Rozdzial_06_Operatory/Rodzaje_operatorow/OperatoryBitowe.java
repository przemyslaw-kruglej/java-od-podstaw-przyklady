public class OperatoryBitowe {
  public static void main(String[] args) {
    int x = 91; // w systemie binarnym: 1011011
    int y = 50; // w systemie binarny: 0110010

    System.out.println("x & y wynosi " + (x & y));
    System.out.println("x | y wynosi " + (x | y));
    System.out.println("x ^ y wynosi " + (x ^ y));
    System.out.println("~x wynosi " + ~x);
    System.out.println("~y wynosi " + ~y);

    int a = 17; // w systemie binarnym: 10001
    System.out.println("a << 1 wynosi " + (a << 1));
    System.out.println("a << 2 wynosi " + (a << 2));

    System.out.println("a >> 1 wynosi " + (a >> 1));
    System.out.println("a >>> 1 wynosi " + (a >>> 1));
    System.out.println("-a >> 1 wynosi " + (-a >> 1));
    System.out.println("-a >>> 1 wynosi " + (-a >>> 1));
  }
}
