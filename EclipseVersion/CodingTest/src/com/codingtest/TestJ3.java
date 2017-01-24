package com.codingtest;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class TestJ3 {

	public static void main(String[] args) {
		

	}

	public int[] randomIntArray(int size) {

        Random random = new Random();
        int array[] = new int[size];
        // populate the array with values from 0 to 1000
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
           // System.out.println(array[i]);
        }
        
        return array;
    }
	
	public Set<Integer> randomIntArray_duplicate_set(int size)
	{
		int intArrayHolder[] = randomIntArray(size);
		
		Set<Integer> intSet = new HashSet<>();
		Set<Integer> dupSet = new HashSet<>();
		
		boolean isDuplicate = false;
		 for (int i = 0; i < intArrayHolder.length; i++) {

		        if (intSet.contains(intArrayHolder[i])) {
		        	isDuplicate=true;
		        	dupSet.add(intArrayHolder[i]);
		        }else{
		            intSet.add(intArrayHolder[i]);
		        }
		    }
		
		 return dupSet;
		 
	}
	
}
