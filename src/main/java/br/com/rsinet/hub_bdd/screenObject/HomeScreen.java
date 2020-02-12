package br.com.rsinet.hub_bdd.screenObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class HomeScreen {
	
	private WebDriver driver;
	
	public HomeScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement btn_Login;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewDontHaveAnAccount")
	private WebElement btn_CriarNovaConta;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement btn_BarraPesquisa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement btn_Lupa;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.ImageView")
	private WebElement btn_CatSpeakers;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")
	private WebElement txt_UsuarioLogin;

	@FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")
	private WebElement txt_UsuarioSenha;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonLogin")
	private WebElement btn_LoginU;

	private MobileElement localizarMenu(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement localizarMenu = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")));
		return localizarMenu;
	}
	
	public void clicaMenu() {
		localizarMenu(driver).click();
	}
	
	public void clicaLogin() {
		btn_Login.click();
	}
	
	public void clicaNovaConta() {
		btn_CriarNovaConta.click();
	}
	
	public MobileElement login() {
		MobileElement clicaLogin = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
		return clicaLogin;
	}
	
	public void preenchePesquisa(String et_BarraPesquisa) {
		btn_BarraPesquisa.click();
		btn_BarraPesquisa.sendKeys(et_BarraPesquisa);
	}
	
	public void clicaLupa() {
		btn_Lupa.click();
	}
	
	public void clicaCategoriaSpeakers() {
		btn_CatSpeakers.click();
	}
	
	public void preencheLogin(String et_UsuarioLogin) {
		txt_UsuarioLogin.click();
		txt_UsuarioLogin.sendKeys(et_UsuarioLogin);
	}
	
	public void preencheSenhaLogin(String et_SenhaLogin) {
		txt_UsuarioSenha.click();
		txt_UsuarioSenha.sendKeys(et_SenhaLogin);
	}
	
	public void clicaBtnLogin() {
		btn_LoginU.click();
	}
	
	private MobileElement localizarBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		MobileElement encontraNoBt = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")));
		return encontraNoBt;
	}
	
	public void clicarBtn() throws InterruptedException {
		localizarBtn(driver).click();
	}
	
	
}