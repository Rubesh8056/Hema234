package Package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BasePage;
import Package1.HomePageObjects;
import Package1.RegPageObjects;

public class RegPageTest  {

			BasePage bp;
			HomePageObjects hp;
			RegPageObjects rp;
			
		public RegPageTest() {
		
			bp= new BasePage();
			hp= new	HomePageObjects();
			rp= new RegPageObjects();
		}
		
		@Test
		public void verifySsize() {
			//hp.dressesTag().click();
			Assert.assertTrue(bp.elementFound(rp.getSsize()),"Failed to display");
		}
		
	


}
