package day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class ClassToCheckTestCases {

	public int checkMaximum(ArrayList<Integer> intArray) { //Returns Max Value
		
		Optional<Integer> result = intArray.stream() //Java Stream to Get Max Value
				.max(Comparator.comparing(Integer::intValue));
		return result.get();
	}
	
	
}
