package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehicleCost {

    public VehicleCost() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
