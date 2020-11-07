package day12;

public class ClassToCheckTestCases <T extends Comparable<T>> {

	T max;
	public T checkMaximum(T[] genericList) {
		
		max = genericList[0];
		for(int i=1; i < genericList.length; i++) {
			if(genericList[i].compareTo(max) > 0) {
				max = genericList[i];
			}
		}
		return max;
	}
}