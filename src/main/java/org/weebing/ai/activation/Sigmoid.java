package org.weebing.ai.activation;

public class Sigmoid implements Activate {

	public void activate(double[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			array[i] = 1 / (1 + Math.exp(-array[i]));
		}

	}

}
