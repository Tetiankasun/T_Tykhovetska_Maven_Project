package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;


public class AppTest extends TestRunner {

    //test1
    @Test
    public void verifySearchResult() {

        GoogleHomePage googleHomePage = new GoogleHomePage();
        googleHomePage.open();

        GoogleSearchResultPage searchResultPage = googleHomePage.search(searchTerm);

        String firstLinkText = searchResultPage.getLinkText(1);
        Assert.assertTrue(firstLinkText.toLowerCase().contains(searchTerm.toLowerCase()));

    }
    //test2
    @Test

    public void verifyGoogleLogoOnPage5(){

        GoogleHomePage googleHomePage = new GoogleHomePage();
        googleHomePage.openOne();

        GoogleSearchResultPage searchResultPage = googleHomePage.searchOne(searchTerm);
        searchResultPage.goToPage5();

        GoogleSearchResultPage2 searchResultPage2=new GoogleSearchResultPage2();
        searchResultPage2.checkGoogleLogo();


    }

    //test3
    @Test

    public void verifySearchResultsAndButtonSearch(){

        GoogleHomePage googleHomePage = new GoogleHomePage();
        googleHomePage.openTwo();

        GoogleSearchResultPage searchResultPage = googleHomePage.searchTwo(searchTerm);
        searchResultPage.getLinks();

        searchResultPage.verifyListOfLinksSize();

        searchResultPage.returnToHomePage();
        googleHomePage.checkSearchButton();

    }

}







