public class ZwracanieNull {
  public static void main(String[] args) {
    String nazwaWCamelCase =
        zapiszJakoCamelCase("MOJA", "nazwa");

    System.out.println(
        "Długość pierwszej nazwy: " +
        nazwaWCamelCase.length()
    );

    String innaNazwaWCamelCase =
        zapiszJakoCamelCase("nazwa", null);

    System.out.println(
        "Długość drugiej nazwy: " +
        innaNazwaWCamelCase.length()
    );
  }

  public static String zapiszJakoCamelCase(
      String slowo1, String slowo2
  ) {
    if (slowo1 == null || slowo2 == null) {
      return null;
    }

    return slowo1.toLowerCase() +
        Character.toUpperCase(slowo2.charAt(0)) +
        slowo2.substring(1).toLowerCase();
  }
}
