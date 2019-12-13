package Package1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	private static final WebElement TshirtsTag = null;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement womenTag;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dressesTag;
	
	@FindBy(xpath="//*[@id=\"newsletter-input\"]")
	private WebElement nletter;
	
	@FindBy(xpath="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement nbutton;
	
	@FindBy(xpath="//*[@id=\"columns\"]/p")
	private WebElement txtsubs;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    private WebElement TshirtTag;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);

	}

	public WebElement getwomenTag() {
		return womenTag;
	}

	public WebElement getdressesTag132() {
		return dressesTag;
	}
	
		public WebElement getTshirtTag(){
			return TshirtTag;
			
		}

	
	
	
	public void setnletter13(String email) {
		setText(nletter, email);
		nbutton.click();
	}
	public String gettxtsubs() {
		return txtsubs.getText();
	}

   public void clickwomen() {
	   womenTag.click();
   }
   public void clickdresses() {
	   dressesTag.click();
   }
   
  public void clickTshirts() {
       TshirtsTag.click();
}
  public String getWomenTitle() {
		return womenTag.getText();
  }
  public String getdreseesTag() {
	  return dressesTag.getText();
  }
  public String getTshirtsTag() {
	  return TshirtsTag.getText();
  }
  }

