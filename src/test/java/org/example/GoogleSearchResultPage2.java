package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

public class GoogleSearchResultPage2 {

    public boolean checkGoogleLogo(){

        Selenide.$x("/html[1]/body[1]/div[4]/div[2]/form[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
                .shouldBe(Condition.visible);
                return true;
    }
}
