import java.util.Scanner;

public class LiczeniePolaFigury {
  public static void main(String[] args) {
    System.out.println("""
        Podaj nazwę figury do policzenia pola:
          kolo
          kwadrat
          prostokat
        """
    );
    System.out.print("Którą figurę wybierasz? ");
    String nazwaFigury = pobierzSlowo();

    if ("kolo".equalsIgnoreCase(nazwaFigury)) {
      System.out.print("Podaj promień tego koła: ");
      int promien = pobierzLiczbe();

      if (promien <= 0) {
        System.out.println("Nieprawidłowy promień koła.");
      } else {
        System.out.printf(
            "Promień koła o promieniu %d wynosi %.2f.",
            promien,
            Math.PI * promien * promien
        );
      }
    } else if ("kwadrat".equalsIgnoreCase(nazwaFigury)) {
      System.out.print("Podaj bok tego kwadratu: ");
      int bokKwadratu = pobierzLiczbe();

      if (bokKwadratu <= 0) {
        System.out.println("Nieprawidłowy bok kwadratu.");
      } else {
        System.out.printf(
            "Pole kwadratu o boku %d wynosi %d.",
            bokKwadratu,
            bokKwadratu * bokKwadratu
        );
      }
    } else if ("prostokat".equalsIgnoreCase(nazwaFigury)) {
      System.out.print(
          "Podaj pierwszy bok tego prostokąta: "
      );
      int bokA = pobierzLiczbe();

      System.out.print(
          "Podaj drugi bok tego prostokąta: "
      );
      int bokB = pobierzLiczbe();

      if (bokA <= 0 || bokB <= 0) {
        System.out.println(
            "Nieprawidłowe boki prostokąta."
        );
      } else {
        System.out.printf(
            "Pole prostokąta o bokach %d i %d wynosi %d",
            bokA,
            bokB,
            bokA * bokB
        );
      }
    } else {
      System.out.println(
          "Nieznana nazwa figury: " + nazwaFigury
      );
    }
  }

  public static String pobierzSlowo() {
    return new Scanner(System.in).next();
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
