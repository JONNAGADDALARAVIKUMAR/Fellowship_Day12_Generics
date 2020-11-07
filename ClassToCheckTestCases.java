package day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class ClassToCheckTestCases {

	public String checkMaximum(ArrayList<String> stringArray) { //Returns Max Value
		
		Optional<String> result = stringArray.stream() //Java Stream to Get Max Value
				.max(Comparator.comparing(String::length));
		return result.get();
	}
	
	
}
