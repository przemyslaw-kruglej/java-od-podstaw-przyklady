public class ZmianaNaTypOMniejszymZakresie {
  public static void main(String[] args) {
    byte b = 120; // int -> byte
    short s = 1000; // int -> short
    char c = 65; // int -> char

    // błąd kompilacji
    // 10000 przekracza zakres typu byte
    // b = 10000;
  }
}
