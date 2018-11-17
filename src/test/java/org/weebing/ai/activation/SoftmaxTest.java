package org.weebing.ai.activation;

import org.junit.Test;

public class SoftmaxTest {
	
	@Test
	public void testSoftmax() {
		Softmax softmax = new Softmax();
		double[] array = new double[] {
				1, 2, 3, 4, 5, 6,
				-1, -2, -3, -4, -5, -6
		};
		softmax.activate(array);
		
		double sum = 0;
		for (double a : array) {
			System.out.println(a);
			sum += a;
		}
		System.out.println("sum (1 is true): " + sum);
	}
}
