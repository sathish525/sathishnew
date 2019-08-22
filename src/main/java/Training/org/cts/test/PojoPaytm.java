package Training.org.cts.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoPaytm extends BaseClass{
	public PojoPaytm() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div[text()='Log In/Sign Up']")
	private WebElement log1;
	
	@FindBy(xpath="//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']")
	private WebElement frame;
	
	@FindBy(xpath="//span[text()='Login/Signup with mobile number and password']")
	private WebElement log2;
	
	@FindBy(id="input_0")
	private WebElement user;
	
	@FindBy(id="input_1")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
    private WebElement sub;

	public WebElement getLog1() {
		return log1;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getLog2() {
		return log2;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSub() {
		return sub;
	}
	
	
	

}
