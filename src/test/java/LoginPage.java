import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;

import org.openqa.selenium.support.FindBy;

@PageUrl("https://pay-merchant-dashboard.web.pp-stage.xyz")
public class LoginPage extends FluentPage {

    @FindBy(css = "div.pt-form-group-container:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    private FluentWebElement mobileInput;

    public LoginPage inputChildMobileNumber(){
        String mobileNumber = "01722665267";
        mobileInput.fill().with(mobileNumber);
        return this;
    }

    public FluentWebElement inputMobile(){
        return mobileInput;
    }
    public FluentWebElement inputMobileAnother(){
        return find(".pt-form").find("input").index(0);
    }




}
