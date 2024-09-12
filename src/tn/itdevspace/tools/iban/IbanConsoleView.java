package tn.itdevspace.tools.iban;

import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component
public class IbanConsoleView implements IIbanView {
    /**
     * Object used to get input data.
     */
    private Scanner scanner;
    /**
     * iban validation service.
     */
    private IIbanValidator ibanValidator;
    /**
     * @param validator
     */
    public IbanConsoleView(final IIbanValidator validator) {
        super();
        this.ibanValidator = validator;
        this.scanner = new Scanner(System.in);
    }
    @Override
    public final void execute() {
        System.out.println("Introduire IBAN:\r");
        if (scanner.hasNextLine()) {
            String iban = scanner.nextLine();
            System.out.println(
                    String.format("Validation: %s -> %s",
                            iban, validatIban(iban))
                    );
        }
    }
    private boolean validatIban(final String iban) {
        return ibanValidator.validate(iban);
    }
}
