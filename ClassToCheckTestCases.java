package day12;

public class ClassToCheckTestCases <T extends Comparable<T>> {

	T returnValue;
	public T checkMaximum(T firstStiring, T secondString, T thirdString) {
		
		//Returns First Value if it is Maximum
		if(firstStiring.compareTo(secondString) > 0 && firstStiring.compareTo(thirdString) > 0) {
		
			returnValue = firstStiring;
		}
		//Returns Second Value if it is Maximum
		else if(secondString.compareTo(firstStiring) > 0 && secondString.compareTo(thirdString) > 0) {
			returnValue = secondString;
		}
		//Returns Third Value if it is Maximum
		else if(thirdString.compareTo(firstStiring) > 0 && thirdString.compareTo(secondString) > 0) {
			returnValue = thirdString;;
		}
		return returnValue;
	}
	
	
}
