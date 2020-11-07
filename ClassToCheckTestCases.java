package day12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class ClassToCheckTestCases {

	public Float checkMaximum(ArrayList<Float> floatArray) { //Returns Max Value
		
		Optional<Float> result = floatArray.stream() //Java Stream to Get Max Value
				.max(Comparator.comparing(Float::floatValue));
		return result.get();
	}
	
	
}
