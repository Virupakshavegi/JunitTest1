package JunitTestPackage2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {
	JunitFunctions t = new JunitFunctions();
	@Test
	public void test() {
		assertEquals( "Regular integer should work", t.AddNumbers(4,5),9);
	}

}
