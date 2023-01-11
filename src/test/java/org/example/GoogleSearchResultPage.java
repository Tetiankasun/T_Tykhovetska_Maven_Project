package org.example;

import com.codeborne.selenide.Selenide;

import java.util.ArrayList;
import java.util.List;

public class GoogleSearchResultPage {

//test1
public String getLinkText(int linkNumber){

    return Selenide.$x("//a["+linkNumber+"]").getText();

}
//test2
public GoogleSearchResultPage2 goToPage5(){

    Selenide.$x("//a[@class=\"fl\"][@aria-label=\"Page 5\"]").click();
    return new GoogleSearchResultPage2();
}

//test3
public List<String> getLinks(){
    return Selenide.$$x("//h3").texts();
}
public boolean verifyListOfLinksSize() {
    return getLinks().size() >= 5;
}

public GoogleSearchResultPage returnToHomePage(){

    Selenide.$x("//a[@id='logo']").click();
    return this;

}
}
