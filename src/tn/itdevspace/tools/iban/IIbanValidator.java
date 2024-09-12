package tn.itdevspace.tools.iban;

public interface IIbanValidator {

    /**
     * Allow to validate iban number.
     * @param iban iban number
     * @return true if iban is valid else return false
     */
    boolean validate(String iban);

}
