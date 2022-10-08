package br.ce.bank.pages;

import org.openqa.selenium.By;

import br.ce.rafael.core.BasePage;
import br.ce.rafael.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void newUser ( ) {
		DriverFactory.getDriver().get("http://zero.webappsecurity.com/login.html");
	}
	
	public void setEmail(String email) {
		escrever("user_login", email);
	}
	
	public void setSenha(String senha) {
		escrever("user_password", senha);
	}
	
	public void entrar(){
		clicarBotao(By.xpath("//*[@id=\"login_form\"]/div[2]/input"));
	}
	
	public String alertMessage(){
		return obterTexto(By.xpath("//*[@id=\"login_form\"]/div[1]"));
	}

}
