package org.weebing.ai.activation;

import org.junit.Test;

public class TanhTest {
	
	@Test
	public void testTanh() {
		Tanh tanh = new Tanh();
		double[] array = new double[] {
				1, 2, 3, 4, 5, 6,
				-1, -2, -3, -4, -5, -6
		};
		tanh.activate(array);
		
		for (double a : array) {
			System.out.println(a);
		}
	}
}
