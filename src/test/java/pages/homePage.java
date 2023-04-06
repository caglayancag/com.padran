package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage {

    public homePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home menu-item-has-children menu-item-503']")
    public WebElement servicesLink;

    @FindBy(xpath = "//*[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-496']")
    public WebElement testAutomationLink;

    @FindBy(xpath = "//*[@class='entry-title']")
    public WebElement testAutomationtext;


    @FindBy(xpath = "//*[@class='search-circle']")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@class='search-field']")
    public WebElement searchField;

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement searchResult;


}


