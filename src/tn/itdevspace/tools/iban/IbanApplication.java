package tn.itdevspace.tools.iban;

public final class IbanApplication {
 /**
 * private constructor.
 */
private IbanApplication() {
 super();
}

/**
  * Main methode.
  * @param args
  */
public static void main(final String[] args) {
 System.out.println("Iban Application : start");
 IbanView view = new IbanView();
 while (true) {
  view.execute();
 }
}
}
