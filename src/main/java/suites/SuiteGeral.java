package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.TestAccount;
import tests.TestAccountMovement;
import tests.TestFinancialMovement;
import tests.TestHome;
import tests.TestMonthlySummary;

@RunWith(Suite.class)
@SuiteClasses({
		TestAccount.class,
		
		
})
public class SuiteGeral {

}
