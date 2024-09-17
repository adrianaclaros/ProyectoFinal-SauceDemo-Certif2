package pages;

import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage {
    WebDriver driver;

    @FindBy(className = "app_logo")
    WebElement sauceDemoTitle;

    @FindBy(className = "inventory_item_name")
    List<WebElement> productsTitle;

    @FindBy(className = "shopping_cart_badge")
    WebElement cartIcon;

    //Prueba de links:
    @FindBy(linkText = "Twitter")
    WebElement twitterLink;

    @FindBy(linkText = "Facebook")
    WebElement facebookLink;

    @FindBy(linkText = "LinkedIn")
    WebElement linkedinLink;
//

    //Prueba de sistema de ordenamiento
    @FindBy(className = "product_sort_container")
    WebElement sortComboBox;

    @FindBy(className = "inventory_item_name")
    List<WebElement> productNames;
//

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean sauceDemoTitleIsDisplayed() {
        if (sauceDemoTitle.isDisplayed()) {
            return true;
        }
        return false;
    }

    //añadir al carrito algun producto
    public void addProductToCart(String productName) {
        String productId = "add-to-cart-" + productName.replace(" ", "-").toLowerCase();
        WebElement productAddToCartButton = driver.findElement(By.id(productId));
        productAddToCartButton.click();
    }

    public boolean verifyCartIconNumber(String cartNumber) {
        String actualCartNumber = cartIcon.getText();
        if (actualCartNumber.equalsIgnoreCase(cartNumber)) {
            return true;
        }
        return false;
    }

    //remueve el producto del carrito
    public void removeProductFromCart(String productName) {
        String productId = "remove-" + productName.replace(" ", "-").toLowerCase();
        WebElement removeProductButton = driver.findElement(By.id(productId));
        removeProductButton.click();
    }

//Redes Sociales

    // Obtiene la URL del enlace de red social
    public String getLink(String socialMedia) {
        switch (socialMedia.toLowerCase()) {
            case "twitter":
                return twitterLink.getAttribute("href");
            case "facebook":
                return facebookLink.getAttribute("href");
            case "linkedin":
                return linkedinLink.getAttribute("href");
            default:
                return null;
        }
    }

    // Clic en el enlace de red social
    public void clickOnLink(String socialMedia) {
        switch (socialMedia.toLowerCase()) {
            case "twitter":
                twitterLink.click();
                break;
            case "facebook":
                facebookLink.click();
                break;
            case "linkedin":
                linkedinLink.click();
                break;
        }
    }

    //Sistema de ordenamiento
    // Ordena los productos de la Z a la A
    public void sortProductsByNameZToA() {
        Select selectObject = new Select(sortComboBox);
        selectObject.selectByVisibleText("Name (Z to A)");
    }

    // Verifica si los productos están ordenados de la Z a la A
    public boolean areProductsSortedByNameZToA() {
        List<String> actualProductsOrder = new ArrayList<>();
        for (WebElement element : productNames) {
            actualProductsOrder.add(element.getText());
        }

        List<String> sortedList = new ArrayList<>(actualProductsOrder);
        sortedList.sort((a, b) -> b.compareTo(a));
        return Ordering.natural().reverse().isOrdered(actualProductsOrder);
    }
}

