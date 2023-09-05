package screenplay;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CompletePurchaseForm implements Task {
    private final String name;
    private final String country;
    private final String city;
    private final String creditCard;
    private final String month;
    private final String year;

    public CompletePurchaseForm() {
        this(null, null, null, null, null, null);
    }

    public CompletePurchaseForm(String name, String country, String city, String creditCard, String month, String year) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.creditCard =creditCard;
        this.month = month;
        this.year = year;
    }
    public <T extends Actor> void performAs(T actor) {
        Object userinterface = new Object();
        actor.attemptsTo(
                Enter.theValue(name).into(userinterface.PurchaseFormPage.NAME_FIELD),

                SelectFromOptions.byVisibleText(country).from(userinterface.PurchaseFormPage.COUNTRY_DROPSOWN),

                Enter.theValue(city).into(userinterface.PurchaseFormPage.CITY_FIELD),

                Enter.theValue(creditCard).into(userinterface.PurchaseFormPage.CREDIT_CARD_FIELD),

                SelectFromOptions.byVisibleText(month).from(userinterface.PurchaseFormPage.EXPIRATION_MONTH_DROPDOWN),

                SelectFromOptions.byVisibleText(year).from(userinterface.PurchaseFormPage.EXPIRATION_YEAR_DROPDOWN),

                WaitUntil.the(userinterface.PurchaseFormPage.BUY_BUTTON, isVisible()),

                Click.on(PurchaseFormPage.BUY_BUTTON)
        );
    }
    public static Performable Details (String name, String country, String city, String creditCard, String month, String year) {
        return instrumented(CompletePurchaseForm.class, name, country, city, creditCard, month, year);
    }

    @Override
    public <T extends Actor> void performAs (T actor) {

    }
}

