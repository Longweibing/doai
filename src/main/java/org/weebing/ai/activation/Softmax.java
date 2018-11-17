package org.weebing.ai.activation;

public class Softmax implements Activate {

	public void activate(double[] array) {
		int n = array.length;
		double expSum = 0;
		for (int i = 0; i < n; i++) expSum += Math.exp(array[i]);
		for (int i = 0; i < n; i++) array[i] = Math.exp(array[i]) / expSum;
	}

}
