package br.ce.bank.pages;

import org.openqa.selenium.By;

import br.ce.rafael.core.BasePage;
import br.ce.rafael.core.DriverFactory;

public class IndexPage extends BasePage {
	
	public void acessindexpage(){
		DriverFactory.getDriver().get("http://zero.webappsecurity.com/index.html");
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSenha(String senha) {
		escrever("senha", senha);
	}
	
	public void entrar(){
		clicarBotao(By.xpath("//button[.='signin_button']"));
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}

}
