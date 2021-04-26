package tests;

import java.io.IOException;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import core.BaseTest;
import pages.AddressPO;
import pages.LoginPO;
import pages.PaymentPO;
import pages.ShippingPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCheckoutProduct extends BaseTest {

	public TestCheckoutProduct() {
	}

	LoginPO page = new LoginPO();
	AddressPO address = new AddressPO();
	ShippingPO shipping = new ShippingPO();
	PaymentPO payment = new PaymentPO();

	// pesquisar produtos
	public void searchProduct() {
		il.setTxtsearch("Faded Short Sleeve T-shirts");
		il.clickSearch();
	}

	// adicionar ao carrinho
	public void addToCart() {
		il.mouseOverImage();
		il.addCart();
		il.proceedToCheckout();
		il.proceedToCheckoutOrder();
	}

	// efetuar o login
	public void login() {
		page.Login("asnazevedo@globo.com", "asna5664");
	}

	// confirmar o endereço
	public void checkoutAddress() {
		//address.verifyAddress("Rua Otto, 805", "Irving, Texas 75014", "United States");
		address.proceedToCheckoutAddress();
	}

	// confirmar termos
	public void checkoutTerms() {
		shipping.checkTermsOfServices();
		shipping.proceedToCheckoutShipping();
	}

	// escolher forma de pagamento
	public void payment() {
		payment.payByCheck();
	}
	// visualizar a ordem. 

	public void orderDetails() throws IOException {
		payment.saveOrderConfirmationDetailsToTextFile();
	}

	@Test
	public void sendOrder() throws IOException {
		searchProduct();
		addToCart();
		login();
		checkoutAddress();
		checkoutTerms();
		payment();
		orderDetails();

	}
}
