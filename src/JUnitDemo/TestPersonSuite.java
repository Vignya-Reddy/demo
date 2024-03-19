package JUnitDemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
		{
			TestPerson.class,TestCalculation.class,TestPersonFixture.class
		})

public class TestPersonSuite{
	@BeforeClass
	public static void setUpBeforeClass1() throws Exception{
		System.out.println("Now running the Test Suite");
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("Now running the Test Suite");
	}
}
