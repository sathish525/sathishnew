package Training.org.cts.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoPaytmElec extends BaseClass{
	public PojoPaytmElec() {
		
		PageFactory.initElements(driver,this);


	}
	@FindBy(xpath="//div[@class='_1rUn SaN4']")
private WebElement prepaid;
	public WebElement getPrepaid() {
		return prepaid;
	}
	

}
