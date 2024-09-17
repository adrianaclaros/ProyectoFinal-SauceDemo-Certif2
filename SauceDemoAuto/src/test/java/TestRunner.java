import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        // PARA UNA PRUEBA
        //  features = "src/test/resources/login.feature",
        //  features = "src/test/resources/home.feature",
        //   features = "src/test/resources/yourCart.feature",


           //PARA TODAS LAS PRUEBAS
            features = "src/test/resources/",
        //   glue = {"stepDefinitions"},
     //   tags = "@run",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner {
}

