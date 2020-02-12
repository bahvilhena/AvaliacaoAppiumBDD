package br.com.rsinet.hub_bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.screenObject.CadastroScreen;
import br.com.rsinet.hub_bdd.screenObject.HomeScreen;
import br.com.rsinet.hub_bdd.screenObject.PesquisaScreen;
import br.com.rsinet.hub_bdd.utils.MassaDados;

public class ScreenObjectManager {
	
	private WebDriver driver;
	
	private HomeScreen homeScreen;
	private CadastroScreen cadastroScreen;
	private PesquisaScreen pesquisaScreen;
	private MassaDados massaDados;
	
	
	public ScreenObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomeScreen getHomeScreen() {
		return (homeScreen == null) ? homeScreen = new HomeScreen(driver) : homeScreen;
	}
	
	public CadastroScreen getCadastroScreen() {
		return (cadastroScreen == null) ? cadastroScreen = new CadastroScreen(driver) : cadastroScreen;
	}
	
	public PesquisaScreen getPesquisaScreen() {
		return (pesquisaScreen == null) ? pesquisaScreen = new PesquisaScreen(driver) : pesquisaScreen;
	}
	
	public MassaDados getMassaDados() {
		return (massaDados == null) ? massaDados = new MassaDados(driver) : massaDados;
	}

}
