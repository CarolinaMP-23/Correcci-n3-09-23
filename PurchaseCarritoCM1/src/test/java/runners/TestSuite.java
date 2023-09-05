package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Ruta a tus archivos .feature
        glue = "purchaseStepDefinitions", // Paquete que contiene tus definiciones de pasos
        plugin = {"pretty", "html:target/cucumber-reports"} // Opciones de reportes
)
public class TestSuite {
}