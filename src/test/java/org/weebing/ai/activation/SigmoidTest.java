package org.weebing.ai.activation;

import org.junit.Test;

public class SigmoidTest {
	
	@Test
	public void testTanh() {
		Sigmoid sigmoid = new Sigmoid();
		double[] array = new double[] {
				1, 2, 3, 4, 5, 6,
				-1, -2, -3, -4, -5, -6
		};
		sigmoid.activate(array);
		
		for (double a : array) {
			System.out.println(a);
		}
	}
}
