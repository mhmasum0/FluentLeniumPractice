import io.github.bonigarcia.wdm.WebDriverManager;
import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.configuration.FluentConfiguration;
import org.fluentlenium.core.annotation.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@FluentConfiguration(webDriver = "chrome")
public class FluentLeniumTC extends FluentTestNg {

    @Page
    LoginPage loginPage;

    @BeforeClass
    public static void sutUpBrowser(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void loginTest() throws InterruptedException {

        String mobileNumber = "01722665267";

//        goTo(loginPage);
//        loginPage.inputMobile()
//        .fill()
//        .with(mobileNumber);

        goTo(loginPage)
                .inputMobileAnother()
                .fill()
                .with(mobileNumber);

        System.out.println($(".user-number"));
        System.out.println( find(".pt-form").find("input").index(1));

        Thread.sleep(2000);
    }


}
