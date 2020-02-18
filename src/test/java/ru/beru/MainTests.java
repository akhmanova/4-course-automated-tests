package ru.beru;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListener.class})
public class MainTests extends DriverSetup {

    @DataProvider(name = "regions")
    public Object[][] createData(){
        return new Object[][] { { "Хвалынск" }, { "Саратов" } };
    }

    @Test
    public void firstTest() {
        logger.info("Set Home Page");
        HomePage homePage = new HomePage(getEventDriver(), getWait());
        logger.info("Click Login Button");
        homePage.clickLoginBtn();

        logger.info("Open login page.");
        LoginPage loginPage = new LoginPage(getEventDriver(), getWait());
        logger.info("Enter login");
        loginPage.enterLogin();
        logger.info("Press continue");
        loginPage.clickSubmitBtn();
        logger.info("Enter password");
        loginPage.enterPassword();
        logger.info("Click submit");
        loginPage.clickSubmitBtn();

        homePage.assertLoginBtnChange();
        logger.info("First test finished successfully");
    }

    @Test
    public void secondTest() {
        logger.info("Set Home Page");
        HomePage homePage = new HomePage(getEventDriver(), getWait());

        logger.info("Click region");
        homePage.pressCityButton();

        SetCityPage setCityPage = new SetCityPage(getEventDriver(), getWait());
        logger.info("Set region");
        setCityPage.enterRegion("Хвалынск");

        logger.info("Confirm region");
        ConfirmCityPage confirmCityPage = new ConfirmCityPage(getEventDriver(), getWait());
        confirmCityPage.confirmRegion();


//        homePage.clickRegion();


//        logger.info("Click Login Button");
//        homePage.clickLoginBtn();
//
//        logger.info("Open login page.");
//        LoginPage loginPage = new LoginPage(getEventDriver(), getWait());
//        logger.info("Enter login");
//        loginPage.enterLogin();
//        logger.info("Press continue");
//        loginPage.clickSubmitBtn();
//        logger.info("Enter password");
//        loginPage.enterPassword();
//        logger.info("Click submit");
//        loginPage.clickSubmitBtn();
//
//        loginPage.clickProfile();

    }

    @Test(dataProvider = "regions")
    public void third(String region) {
//        logger.info("Set Home Page");
//        HomePage homePage = new HomePage(getEventDriver(), getWait());
//        logger.info("Click Login Button");
//        homePage.clickLoginBtn();

        logger.info("Open login page.");
        LoginPage loginPage = new LoginPage(getEventDriver(), getWait());
        logger.info("Enter login");
        loginPage.enterLogin();
        logger.info("Press continue");
        loginPage.clickSubmitBtn();
        logger.info("Enter password");
        loginPage.enterPassword();
        logger.info("Click submit");
        loginPage.clickSubmitBtn();

//        homePage.clickRegion();

    }

    @Test
    public void thirdTest() {
        logger.info("Start third test.");
        HomePage homePage = new HomePage(getEventDriver(), getWait());

//        homePage.clickCatalogBtn();
//        homePage.chooseToothbrushes();
//
//        (new IntermediateProductPage(getDriver(), getWait())).chooseElectricToothbrushes();
//
//        ProductPage productPage = new ProductPage(getDriver(), getWait());
//        productPage.enterPriceRange();
//        productPage.clickShowMoreBtn();
//        productPage.assertProductsPrices();
//        productPage.addProductToCart();
//        productPage.goToCart();
//
//        CartPage cartPage = new CartPage(getDriver(), getWait());
//        cartPage.assertDelivery();
//        cartPage.assertTotalPrice();
//        cartPage.addProduct();
//        cartPage.assertFreeDelivery();
//        cartPage.assertTotalPriceAfter();
    }
}
