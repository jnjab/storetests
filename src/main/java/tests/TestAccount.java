package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import pages.AccountPage;
import pages.ListAccountsPage;
import pages.MenuPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAccount extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private AccountPage accountPage = new AccountPage();
	private ListAccountsPage listAccountsPage = new ListAccountsPage();
	
	@Test
	public void test1addAccount() {
		menuPage.triggerAddAccount();
		accountPage.addAccount("Conta 1");
		listAccountsPage.verifyAccountRegisterSucessMsg("Conta adicionada com sucesso!");
		listAccountsPage.verifyAccountOnList("Conta 1", "Conta","Conta","tabelaContas");
	}
	
	@Test
	public void test2AlterAccount() {
		menuPage.triggerMenuListAccount();
		listAccountsPage.triggerAlterAccount("Conta 1");
		accountPage.addAccount("Conta 1A");
		listAccountsPage.verifyAccountRegisterSucessMsg("Conta alterada com sucesso!");
		listAccountsPage.verifyAccountOnList("Conta 1A", "Conta","Conta","tabelaContas");
	}
	
	@Test
	public void test3addAccountWithExistName() {
		menuPage.triggerAddAccount();
		accountPage.addAccount("Conta 1A");
		listAccountsPage.verifyAccountRegisterErrorMsg("Já existe uma conta com esse nome!");
	}
	
}
