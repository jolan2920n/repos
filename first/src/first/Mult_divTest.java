package first;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Mult_divTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
@Test
void Mult_test() {
	Mult_div m1=new Mult_div();
	int expected=8;
	int actual=m1.mult(2,2,2);
	assertEquals(expected, actual);   
}
@Test

void divide_test() {
	Mult_div m1=new Mult_div();
	int expected=5;
	int actual=m1.divide(10, 2);
	assertEquals(expected, actual);
}
}
