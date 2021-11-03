import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {

	@Test
	void findPrimeOrNotTest() {
		assertEquals((PrimeNumber.findPrimeOrNot(0)),false);
		assertEquals((PrimeNumber.findPrimeOrNot(1)),false);
		assertEquals((PrimeNumber.findPrimeOrNot(6)),false);
		assertEquals((PrimeNumber.findPrimeOrNot(7)),true);
		assertEquals((PrimeNumber.findPrimeOrNot(9)),false);
		assertEquals((PrimeNumber.findPrimeOrNot(121)),false);
	}
}
