package JUnitDemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
 
import org.junit.*;
import org.junit.jupiter.api.Test;
 
public class TestPersonFixture {
	@BeforeClass
	public static void setBeforeAllTests() {
		System.out.println("One time initialization code before all tests");
	}
	@AfterClass
	public static void doAfterAllTests() {
		System.out.println("One time cleanup code after all tests");
	}
	@Before
	public void setBeforeTests() {
		System.out.println("Here is the initialization code");
	}
	@After
	public void doAfterTests() {
		System.out.println("Here is the cleanup code");
	}
	@Test
	public void GetFullName() {
		System.out.println("From Testperson");
		Person per=new Person("Robert","King");
		assertEquals("Robert King",per.getFullName());
	}
	@Test
	public void NullsInName() {
		System.out.println("From Testperson");
		Person per1=new Person("Robert","King");
		assertNotNull("Full name null",per1.getFullName());
		assertNotNull("First name null",per1.getFirstName());
		Person per2=new Person("Robert","King");
		assertEquals("Robert King",per2.getFullName());
	}
	@Test
	public void GetFirstName() {
		Person p=new Person("Robert","King");
		assertEquals(p.getFirstName(),"Robert");
	}
	@Test
	public void GetLastName() {
		Person p=new Person("Robert","King");
		assertEquals(p.getLastName(),"King");
	}
 
}
