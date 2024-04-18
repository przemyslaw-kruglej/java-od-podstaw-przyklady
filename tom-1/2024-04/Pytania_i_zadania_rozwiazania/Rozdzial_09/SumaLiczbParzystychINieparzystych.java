public class SumaLiczbParzystychINieparzystych {
  public static void main(String[] args) {
    int[] liczby = { 99, 10, -20, 100, 11, 1, 8 };

    int sumaParzystych = 0;
    int sumaNieparzystych = 0;

    for (int liczba : liczby) {
      if (liczba % 2 == 0) {
        sumaParzystych += liczba;
      } else {
        sumaNieparzystych += liczba;
      }
    }

    System.out.println(
        "Suma liczb parzystych wynosi: " + sumaParzystych
    );
    System.out.println(
        "Suma liczb nieparzystych wynosi: " +
        sumaNieparzystych
    );

    if (sumaParzystych > sumaNieparzystych) {
      System.out.println("""
          Suma liczb parzystych w tablicy \
          jest większa niż suma liczb nieparzystych."""
      );
    } else if (sumaParzystych == sumaNieparzystych){
      System.out.println("""
          Suma liczb parzystych w tablicy \
          jest równa sumie liczb nieparzystych."""
      );
    } else {
      System.out.println("""
          Suma liczb parzystych w tablicy \
          jest mniejsza niż suma liczb nieparzystych."""
      );
    }
  }
}
