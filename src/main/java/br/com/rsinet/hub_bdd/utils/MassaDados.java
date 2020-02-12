package br.com.rsinet.hub_bdd.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MassaDados {
	
	@SuppressWarnings("unused")
	private WebDriver driver;
	
	public MassaDados(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public String Usuario() throws Exception {
		return ExcelUtils.getCellData(1, Constants.userName);
	}
	
	public String Email() throws Exception {
		return ExcelUtils.getCellData (2, Constants.email);
	}
	
	public String Senha() throws Exception {
		return ExcelUtils.getCellData(3, Constants.password);
	}
	
	public String ConfirmaSenha() throws Exception {
		return ExcelUtils.getCellData(4, Constants.confirmPassword);
	}
	
	public String ConfirmPasswordErrado() throws Exception {
		return ExcelUtils.getCellData(5, Constants.confirmInvalidPassword);
	}
	
	public String Nome() throws Exception {
		return ExcelUtils.getCellData(6, Constants.firstName);
	}
	
	public String UltimoNome() throws Exception {
		return ExcelUtils.getCellData(7, Constants.lastName);
	}
	
	public String Telefone() throws Exception {
		return ExcelUtils.getCellData(8, Constants.telefone);
	}
	
	public String Pais() throws Exception {
		return ExcelUtils.getCellData(9, Constants.pais);
	}
	
	public String Cidade() throws Exception {
		return ExcelUtils.getCellData(10, Constants.cidade);
	}
	
	public String Endereco() throws Exception {
		return ExcelUtils.getCellData(11, Constants.endereco);
	}
	
	public String Estado() throws Exception {
		return ExcelUtils.getCellData(12, Constants.estado);
	}
	
	public String Cep() throws Exception {
		return ExcelUtils.getCellData(13, Constants.cep);
	}
	
	public String MenssagemAssertCadastroSucesso() throws Exception {
		return ExcelUtils.getCellData(3, Constants.mensagemAssertCadastroSucesso);
	}
	
	public String CondicaoAssertCadastroErro() throws Exception {
		return ExcelUtils.getCellData(1, Constants.condicaoAssertCadastroErro);
	}
	
	public String MenssagemAssertCadastroErro() throws Exception {
		return ExcelUtils.getCellData(2, Constants.mensagemAssertCadastroErro);
	}
	
	//PesquisaBarra
	public String PesquisaBarra() throws Exception {
		return ExcelUtils.getCellData(1, Constants.pesquisaBarra);
	}
	
	public String PesquisaNaBarraErro() throws Exception {
		return ExcelUtils.getCellData(5, Constants.pesquisaBarraErro);
	}
	
	public String CondicaoAssertBarra() throws Exception {
		return ExcelUtils.getCellData(1, Constants.condicaoAssertBarra);
	}
	
	public String MenssagemAssertBarra() throws Exception {
		return ExcelUtils.getCellData(2, Constants.mensagemAssertBarra);
	}
	
	//PesquisaCategoria
	public String ClicaNoProduto() throws Exception {
		return ExcelUtils.getCellData(5, Constants.clicaProduto);
	}
	
	public String CondicaoAssertMassaSucesso() throws Exception {
		return ExcelUtils.getCellData(2, Constants.condicaoAssertMassaSucesso);
	}
	
	public String MenssagemAssertMassaSucesso() throws Exception {
		return ExcelUtils.getCellData(1, Constants.mensagemAssertMassaSucesso);
	}
	
	public String CondicaoAssertMassaErro() throws Exception {
		return ExcelUtils.getCellData(4, Constants.condicaoAssertMassaErro);
	}
	
	public String MenssagemAssertMassaErro() throws Exception {
		return ExcelUtils.getCellData(3, Constants.mensagemAssertMassaErro);
	}
	
	public String QuantidadeProduto() throws Exception {
		return ExcelUtils.getCellData(8, Constants.quantidadeCat);
	}
}
