import java.util.Scanner;

public class DzienTygodniaOperatoryWarunkowe {
  public static void main(String[] args) {
    System.out.print("Podaj numer dnia tygodnia: ");
    int dzienTygodnia = pobierzLiczbe();

    if (dzienTygodnia < 1 || dzienTygodnia > 7) {
      System.out.println("Nieprawidłowy dzień tygodnia.");
    } else if (dzienTygodnia == 5) {
      System.out.println("Jutro weeekeend!");
    } else if (!(dzienTygodnia == 6 || dzienTygodnia == 7)) {
      System.out.println("Praca...");
    } else {
      System.out.println("Weekend!");
    }
  }

  public static int pobierzLiczbe() {
    return new Scanner(System.in).nextInt();
  }
}
