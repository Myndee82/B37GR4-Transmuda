package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage {

    public VehicleContractsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
