import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CourseDetails_POM;
import utility.BaseDriver;
import utility.ConfigReader;
import utility.MyFunc;

public class US_CourseDetails extends BaseDriver {

    @Test
    public void courseDetails() {
        CourseDetails_POM element = new CourseDetails_POM();

        driver.get(ConfigReader.getProperty("URL"));
        wait.until(ExpectedConditions.urlToBe(ConfigReader.getProperty("URL")));

        MyFunc.scrollToElement(element.courseSDET);
        Assert.assertTrue(element.courseSDET.isDisplayed());

        MyFunc.myClick(element.detailedInformationButton);

        MyFunc.scrollToElement(element.applyNowButton);
        Assert.assertTrue(element.informationSDET.isDisplayed());

        Assert.assertTrue(element.technoLogo.isDisplayed());
        MyFunc.myClick(element.technoLogo);
        Assert.assertTrue(element.homepageControl.isDisplayed());

        MyFunc.scrollToElement(element.courseAndroidApplication);
        Assert.assertTrue(element.courseAndroidApplication.isDisplayed());

        MyFunc.myClick(element.androidApplicationButton);
        Assert.assertTrue(element.androidApplicationText.isDisplayed());
        MyFunc.myClick(element.detailedButtonSecond);

        MyFunc.scrollToElement(element.informationField);
        Assert.assertTrue(element.informationField.isDisplayed());
        Assert.assertTrue(element.informationFieldSecond.isDisplayed());
        Assert.assertTrue(element.informationFieldThird.isDisplayed());

        Assert.assertTrue(element.technoLogo.isDisplayed());
        MyFunc.myClick(element.technoLogo);
        Assert.assertTrue(element.homepageControl.isDisplayed());

        MyFunc.scrollToElement(element.dataScience);
        Assert.assertTrue(element.dataScience.isDisplayed());

        MyFunc.myClick(element.dataScienceButton);

        wait.until(ExpectedConditions.visibilityOf(element.onlineText));
        Assert.assertTrue(element.onlineText.isDisplayed());

        MyFunc.myClick(element.detailedButton);

        wait.until(ExpectedConditions.visibilityOf(element.dataScienceContent));
        Assert.assertTrue(element.dataScienceContent.isDisplayed());

        Assert.assertTrue(element.technoLogo.isDisplayed());
        MyFunc.myClick(element.technoLogo);
        Assert.assertTrue(element.homepageControl.isDisplayed());
    }
}
