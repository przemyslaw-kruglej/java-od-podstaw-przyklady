public class StworzNazweWCamelCase {
  public static void main(String[] args) {
    // oczekiwany wynik: "mojaNazwa"
    System.out.println(zapiszWCamelCase("Moja", "NAZWA"));

    // oczekiwany wynik: ""
    System.out.println(zapiszWCamelCase(null));

    // ""
    System.out.println(zapiszWCamelCase(""));

    // "mojaZmienna"
    System.out.println(
        zapiszWCamelCase(null, "Moja", "zmienna")
    );

    // "mojaNazwa"
    System.out.println(
        zapiszWCamelCase("Moja", "", null, "NAZWA")
    );

    // "mojaInnaNazwa"
    System.out.println(
        zapiszWCamelCase("Moja", "inna", null, "NAZWA")
    );
  }

  /**
   * Zapisuje podane słowa w formie standardu Camel Case.
   * W tym standardzie pierwsze słowo jest zapisane małymi
   * literami, a każde kolejne jest do niego doklejone
   * z pierwszą literą zamienioną na wielką literę,
   * natomiast pozostałe litery są małe.
   * Metoda pomija nulle i puste słowa.
   *
   * @param slowa Słowa, z których ma być stworzona nazwa
   *              zapisana w camelCase. Nulle i puste
   *              stringi są pomijane.
   * @return      Nazwa zapisana w Camel Case z podanych słów.
   *              Jeżeli przekazano nullową lub pustą tablicę
   *              ze słowami, zwrócony zostanie pusty string.
   */
  public static String zapiszWCamelCase(String... slowa) {
    if (slowa == null || slowa.length == 0) {
      return "";
    }
    String nazwaWCamelCase = "";

    for (String slowo : slowa) {
      if (slowo == null || slowo.length() == 0) {
        continue;
      }

      if (nazwaWCamelCase.length() == 0) {
        nazwaWCamelCase += slowo.toLowerCase();
      } else {
        nazwaWCamelCase +=
            Character.toUpperCase(slowo.charAt(0)) +
            slowo.substring(1).toLowerCase();
      }
    }

    return nazwaWCamelCase;
  }
}
