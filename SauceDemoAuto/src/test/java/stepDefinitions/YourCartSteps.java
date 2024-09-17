package stepDefinitions;

import Utilities.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.YourCartPage;

import java.util.Arrays;
import java.util.List;

public class YourCartSteps {
/*
    YourCartPage yourCartPage = new YourCartPage(DriverManager.getDriver().driver);
    HomePage homePage = new HomePage(DriverManager.getDriver().driver); // Para agregar productos si es necesario

//Aumentar unidades
    @Given("The cart page is displayed")
    public void verifyCartPageIsDisplayed() {
        Assertions.assertTrue(yourCartPage.isCartPageDisplayed());
    }

    @And("I add {string} to the cart")
    public void addProductToCart(String productName) {
        homePage.addProductToCart(productName);
    }

    @When("I increase the quantity of {string} to {string}")
    public void increaseProductQuantity(String productName, String quantity) {
        yourCartPage.setProductQuantity(productName, Integer.parseInt(quantity));
    }

    @Then("The cart should display {string} items for {string}")
    public void verifyProductQuantityInCart(String quantity, String productName) {
        Assertions.assertTrue(yourCartPage.verifyProductQuantity(productName, quantity));
    }

//Checkout
    @Given("The cart page is displayed")
    public void cartPageIsDisplayed() {
        // Navega a la página del carrito
        DriverManager.getDriver().driver.get("https://www.saucedemo.com/cart.html");
    }

    @When("you click the \"Checkout\" button of \"Your Cart\"")
    public void clickCheckoutButton() {
        yourCartPage.clickCheckoutButton();
    }

    @Then("you should not enter \"Checkout: Your Information\"")
    public void shouldNotEnterCheckoutYourInformation() {
        // Verifica si el carrito está vacío
        boolean isCartEmpty = yourCartPage.isCartEmpty();
      //  Assert.assertTrue("The cart is not empty, checkout should not be allowed.", isCartEmpty);

        // Verifica que el usuario no pueda acceder a la página de "Checkout: Your Information"
        String currentUrl = DriverManager.getDriver().driver.getCurrentUrl();
     //   Assert.assertFalse("User should not be able to proceed to checkout without items in the cart.",
        //        currentUrl.contains("checkout-step-one"));
    }*/
}

