package Training.org.cts.test;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaytmElectricity  extends BaseClass{
	
	@BeforeClass
	
	public static void launch() {
		
		getDriver();
	    url("https://paytm.com/");	
	}
	@Before
	 
	public void time1() {
		
		Date d=new Date();
		System.out.println(d); 
	}
	@After
	
	public void time2() {
		
		Date d=new Date();
		System.out.println(d);
		}
	
	@Test 
	
	public void Tc1() throws Throwable {
		
		PojoPaytmElec t=new PojoPaytmElec();
		
	Thread.sleep(4000);
	
	buttonclick(t.getPrepaid());

}
	
	
	
}
