package stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.PurchaseFormaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizePurchase implements Task {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(PurchaseFormaPage.BUY_BUTTON, isVisible()),

                Click.on(PurchaseFormaPage.BUY_BUTTON),

                WaitUntil.the(PurchaseFormaPage.PURCHASE_CONFIRMATION, isVisible())
        );
    }
    public static Performable thePurchase() {
        return instrumented(screenplay.FinalizePurchase.class);
    }
}