package com.fuseAngular.pages;

import com.fuseAngular.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
