package com.codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJ3Junit {

	TestJ3 testJ3 = null;
	int arraySize = 0;

	@Before
	public void initialize() throws Exception {
		testJ3 = new TestJ3();
	    arraySize = 1000;
	}

	@Test
	public void randomIntArray_size_check() {

	    int intArrayHolder[] = testJ3.randomIntArray(arraySize);

	    Assert.assertEquals(arraySize, intArrayHolder.length); //Point 1
	}

	@Test
	public void randomIntArray_main() throws Exception{

	    Set<Integer> intSet1 = testJ3.randomIntArray_duplicate_set(arraySize); //First List 
	    Set<Integer> intSet2 = testJ3.randomIntArray_duplicate_set(arraySize); // Second List point 4
	    
	    // if Set is Empty means no Duplicates
	    Assert.assertEquals(true, intSet1.isEmpty()); // Duplicate Check for List 1 Point 2
	    // comment above line to run complete test case
	    
	    // Printing First List of Duplicates
	    if (!intSet1.isEmpty())	 {   
	    	
		   System.out.println("Duplicates found");
		   Iterator setIter = intSet1.iterator();
		   while (setIter.hasNext()) {
			        System.out.println(setIter.next()); // point 3
			    }
		    }
	    Set<Integer> finalSet = new HashSet<Integer>();
	    finalSet.addAll(intSet1);
	    finalSet.addAll(intSet2);
	    List sortedList = new ArrayList(finalSet);
	    Collections.sort(sortedList);
	    
	    // prints intersection of the 2 arrays/lists (non-repetitive, ordered output)
	    if (!sortedList.isEmpty())	 {   
	    Iterator listIter = sortedList.iterator();
		    System.out.println("Combined List");
		    while (listIter.hasNext()) {
		        System.out.println(listIter.next()); // point 5
		    }
	    }
	}

	

	
	
}
