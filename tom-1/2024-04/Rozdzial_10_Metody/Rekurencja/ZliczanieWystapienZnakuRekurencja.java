public class ZliczanieWystapienZnakuRekurencja {
  public static void main(String[] args) {
    System.out.println(
        zliczWystapieniaZnaku(
            "Nauka programowania w Javie", 'a'
        )
    );
  }

  public static int zliczWystapieniaZnaku(
      String tekst, char znak
  ) {
    if (tekst.length() == 0) {
      return 0;
    } else if (tekst.length() == 1) {
      return tekst.charAt(0) == znak ? 1 : 0;
    } else {
      int srodek = tekst.length() / 2;
      return
         zliczWystapieniaZnaku(
             tekst.substring(0, srodek), znak
         ) +
         zliczWystapieniaZnaku(
             tekst.substring(srodek), znak
         );
    }
  }
}
