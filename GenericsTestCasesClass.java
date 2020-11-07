package day12;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class GenericsTestCasesClass {
	
	ClassToCheckTestCases classTcoCheck = new ClassToCheckTestCases();

	@Test
	public void firstMaxValueTestCase() { //Test Case for First Max Value
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("Apple");
		stringArray.add("Banana");
		stringArray.add("PineApple");
		String result =  classTcoCheck.checkMaximum(stringArray);
		Assert.assertNotEquals("Apple", result);
	}
	@Test
	public void firstMaxValueActual() { //Actual Implementation for First Max Value
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("PineApple");
		stringArray.add("Banana");
		stringArray.add("Apple");
		String result =  classTcoCheck.checkMaximum(stringArray);
		Assert.assertEquals("PineApple", result);
	}
	@Test
	public void secondMaxValueTestCase() { //Test Case for Second Max Value
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("Apple");
		stringArray.add("Banana");
		stringArray.add("PineApple");
		String result =  classTcoCheck.checkMaximum(stringArray);
		Assert.assertNotEquals("Banana", result);
	}
	@Test
	public void secondMaxValueActual() { //Actual Implementation for Second Max Value
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("Apple");
		stringArray.add("PineApple");
		stringArray.add("Banana");
		String result =  classTcoCheck.checkMaximum(stringArray);
		Assert.assertEquals("PineApple", result);
	}
	@Test
	public void thirdMaxValueTestCase() { //Test Case for Third Max Value
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("PineApple");
		stringArray.add("Banana");
		stringArray.add("Apple");
		String result =  classTcoCheck.checkMaximum(stringArray);
		Assert.assertNotEquals("Apple", result);
	}
	@Test
	public void thirdMaxValueActual() { //Actual Implementation for Third Max Value
		
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("Apple");
		stringArray.add("Banana");
		stringArray.add("PineApple");
		String result =  classTcoCheck.checkMaximum(stringArray);
		Assert.assertEquals("PineApple", result);
	}
}
