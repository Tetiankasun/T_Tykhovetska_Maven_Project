package org.example;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

public class GoogleHomePage {
    //test1
    public GoogleHomePage open (){
        return commonOpen();
    }
    @Step("Google Home Page Search For {searchTerm}")
    public GoogleSearchResultPage search(String searchTerm) {
        return commonSearch(searchTerm);
    }
    private GoogleHomePage commonOpen(){
        Selenide.open("http://www.google.com");
        return this;
    }
    private GoogleSearchResultPage commonSearch(String searchTerm) {
        String inputFieldPath = "//input [ @class=\"gLFyf\"]";
        Selenide.$x(inputFieldPath).sendKeys(searchTerm);
        Selenide.$x("//input[@type=\"submit\"]").click();
        return new GoogleSearchResultPage();
    }
    //test2

    public GoogleHomePage openOne() {
        return commonOpen();
    }
    public GoogleSearchResultPage searchOne(String searchTerm) {
        return commonSearch(searchTerm);
    }
    //test3
    public GoogleHomePage openTwo() {
        return commonOpen();
    }
    public GoogleSearchResultPage searchTwo(String searchTerm) {
        return commonSearch(searchTerm);
    }

    public boolean checkSearchButton(){

       Selenide.$x("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")
     //   Selenide.$x("//input[@class=\"gNO89b\"]")
                .shouldBe(Condition.visible);
        return true;
    }
}
