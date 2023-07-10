package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    //#1 - Create the constructor and initiate the driver with object

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    //#2 Use @FindBy instead of FIndElement(){
    @FindBy(name = "q")
public WebElement searchBox;


}
