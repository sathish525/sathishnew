package Training.org.cts.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoMovie extends BaseClass{
	
	public PojoMovie() {

		PageFactory.initElements(driver,this);

		}
		public WebElement getMovie() {
		return movie;
		}
		@FindBy(xpath="//span[text()='Movies']")
		private WebElement movie;

		@FindBy(xpath="(//a[@href='https://paytm.com/movies/chennai'])[1]")
		private WebElement che;

		@FindBy(xpath="//div[text()='comali']")
		private WebElement comali;






		public WebElement getComali() {
		return comali;
		}
		public WebElement getChe() {
		return che;
		}	
		@FindBy(xpath="//a[text()='09:25 AM']")
		private WebElement ti;






		public WebElement getTi() {
		return ti;
		}





}
