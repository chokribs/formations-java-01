package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import tn.itdevspace.tools.iban.Iban4jValidation;

public class IbanValidationTest {
    /**
     * Test success iban validation case.
     */
    @Test
    public void givenibanWhencorectThenTrueIsReturned() {
        String iban = "TN5904018104004942712345";
        Iban4jValidation validator = new Iban4jValidation();
        boolean result = validator.validate(iban);
        assertTrue(result);
    }
    /**
     * Test wrong iban validation case.
     */
    @Test
    public void givenibanWhenincorectTthenFalseIsReturned() {
        String iban = "TN590401810400494271234";
        Iban4jValidation validator = new Iban4jValidation();
        boolean result = validator.validate(iban);
        assertFalse(result);
    }

}
