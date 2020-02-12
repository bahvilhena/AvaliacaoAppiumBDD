package br.com.rsinet.hub_bdd.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import br.com.rsinet.hub_bdd.manager.ScreenObjectManager;
import br.com.rsinet.hub_bdd.manager.TestContext;
import br.com.rsinet.hub_bdd.screenObject.CadastroScreen;
import br.com.rsinet.hub_bdd.screenObject.HomeScreen;
import br.com.rsinet.hub_bdd.utils.Constants;
import br.com.rsinet.hub_bdd.utils.ExcelUtils;
import br.com.rsinet.hub_bdd.utils.MassaDados;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.android.AndroidDriver;

public class Cadastrar {
	
	private WebDriver driver;
	private CadastroScreen cadastroScreen;
	private HomeScreen homeScreen;
	private MassaDados massaDados;
	private TestContext testContext;
	
	public Cadastrar(TestContext context) throws Exception {
		testContext = context;
		driver = testContext.getDriverFactory().iniciarApp();
	}
	
	@Dado("^que o usuario tenha entrado no app e clicado na opcao de menu$")
	public void que_o_usuario_entre_no_app_e_clica_na_opcao_de_menu() throws Throwable {
		PageFactory.initElements(driver, this);
		ScreenObjectManager manager = new ScreenObjectManager(driver);
		cadastroScreen = manager.getCadastroScreen();
		homeScreen = manager.getHomeScreen();
		massaDados = manager.getMassaDados();

		ExcelUtils.setExcelFile(Constants.Path_TestData + Constants.File_TestData, "Cadastro");
		
		homeScreen.clicaMenu();
	}
	
	@Quando("^ele clicar no link de login$")
	public void ele_clicar_no_link_de_login() throws Throwable {
		homeScreen.clicaLogin();
	}

	@Quando("^clicar no link de criar uma nova conta$")
	public void clicar_no_link_de_criar_uma_nova_conta() throws Throwable {
		homeScreen.clicaNovaConta();
	}

	@SuppressWarnings("rawtypes")
	@Quando("^o usuario preencher o formulario de cadastro$")
	public void o_usuario_preencher_o_formulario_de_cadastro() throws Throwable {
		cadastroScreen.preencheUsuario(massaDados.Usuario());
		
		cadastroScreen.preencheEmail(massaDados.Email());
		
		cadastroScreen.preencheSenha(massaDados.Senha());
		
		cadastroScreen.preencheConfirmaSenha(massaDados.ConfirmaSenha());

		cadastroScreen.preencheNome(massaDados.Nome());
		
		cadastroScreen.preencheUltimoNome(massaDados.UltimoNome());
		
		cadastroScreen.RolarTela(0.9, 0.0);
		
		cadastroScreen.preencheTelefone(massaDados.Telefone());
		
		cadastroScreen.clicaPais();	
		
		cadastroScreen.scrollPais((AndroidDriver) driver, "Brazil");
		
		cadastroScreen.clicaBrazil((AndroidDriver) driver, "Brazil");
		
		cadastroScreen.preencheEstado(massaDados.Estado());
		
		cadastroScreen.preencheEndereco(massaDados.Endereco());
		
		cadastroScreen.preencheCidade(massaDados.Cidade());

		cadastroScreen.preencheCEP(massaDados.Cep());
	}

	@Quando("^clicar na caixa de receber ofertas$")
	public void clicar_na_caixa_de_receber_ofertas() throws Throwable {
		cadastroScreen.clicaCheckOffers();
	}

	@Quando("^ele clicar no botao de registrar$")
	public void ele_clicar_no_botao_de_registrar() throws Throwable {
		cadastroScreen.clicaRegistra();
	}

	@Entao("^verifica se o usuario esta logado$")
	public void verifica_se_o_usuario_esta_logado() throws Throwable {
		homeScreen.clicaMenu();
		
		String mensagem = massaDados.MenssagemAssertCadastroSucesso();
		String condicao = massaDados.Usuario();
		
		String pass = homeScreen.login().getText();
		
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}

	@Quando("^o usuario preencher o formulario de cadastro com a confirmacao de senha diferente da senha$")
	public void o_usuario_preencher_o_formulario_de_cadastro_com_a_confirmacao_de_senha_diferente_da_senha() throws Throwable {
		cadastroScreen.preencheUsuario(massaDados.Usuario());
		
		cadastroScreen.preencheEmail(massaDados.Email());
		
		cadastroScreen.preencheSenha(massaDados.Senha());
		
		cadastroScreen.preencheConfirmaSenha(massaDados.ConfirmPasswordErrado());
		
		cadastroScreen.preencheNome(massaDados.Nome());
	}

	@Entao("^o usuario nao pode efetuar o registro$")
	public void o_usuario_nao_pode_efetuar_o_registro() throws Throwable {
		String condicao = massaDados.CondicaoAssertCadastroErro();
		String mensagem = massaDados.MenssagemAssertCadastroErro();
		String pass = cadastroScreen.encontraMsgSenha().getText();
		
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
}
