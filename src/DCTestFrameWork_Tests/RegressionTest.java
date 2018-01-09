package DCTestFrameWork_Tests;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class RegressionTest extends BaseTest {
	@Test(groups = {"regression", "smoke"})
	public void f() throws InterruptedException {
	  driver.navigate().to("http://www.google.com");
	  Thread.sleep(5000);
	}
	@Test
	public void g() {
		System.out.println("do not test this");
	}
}
