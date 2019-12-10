package Package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPageObjects extends BasePage {
	
	
	@FindBy (xpath="//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement sSize;
	
	@FindBy(xpath="")
	private WebElement mSize;
	
	@FindBy(xpath="")
	private WebElement lSize;
	public RegPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSsize() {
		return sSize;
		
	}

	
	 public WebElement getMsize() {
		 return mSize;
	 }
	 public WebElement getLsize() {

		 return lSize;
	 }
	 
}
