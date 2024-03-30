public class WypiszInformacjeOArgumentach {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Otrzymałem zero argumentów!");
    } else {
      System.out.println(
          "Liczba otrzymanych argumentów: " + args.length
      );
      System.out.println("Oto one:");

      for (int i = 0; i < args.length; i++) {
        System.out.printf(
            "Argument #%d: %s\n", i + 1, args[i]
        );
      }
    }
  }
}
