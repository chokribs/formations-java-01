package tn.itdevspace.tools.iban;

import java.util.Scanner;

public class IbanView {
	private Scanner scanner	=	new Scanner(System.in);
	
	public void execute() {
		System.out.println("Introduire IBAN");
		if(scanner.hasNextLine()) {
			String iban	=	scanner.nextLine();
			System.out.println(String.format("Validation: %s -> %s",iban,validatIban(iban)));
		}
			
		
	}
	private boolean validatIban(String iban) {
		
		return true;
	}

}
