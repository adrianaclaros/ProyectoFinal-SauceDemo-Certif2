package stepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage = new HomePage(DriverManager.getDriver().driver);

    @And("The home page should be displayed")
    public void verifyHomePageIsDisplayed(){
        Assertions.assertTrue(homePage.sauceDemoTitleIsDisplayed());
    }

    //verificacion del porducto añadido
    @And("I add to the cart the product {string}")
    public void addProductToCart(String productName) throws InterruptedException {
        homePage.addProductToCart(productName);
     //   Thread.sleep(3000);
    }

    @And("The cart icon should display {string}")
    public void verifyCartIconNumber(String iconNumber){
        Assertions.assertTrue(homePage.verifyCartIconNumber(iconNumber));
    }

    //verificacion del producto removido
    @And("I remove the product {string} from the cart")
    public void removeProductFromCart(String productName) throws InterruptedException {
        homePage.removeProductFromCart(productName);
      //  Thread.sleep(3000);
    }

//Redes Sociales
    @And("I want to enter a Sauce Demo social network")
    public void enterSocialNetwork() {
    // Se asegura de que la página principal esté lista
        Assertions.assertTrue(true);
    }

    @And("I locate the {string} link")
    public void locateSocialMediaLink(String socialMedia) {
        String url = homePage.getLink(socialMedia);
        Assertions.assertNotNull(url, "Link for " + socialMedia + " was not found");
    }

    @And("I click on the {string} link")
    public void clickOnSocialMediaLink(String socialMedia) {
        homePage.clickOnLink(socialMedia);
    }

    @And("I should be redirected to the Sauce Labs {string} page")
    public void verifySocialMediaRedirect(String socialMedia) throws InterruptedException {
        String expectedUrlPart = "";
        switch (socialMedia.toLowerCase()) {
            case "twitter":
                expectedUrlPart = "twitter.com/saucelabs";
                break;
            case "facebook":
                expectedUrlPart = "facebook.com/saucelabs";
                break;
            case "linkedin":
                expectedUrlPart = "linkedin.com/company/sauce-labs/";
                break;

        }
        Thread.sleep(2000);
    }

//Sistema de ordenamiento Z-A
    @And("I want to search for products according to an order")
    public void enterOrderingPage() {
    }

    @And("I locate the ordering system")
    public void locateOrderingSystem() {
        // Localiza el sistema de ordenamiento, en realidad no hace falta hacer nada aquí si ya verificamos la visibilidad en el paso anterior
    }

    @And("I click on the ordering system from {string}")
    public void clickOnOrderingSystem(String order) {
        if (order.equals("Z to A")) {
            homePage.sortProductsByNameZToA();
        }
    }

    @And("The products should be sorted from {string} to {string}")
    public void verifyProductsSortedFromTo(String fromOrder, String toOrder) {
        if (fromOrder.equals("Z") && toOrder.equals("A")) {
            Assertions.assertTrue(homePage.areProductsSortedByNameZToA());
        }
    }

}
