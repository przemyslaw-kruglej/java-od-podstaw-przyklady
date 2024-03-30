public class StringFormatPoPrzecinku {
  public static void main(String[] args) {
    float pi = 3.14f;

    System.out.println(
        "Liczba Pi to w przybliżeniu %.2f".formatted(pi)
    );
  }
}
