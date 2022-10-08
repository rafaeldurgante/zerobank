package br.ce.bank.pages;

import org.openqa.selenium.By;

import br.ce.rafael.core.BasePage;

public class FeedbackPage extends BasePage {

	public void setNome(String nome) {
		escrever("name", nome);
	}
	
	public void setEmail(String email) {
		escrever("email", email);
	}
	
	public void setSubject(String subject) {
		escrever("subject", subject);
	}
	
	public void setComment(String comment) {
		escrever("comment", comment);
	}
		
	public void signin(){
		clicarBotao(By.id("signin_button"));
	}
	
	public void save(){
		clicarBotao(By.name("submit"));
	}
	
	public String obterMensagemPage(){
		return obterTexto(By.className("page-header"));
	}
	
	public String obterMensagemSucesso(){
		return obterTexto(By.className("page-header"));
	}
}
