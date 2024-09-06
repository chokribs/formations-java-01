package test;

import static org.junit.Assert.*;

import org.junit.Test;

import tn.itdevspace.tools.iban.IbanValidation;

public class IbanValidationTest {

	@Test
	public void giveniban_whencorect_thenTrueIsReturned() {
		String iban	=	"TN5904018104004942712345";
		IbanValidation validator	=	new IbanValidation();
		boolean result	=	validator.validate(iban);
		assertTrue(result);
		
	}
	@Test
	public void giveniban_whenincorect_thenFalseIsReturned() {
		String iban	=	"TN590401810400494271234";
		IbanValidation validator	=	new IbanValidation();
		boolean result	=	validator.validate(iban);
		assertFalse(result);
		
	}

}
