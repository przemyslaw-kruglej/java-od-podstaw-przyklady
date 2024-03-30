public class SprawdzanieNullWWarunku {
  public static void main(String[] args) {
    System.out.println(
        zwrocPierwszaWielkaLitere("java")
    );
    System.out.println(
        zwrocPierwszaWielkaLitere(null)
    );
    System.out.println(
        zwrocPierwszaWielkaLitere("")
    );
  }

  public static String zwrocPierwszaWielkaLitere(String str) {
    if (str != null && str.length() > 0) {
      return String.valueOf(
          Character.toUpperCase(str.charAt(0))
      );
    } else {
      return "";
    }
  }
}
