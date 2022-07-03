/**
 * 
 */
package com.trungcu.test.testci;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Admin
 *
 */
public class TestCI {

	@Test
	public void test() {
		assertEquals(5, com.trungcu.core.testci.Test.returnYourself(5));
	}

}
