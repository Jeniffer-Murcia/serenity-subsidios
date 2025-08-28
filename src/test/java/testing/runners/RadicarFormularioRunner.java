package testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test//resources/features/subsidios/02_RadicarFormulario.feature",
        glue = {"testing.stepdefinitions.subsidios", "testing.hooks"},
        tags = "@TC_004 or @TC_005 or @CT_006"
)

public class  RadicarFormularioRunner {
}
