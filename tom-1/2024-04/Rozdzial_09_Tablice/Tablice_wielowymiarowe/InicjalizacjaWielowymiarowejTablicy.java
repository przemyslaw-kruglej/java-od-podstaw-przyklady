public class InicjalizacjaWielowymiarowejTablicy {
  public static void main(String[] args) {
    String[][] miesiacePorRoku =
        {
            { "wrzesień", "październik", "listopad" },
            { "grudzień", "styczeń", "luty" },
            { "marzec", "kwiecień", "maj" },
            { "czerwiec", "lipiec", "sierpień" }
        };

    System.out.println(
        "Ostatni miesiąc zimy to: " + miesiacePorRoku[1][2]
    );
  }
}
