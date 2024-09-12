package tn.itdevspace.tools.iban;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SuppressWarnings({"PMD", "checkstyle:hideutilityclassconstructor"})
@SpringBootApplication
public class IbanApplication {
    /**
     * private constructor.
     */
    public IbanApplication() {
        super();
    }

    /**
     * Main methode.
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("Iban Application : start");
        ConfigurableApplicationContext context =
                SpringApplication.run(IbanApplication.class, args);
        IIbanView view = context.getBean(IIbanView.class);

        while (true) {
            view.execute();
        }
    }
}
