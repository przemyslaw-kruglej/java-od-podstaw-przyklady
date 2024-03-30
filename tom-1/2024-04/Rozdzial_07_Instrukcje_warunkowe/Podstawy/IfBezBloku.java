import java.util.Scanner;

public class IfBezBloku {
  public static void main(String[] args) {
    System.out.print("Podaj licznik: ");
    int licznik = pobierzLiczbe();

    System.out.print("Podaj mianownik: ");
    int mianownik = pobierzLiczbe();

    double wynik;

    if (mianownik != 0)
      wynik = licznik / mianownik;
    // błąd - istnieje taka ścieżka wykonania programu,
    // w której zmienna wynik nie zostanie zainicjalizowana
    // żadną wartością (gdy mianownik będzie równy zero)
      //System.out.println("Wynik: " + wynik);
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}