package Package2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.HomePageObjects;

public class HomePageTest {
	
	HomePageObjects hp;
	BasePage Bp;
	
	public HomePageTest() {
		hp=new HomePageObjects();
		Bp=new BasePage();
	}
		
		
		@Test
		public void verifyWomenTag() {
			Assert.assertTrue(Bp.elementFound(hp.getwomenTag()),"fail");
			Assert.assertTrue(Bp.elementFound(hp.getdressesTag()),"fail");
			Assert.assertTrue(Bp.elementFound(hp.getTshirtTag()), "fail");

		}
		@Test
		public void verifyTitle() {
		hp.clickwomen();;
		String s=hp.getWomenTitle();	
		Assert.assertTrue(s.equals("Women"), "failed");
		}
		@Test
		public void verifyTitle1() {
			hp.clickdresses();;
			String s1=hp.getdreseesTag();
			Assert.assertTrue(s1.equals("Dresses"),"failed");
		}
		
		@Test
		public void verifyNewsletter() {
			hp.setnletter("rk8056214531@gmail.com");
			String s1=hp.gettxtsubs();
			Assert.assertTrue(s1.equals("successful"), "Failed to subscription");
		}

		
		}
		


