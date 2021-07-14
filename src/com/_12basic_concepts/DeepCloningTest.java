package com._12basic_concepts;

import java.util.Arrays;

public class DeepCloningTest {
	
	public static void main(String[] args) {
        int[] vals = {3, 7, 9};
        Ex2 e = new Ex2(vals);
        e.showData(); // prints out [3, 7, 9]
        vals[0] = 13;
        e.showData(); // prints out [13, 7, 9]
  
        // Very confusing, because we didn't
        // intentionally change anything about 
        // the object e refers to.
    }

}
//Code explaining deep copy
  class Ex2 {
	
	private int[] data;

	// altered to make a deep copy of values
	public Ex2(int[] values) {
		data = new int[values.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = values[i];
		}
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
