package org.weebing.ai.activation;

public class Tanh implements Activate {

	public void activate(double[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			array[i] = (Math.exp(array[i]) - Math.exp(-array[i])) 
			    / (Math.exp(array[i]) + Math.exp(-array[i]));
		}
	}

}
