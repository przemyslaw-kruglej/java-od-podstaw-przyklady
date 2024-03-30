public class AlternatywnySposobZapisuLiczb {
  public static void main(String[] args) {
    int miliard = 1_000_000_000;
    int dziesiecWDwojkowym = 0b1010;
    int dziesiecWOsemkowym = 012;
    int dziesiecWSzesnastkowym = 0xA;

    System.out.println("miliard = " + miliard);
    System.out.println(
        "dziesiecWDwojkowym = " + dziesiecWDwojkowym
    );
    System.out.println(
        "dziesiecWOsemkowym = " + dziesiecWOsemkowym
    );
    System.out.println(
        "dziesiecWSzesnastkowym = " + dziesiecWSzesnastkowym
    );
  }
}
