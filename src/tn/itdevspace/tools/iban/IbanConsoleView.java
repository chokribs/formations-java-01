package tn.itdevspace.tools.iban;

import java.util.Scanner;

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
     * empty constructor.
     */
    private IbanConsoleView() {
        super();
        this.scanner = new Scanner(System.in);
    }
    /**
     * @param validator
     */
    public IbanConsoleView(final IIbanValidator validator) {
        this();
        this.ibanValidator = validator;
    }
    @Override
    public final void execute() {
        System.out.println("Introduire IBAN:\r");

        if (scanner.hasNextLine()) {
            String iban = scanner.nextLine();
            validatIban(iban);
        }
    }
    private boolean validatIban(final String iban) {
        return ibanValidator.validate(iban);
    }
}
