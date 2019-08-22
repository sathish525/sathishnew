package Training.org.cts.test;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaytmLogin extends BaseClass{
	

	
		
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
			
				PojoPaytm t=new PojoPaytm();
				
			Thread.sleep(4000);
			
			buttonclick(t.getLog1());
			driver.switchTo().frame(t.getFrame());
			buttonclick(t.getLog2());
			fill(t.getUser(),"sathish@gmail.com");
			fill(t.getPass(),"1234567");
			buttonclick(t.getSub());
			  
			   }
			
			


			@Test
			public void tc3() throws Throwable {
				PojoRecharge po = new PojoRecharge();

			Thread.sleep(4000);




			Thread.sleep(3000);

			buttonclick(po.getMob());



			fill(po.getNum(),"8015855308");

			Thread.sleep(3000);

			buttonclick(po.getCost());

			buttonclick(po.getProc());
			}


			@Test

			public void movie() throws Throwable {

			PojoMovie mov=new PojoMovie();

			Thread.sleep(4000);

			buttonclick(mov.getMovie());

			   buttonclick(mov.getChe());
			   
			   buttonclick(mov.getComali());
			   
			   Thread.sleep(4000);
			   
			   buttonclick(mov.getTi());
			}
			
			
			
	}			

