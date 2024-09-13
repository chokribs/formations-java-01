package tn.itdevspace.tools.iban;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public final class IbanApplication {
    /**
     * logger object.
     */
    private static final Logger LOGGER =
            LogManager.getLogger(IbanApplication.class);
    /**
     * private constructor.
     */
    private IbanApplication() {
        super();
    }

    /**
     * Main methode.
     * @param args
     */
    public static void main(final String[] args) {
        LOGGER.info("Iban Application : start");
        IIbanView view = IbanFactory.getIbanViewInstance(
                IbanFactory.getIbanValidation()
                );
        while (true) {
            view.execute();
        }
    }
}
