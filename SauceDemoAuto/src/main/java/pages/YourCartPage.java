package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class YourCartPage {
/*
    WebDriver driver;

//Editar la unidad de los productos
    @FindBy(className = "cart_item")
    List<WebElement> cartItems;

    @FindBy(className = "shopping_cart_badge")
    WebElement cartIcon;

//Hacer Checkout sin productos añadidos
    @FindBy(id = "checkout")  // Localizador del botón de Checkout en el carrito
        WebElement checkoutButton;

    @FindBy(name = "cart_item")  // Localizador de los productos en el carrito
    WebElement cartItem;

    public YourCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//Editar las unidades de productos
    // Verifica que la página del carrito esté desplegada
    public boolean isCartPageDisplayed() {
        return driver.getTitle().contains("Your Cart");
    }

    // Establece la cantidad de productos en el carrito
    public void setProductQuantity(String productName, int quantity) {
        for (WebElement item : cartItems) {
            WebElement productTitle = item.findElement(By.className("inventory_item_name"));
            if (productTitle.getText().equalsIgnoreCase(productName)) {
                WebElement quantityInput = item.findElement(By.className("cart_quantity_input"));
                quantityInput.clear();
                quantityInput.sendKeys(String.valueOf(quantity));
                break;
            }
        }
    }

    // Verifica que la cantidad de un producto en el carrito es la esperada
    public boolean verifyProductQuantity(String productName, String expectedQuantity) {
        for (WebElement item : cartItems) {
            WebElement productTitle = item.findElement(By.className("inventory_item_name"));
            if (productTitle.getText().equalsIgnoreCase(productName)) {
                WebElement quantityInput = item.findElement(By.className("cart_quantity_input"));
                String actualQuantity = quantityInput.getAttribute("value");
                return actualQuantity.equals(expectedQuantity);
            }
        }
        return false;
    }

//Checkout
    public void clickCheckoutButton() {
        checkoutButton.click();
}

    public boolean isCartEmpty() {
        // Verifica si no hay elementos en el carrito
        return driver.findElements(By.name(".cart_item")).isEmpty();
    }*/
}

