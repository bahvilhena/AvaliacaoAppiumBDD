package br.com.rsinet.hub_bdd.screenObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.manager.TestContext;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CadastroScreen {
	
	private WebDriver driver;
	@SuppressWarnings("unused")
	private TestContext testContext;
	
	public CadastroScreen(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txt_Usuario;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txt_Email;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txt_Senha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txt_ConfirmaSenha;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement txt_PrimeiroNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement txt_UltimoNome;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txt_Telefone;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutCountry")
	private WebElement combo_Pais;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txt_Estado;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText")
	private WebElement txt_Endereco;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText")
	private WebElement txt_Cidade;

	@FindBy(how = How.XPATH, using = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText")
	private WebElement txt_CEP;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/checkBoxRecieveOffers")
	private WebElement check_btn;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement bt_Registra;
	
	public void preencheUsuario(String et_Usuario) {
		txt_Usuario.click();
		txt_Usuario.sendKeys(et_Usuario);
	}
	
	public void preencheEmail(String et_Email) {
		txt_Email.click();		
		txt_Email.sendKeys(et_Email);
	}
	
	public void preencheSenha(String et_Senha) {
		txt_Senha.click();		
		txt_Senha.sendKeys(et_Senha);
	}
	
	public void preencheConfirmaSenha(String et_ConfirmaSenha) {
		txt_ConfirmaSenha.click();		
		txt_ConfirmaSenha.sendKeys(et_ConfirmaSenha);
	}
	
	public void preencheNome(String et_PrimeiroNome) {
		txt_PrimeiroNome.click();		
		txt_PrimeiroNome.sendKeys(et_PrimeiroNome);
	}
	
	public void preencheUltimoNome(String et_UltimoNome) {
		txt_UltimoNome.click();		
		txt_UltimoNome.sendKeys(et_UltimoNome);
	}
	
	public void preencheTelefone(String et_Telefone) {
		txt_Telefone.click();		
		txt_Telefone.sendKeys(et_Telefone);
	}
	
	public void clicaPais() {
		combo_Pais.click();
	}
	
	public void clicaBrazil(@SuppressWarnings("rawtypes") AndroidDriver driver, String visibleText) {
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"" + visibleText + "\")"))
		.click();	
	}
	
	public void preencheEstado(String et_Estado) {
		txt_Estado.click();	
		txt_Estado.sendKeys(et_Estado);	
	}
	
	public void preencheEndereco(String et_Endereco) {
		txt_Endereco.click();	
		txt_Endereco.sendKeys(et_Endereco);
	}
	
	public void preencheCidade(String et_Cidade) {
		txt_Cidade.click();	
		txt_Cidade.sendKeys(et_Cidade);
	}
	
	public void preencheCEP(String et_CEP) {
		txt_CEP.click();	
		txt_CEP.sendKeys(et_CEP);
	}
	
	public void clicaCheckOffers() {
		check_btn.click();
	}
	
	public MobileElement encontraMsgSenha() {
		MobileElement tvPassword = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.TextView"));
		return tvPassword;
	}

	public void clicaRegistra() {
		bt_Registra.click();	
	}
	
	@SuppressWarnings("rawtypes")
	public void RolarTela(double inicio, double fim) throws Exception {
		Dimension size = driver.manage().window().getSize();

		int x = size.width / 2;
		int start_y = (int) (size.height * inicio);
		int end_y = (int) (size.height * fim);
		new TouchAction((PerformsTouchActions) driver).press(PointOption.point(x, start_y))
				.waitAction((WaitOptions.waitOptions(Duration.ofMillis(500))))//
				.moveTo(PointOption.point(x, end_y))//
				.release().perform();

	}
	
	public void scrollPais(@SuppressWarnings("rawtypes") AndroidDriver driver, String visibleText) {
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
						+ visibleText + "\").instance(0))");
	}
	
}
