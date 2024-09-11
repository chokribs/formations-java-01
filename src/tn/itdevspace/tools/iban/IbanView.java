package tn.itdevspace.tools.iban;

import java.util.Scanner;

public class IbanView {
/**
 * Object used to get input data.
 */
private Scanner scanner = new Scanner(System.in);
/**
 * iban validation service.
 */
private IbanValidation ibanValidator = new IbanValidation();
/**
 * Allow to display UI for get user data and display validation message.
 */
public void execute() {
System.out.println("Introduire IBAN:\r");
if (scanner.hasNextLine()) {
  String iban = scanner.nextLine();
  System.out.println(
  String.format("Validation: %s -> %s", iban, validatIban(iban))
  );
}
}
private boolean validatIban(final String iban) {
 return ibanValidator.validate(iban);
}
}
