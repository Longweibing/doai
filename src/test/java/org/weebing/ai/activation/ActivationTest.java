package org.weebing.ai.activation;

import org.junit.Test;

public class ActivationTest {
	@Test
	public void testActivation() {
		double[] array = new double[] {
				1.1, 5.6, 0.54, -10, -0.02
		};
		Activation.activate(array , "sigmoid");
		
		for (double d : array) {
			System.out.println(d);
		}
		
		System.out.println();
		
		String type = "plus2";
		
		// 扩展了激活函数
		Activation.activate(array, type, t -> t.equals(type), (a, i) -> array[i] = a + 2);
		
		for (double d : array) {
			System.out.println(d);
		}
	}
}
