public class ZamienTabliceNaString {
  public static void main(String[] args) {
    int[] nullowaTablica = null;
    int[] pustaTablica = new int[0];
    int[] tablicaZLiczbami = { 7, 13, 42, 99 };

    System.out.println(arrayToString(nullowaTablica));
    System.out.println(arrayToString(pustaTablica));
    System.out.println(arrayToString(tablicaZLiczbami));

    String[] nullowaTablicaStr = null;
    String[] pustaTablicaStr = new String[0];
    String[] tablicaZeSlowami = { "Ala", "ma", null };

    System.out.println(arrayToString(nullowaTablicaStr));
    System.out.println(arrayToString(pustaTablicaStr));
    System.out.println(arrayToString(tablicaZeSlowami));
  }

  public static String arrayToString(int[] liczby) {
    if (liczby == null) {
      return "null";
    }

    String wynik = "[";

    for (int i = 0; i < liczby.length; i++) {
      if (i < liczby.length - 1) {
        wynik += liczby[i] + ", ";
      } else {
        wynik += liczby[i];
      }
    }

    return wynik + "]";
  }

  public static String arrayToString(String[] slowa) {
    if (slowa == null) {
      return "null";
    }

    String wynik = "[";

    for (int i = 0; i < slowa.length; i++) {
      if (i < slowa.length - 1) {
        wynik += slowa[i] + ", ";
      } else {
        wynik += slowa[i];
      }
    }

    return wynik + "]";
  }
}
