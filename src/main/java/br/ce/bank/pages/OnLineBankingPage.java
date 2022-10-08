package br.ce.bank.pages;

import br.ce.rafael.core.BasePage;

public class OnLineBankingPage extends BasePage {
	
	public void acessindexpage(){
		clicarBotao("online-banking");
		clicarBotao("feedback");
	}
	
	public void login(){
		clicarBotao("signin_button");
	}

}
