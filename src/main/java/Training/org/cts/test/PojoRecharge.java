package Training.org.cts.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoRecharge extends BaseClass {
	public PojoRecharge() {

		PageFactory.initElements(driver,this);
		}



		public WebElement getMob() {
		return mob;
		}


		public WebElement getNum() {
		return num;
		}


		public WebElement getAirtel() {
		return airtel;
		}


		public WebElement getCir() {
		return cir;
		}





		public WebElement getCost() {
		return cost;
		}





		@FindBy(xpath="//span[text()='Mobile Prepaid']")

		private WebElement mob;




		@FindBy(xpath="//input[@type='tel']")

		private WebElement num;


		@FindBy(xpath="(//input[@type='text'])[1]")

		private WebElement airtel;

		@FindBy(xpath="(//input[@type='text'])[2]")
		private WebElement cir;


		@FindBy(xpath="//button[text()='Rs. 1359']")
		private WebElement cost;

		@FindBy(xpath="//button[text()='Proceed to Recharge']")
		private WebElement proc;

		public WebElement getProc() {
		return proc;
		}
}
