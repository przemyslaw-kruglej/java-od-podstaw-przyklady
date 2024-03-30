public class ZliczanieWystapienZnakuWPetli {
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
    int ileWystapien = 0;

    for (int i = 0; i < tekst.length(); i++) {
      if (tekst.charAt(i) == znak) {
        ileWystapien++;
      }
    }

    return ileWystapien;
  }
}
