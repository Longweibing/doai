package org.weebing.ai.activation;

public class ReLU implements Activate {

	public void activate(double[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] <= 0) {
				array[i] = 0;
			}
		}	
	}

}
