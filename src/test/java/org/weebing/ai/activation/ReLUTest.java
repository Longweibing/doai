package org.weebing.ai.activation;

import org.junit.Test;

public class ReLUTest {
	
	@Test
	public void testTanh() {
		ReLU relu = new ReLU();
		double[] array = new double[] {
				1, 2, 3, 4, 5, 6,
				-1, -2, -3, -4, -5, -6
		};
		relu.activate(array);
		
		for (double a : array) {
			System.out.println(a);
		}
		
	}
}
