package JunitTestPackage2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {
	JunitFunctions t = new JunitFunctions();
	@Test
	public void test() {
		assertEquals( "Regular string addition should work", t.AddStrings("a","b"),"ab");
	}

}