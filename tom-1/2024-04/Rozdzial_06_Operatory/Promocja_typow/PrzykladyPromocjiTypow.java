public class PrzykladyPromocjiTypow {
  public static void main(String[] args) {
    double a = 5.5;
    float b = 77.7f;
    long c = 10_000_000_000L;
    int d = 12345;

    // zmienna a jest typu double,
    // więc całe wyrażenie będzie typu double
    double a1 = a - b / c * d;

    // zmienna b jest typu float,
    // więc całe wyrażenie będzie typu float
    float b1 = b / c * d;

    // zmienna c jest typu long,
    // więc całe wyrażenie będzie typu long
    long c1 = c * d;

    // wiekszość poniższych instrukcji jest błędnych,
    // bo próbujemy przypisać do zmiennych
    // wartości, które wykraczają poza ich zakres

    // float a2 = a - b / c * d; // błąd kompilacji
    // long a3 = a - b / c * d; // błąd kompilacji
    // int a4 = a - b / c * d; // błąd kompilacji

    double b2 = b / c * d; // ok
    // long b3 = b / c * d; // błąd kompilacji
    // int b4 = b / c * d; // błąd kompilacji

    double c2 = c * d; // ok
    float c3 = c * d; // ok
    // int c4 = c * d; // błąd kompilacji
  }
}
