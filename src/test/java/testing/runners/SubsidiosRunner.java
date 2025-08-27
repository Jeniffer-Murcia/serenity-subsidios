package testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/subsidios/01_AbrirPagina.feature",
        glue = {"testing.stepdefinitions.subsidios", "testing.hooks"},
        tags = "not @Wip"
)
public class SubsidiosRunner {

}
