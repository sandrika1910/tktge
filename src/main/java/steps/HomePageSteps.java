package steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    public HomePageSteps acceptCookies() {
        homePage.acceptCookieBtn.click();
        return this;
    }

    public HomePageSteps tapLoginBtn() {
        homePage.loginBtn.click();
        return this;
    }

//    public HomePageSteps hoverOnCategoriesDropDown() {
//        homePage.navbarCategories.hover();
//        return this;
//    }
//
//    public HomePageSteps checkAfterHoverOnCategoriesDropDown() {
//        homePage.navbarCategoriesDropDownElement.should(Condition.appear);
//        return this;
//    }
//
//    public HomePageSteps clickOnMusicAndConcertInDropDown() {
//        homePage.musicAndConcertInCategoriesDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps backToHomePage() {
//        Selenide.back();
//        return this;
//    }
//
//    public HomePageSteps clickOnTransportInDropDown() {
//        homePage.transportInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnMoviesInDropDown() {
//        homePage.moviesInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnRailwayInDropDown() {
//        homePage.railwayInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnTheatreInDropDown() {
//        homePage.theatreInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnOperaInDropDown() {
//        homePage.operaInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnSportInDropDown() {
//        homePage.sportInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnSeaInDropDown() {
//        homePage.seaInDropDown.click();
//        return this;
//    }
//    public HomePageSteps clickOnFestivalInDropDown() {
//        homePage.festivalInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnKidsInDropDown() {
//        homePage.kidsInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnConferenceInDropDown() {
//        homePage.conferenceInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnTourismInDropDown() {
//        homePage.tourismInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnStandupInDropDown() {
//        homePage.standupInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnHobbyInDropDown() {
//        homePage.hobbyInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnMasterclassInDropDown() {
//        homePage.masterclassInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnMuseumDropDown() {
//        homePage.museumInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnInternationalInDropDown() {
//        homePage.internationalInDropDown.click();
//        return this;
//    }
//
//    public HomePageSteps clickOnFlyInDropDown() {
//        homePage.flyInDropDown.click();
//        return this;
//    }










}
