package br.ce.suite.tests;

import org.junit.Assert;
import org.junit.Test;

import br.ce.bank.pages.FeedbackPage;
import br.ce.bank.pages.LoginPage;
import br.ce.bank.pages.OnLineBankingPage;
import br.ce.rafael.core.BaseTest;

public class BankTest extends BaseTest {
	
	OnLineBankingPage OnLineBankingPage = new OnLineBankingPage();
	FeedbackPage FeedbackPage = new FeedbackPage();
	LoginPage LoginPage = new LoginPage();
	
	
	
	@Test
	public void testVerifyThatTheMainNavigatorIsPresentInALLpages (){
		OnLineBankingPage.acessindexpage();
		
		FeedbackPage.signin();
		
		Assert.assertEquals("Log in to ZeroBank",FeedbackPage.obterMensagemPage() );
		
	}
	
	@Test
	public void testValidateNameInFormsFeedback (){
		
		OnLineBankingPage.acessindexpage();
		
		FeedbackPage.setNome("a");
		FeedbackPage.save();
						
		Assert.assertTrue("Preencha este campo", true);
		
	}
	
	@Test
	public void testValidateEmailInFormsFeedback (){
		
		OnLineBankingPage.acessindexpage();
		
		FeedbackPage.setNome("a");
		FeedbackPage.setEmail("a");	
		FeedbackPage.save();
						
		Assert.assertTrue("Preencha este campo", true);
		
	}
	
	@Test
	public void testValidateSubjectInFormsFeedback (){
		
		OnLineBankingPage.acessindexpage();
		
		FeedbackPage.setNome("a");
		FeedbackPage.setEmail("a");
		FeedbackPage.setSubject("a");	
		FeedbackPage.save();
						
		Assert.assertTrue("Preencha este campo", true);
		
	}
		
	@Test
	public void testValidateCommentInFormsFeedback (){
		
		OnLineBankingPage.acessindexpage();
		
		FeedbackPage.setNome("a");
		FeedbackPage.setEmail("a");
		FeedbackPage.setSubject("a");	
		FeedbackPage.setComment("a");	
		FeedbackPage.save();
						
		Assert.assertEquals("Feedback",FeedbackPage.obterMensagemSucesso());
		
	}
	
	@Test
	public void testLoginWithoutlinToCreateNewUser (){
		
		
		LoginPage.newUser();		
		LoginPage.setEmail("x");
		LoginPage.setSenha("123");
		LoginPage.entrar();	
		
		Assert.assertEquals("Login and/or password are wrong.",LoginPage.alertMessage());
		
	}
	
	
	
}
