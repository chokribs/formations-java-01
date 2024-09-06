package tn.itdevspace.tools.iban;

import org.iban4j.Iban4jException;
import org.iban4j.IbanUtil;

public class IbanValidation {
	
	public boolean validate(String iban) {
		boolean result	=	false;
		try {
		IbanUtil.validate(iban);
		result	=	true;
		}
		catch(Iban4jException e) {
			result	=	false;
			System.out.println("IbanValidation: error: "+e.getMessage());
		}
		
		
		return result;
	}

}
