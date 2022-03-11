package com.fuseAngular.step_definitions;

import com.fuseAngular.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();


    }
    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
