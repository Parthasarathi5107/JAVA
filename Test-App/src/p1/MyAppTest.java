package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MyAppTest {

	@Test
	void testDoAdd() {
		MyApp obj = new MyApp();
		int actual = obj.doAdd(1, 1);
		assertEquals(2,actual);
	}

	@Test
	void testDoSub() {
		MyApp obj = new MyApp();
		int actual = obj.doSub(4, 2);
		assertEquals(2,actual);
	}

	@Test
	void testDoMul() {
		MyApp obj = new MyApp();
		int actual = obj.doMul(1, 1);
		assertEquals(1,actual);
	}

	@Test
	void testDoDiv() {
		MyApp obj = new MyApp();
		int actual = obj.doDiv(8, 2);
		assertEquals(4,actual);
	}

}
