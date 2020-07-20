package lab2.problem3;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem3Test {
	
	Problem3 obj ;

	@BeforeEach
	void setUp() throws Exception {
		obj = new Problem3();
	}

	@AfterEach
	void tearDown() throws Exception {
		obj = null;
	}

	@Test
	void test1() {
		int[] arr1 = { 1, 4, 5, 8, 17, 89 };
		int[] arr2 = { 2, 4, 8, 11, 13, 21, 23, 25 };
		int [] exp = {1, 2, 4, 4, 5, 8, 8, 11, 13, 17, 21, 23, 25, 89};
		Assert.assertArrayEquals(exp, obj.merge(arr1, arr2));
		
	}

}
