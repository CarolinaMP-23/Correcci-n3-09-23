package stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

/**
 *
 */
private class PurchaseStepDefinitions {
    @When("the user views the cart")
    public void theUserViewsTheCart() {
        Actor actor = Actor.named("User"); // Crea un actor (usuario) para la prueba

        // Realiza una espera hasta que el icono o enlace del carrito sea visible.
        Wait.until(HomePage.CART_ICON).isVisible().performAs(actor);

        // Hace clic en el icono o enlace del carrito en la página principal.
        actor.attemptsTo(
                Click.on(HomePage.CART_ICON)
        );

        // Realiza una espera hasta que la página del carrito sea visible.
        Wait.until(CartPage.CART_PAGE_TITLE).isVisible().performAs(actor);
    }

    private static class Wait {
    }
}
