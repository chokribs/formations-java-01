package tn.itdevspace.tools.iban;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;

public class Iban4jValidation implements IIbanValidator {
    /**
     * logger object.
     */
    private static final Logger LOGGER =
            LogManager.getLogger(Iban4jValidation.class);
    @Override
    public final boolean validate(final String iban) {
        boolean result = false;

        try {
            IbanUtil.validate(iban);
            LOGGER.info("iban {} is valid", iban);
            result = true;
        } catch (IbanFormatException | InvalidCheckDigitException
                | UnsupportedCountryException e) {
            result = false;
            LOGGER.error(
                    "iban {} is not valid: {}", iban, e.getMessage()
                    );
        }
        return result;
    }

}
