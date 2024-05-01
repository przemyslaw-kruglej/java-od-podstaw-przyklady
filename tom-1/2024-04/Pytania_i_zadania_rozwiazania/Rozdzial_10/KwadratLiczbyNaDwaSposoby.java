import java.util.Scanner;

public class KwadratLiczbyNaDwaSposoby {
  public static void main(String[] args) {
    if (args.length == 0) {
      obsluzTrybInteraktywny();
    } else {
      if (
          args.length == 1 &&
          !"--help".equalsIgnoreCase(args[0])
      ) {
        System.out.println(
            podniesDoKwadratu(Integer.parseInt(args[0]))
        );
      } else {
        wyswietlPomoc();
      }
    }
  }

  public static void obsluzTrybInteraktywny() {
    System.out.print(
        "Podaj liczbę a ja policzę jej kwadrat: "
    );
    int liczba = pobierzLiczbe();

    System.out.println(
        "Kwadrat tej liczby wynosi: " +
        podniesDoKwadratu(liczba)
    );
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }

  public static int podniesDoKwadratu(int liczba) {
    return liczba * liczba;
  }

  public static void wyswietlPomoc() {
    System.out.println("""
        Program liczący kwadrat podanej liczby.

        Jeżeli program otrzyma jeden argument, to wyświetli
        jego kwadrat. Program spodziewa się argumentu
        będącego liczbą (o ile nie będzie to argument --help,
        który powoduje wyświetlenie informacji o programie).
        Nieprawidłowy argument spowoduje zakończenie
        działania programu niepowodzeniem.

        Jeżeli program nie otrzyma argumentów lub
        otrzyma więcej niż jeden argument, to
        będzie działał w trybie interaktywnym.

        Użycie:
          KwadratLiczbyNaDwaSposoby 10

        Argumenty:
          --help wyświetla informacje o programie
        """);
  }
}
