package tn.itdevspace.tools.iban;

import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;

public class IbanValidation {
/**
 * Allow to validate iban number.
 * @param iban iban number
 * @return true if iban is valid else return false
 */
public boolean validate(final String iban) {
 boolean result = false;
 System.out.println(
 "IbanValidation: validate: begin: iban =  " + iban
 );
 try {
  IbanUtil.validate(iban);
  result = true;
  } catch (IbanFormatException | InvalidCheckDigitException | UnsupportedCountryException e) {
    result = false;
    System.out.println(
    "IbanValidation: iban not valid: " + e.getMessage()
    );
 } 
System.out.println(
"IbanValidation: validate: end : result =  " + result
);
return result;
}

}
