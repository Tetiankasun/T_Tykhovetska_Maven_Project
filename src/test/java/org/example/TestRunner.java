package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;



public abstract class TestRunner {

    String searchTerm = "test automation";

    @BeforeClass
    public void setUp(){

        Configuration.browser="chrome";
        Configuration.timeout=10*1000;
        Configuration.browserSize="1024*768";

    }
}
