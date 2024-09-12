package tn.itdevspace.tools.iban;

public final class IbanFactory {
    /**
     * private constructor to avoid instantiation.
     */
    private IbanFactory() {
        super();
        // TODO Auto-generated constructor stub
    }
/**
 * allow to instantiate IIbanView instance.
 * @param iIbanValidator
 * @return IIbanView
 */
    public static IIbanView getIbanViewInstance(
            final IIbanValidator iIbanValidator
            ) {
        return new IbanConsoleView(iIbanValidator);
    }
    /**
     * Allow to instantiate an IbanValidator.
     * @return IbanValidator object
     */
    public static IIbanValidator getIbanValidation() {
        return new Iban4jValidation();
    }

}
