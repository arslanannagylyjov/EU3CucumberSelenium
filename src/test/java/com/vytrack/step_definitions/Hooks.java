package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUp() {
        System.out.println("\tcoming before");
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }

    @Before("@db")
    public void setUpDb() {
        System.out.println("\tconnecting to database");
    }

    @After("@db")
    public void tearDownDb() {
        System.out.println("\tdisconnecting from database");
    }
}
