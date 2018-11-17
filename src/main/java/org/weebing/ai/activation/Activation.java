package org.weebing.ai.activation;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Activation {
	
	/**
	 * type: tanh, sigmoid, softmax, relu
	 * @param array
	 * @param type: 
	 */
	public static void activate(double[] array, String type) {
		if (type.equals("tanh")) {
			int n = array.length;
			for (int i = 0; i < n; i++) {
				array[i] = (Math.exp(array[i]) - Math.exp(-array[i])) 
				    / (Math.exp(array[i]) + Math.exp(-array[i]));
			}
		} else if (type.equals("sigmoid")) {
			int n = array.length;
			for (int i = 0; i < n; i++) {
				array[i] = 1 / (1 + Math.exp(-array[i]));
			}

		} else if (type.equals("softmax")) {
			int n = array.length;
			double expSum = 0;
			for (int i = 0; i < n; i++) expSum += Math.exp(array[i]);
			for (int i = 0; i < n; i++) array[i] = Math.exp(array[i]) / expSum;
		} else if (type.equals("relu")) {
			int n = array.length;
			for (int i = 0; i < n; i++) {
				if (array[i] <= 0) {
					array[i] = 0;
				}
			}
		}
	}
	
	public static void activate(double[] array, String type, Predicate<String> predicate, 
			BiConsumer<Double, Integer> consumer) {
		if (predicate.test(type)) {
			int n = array.length;
			for (int i = 0; i < n; i++) {
				consumer.accept(array[i], i);
			}
		}
	}
}
