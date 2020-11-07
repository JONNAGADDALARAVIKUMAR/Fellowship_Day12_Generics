package day12;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class GenericsTestCasesClass {
	
	ClassToCheckTestCases classTcoCheck = new ClassToCheckTestCases();

	@Test
	public void firstMaxValueTestCase() { //Test Case for First Max Value
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(14);
		intArray.add(36);
		intArray.add(43);
		int result =  classTcoCheck.checkMaximum(intArray);
		Assert.assertNotEquals(14, result);
	}
	@Test
	public void firstMaxValueActual() { //Actual Implementation for First Max Value
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(55);
		intArray.add(36);
		intArray.add(43);
		int result =  classTcoCheck.checkMaximum(intArray);
		Assert.assertEquals(55, result);
	}
	@Test
	public void secondMaxValueTestCase() { //Test Case for Second Max Value
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(14);
		intArray.add(36);
		intArray.add(43);
		int result =  classTcoCheck.checkMaximum(intArray);
		Assert.assertNotEquals(36, result);
	}
	@Test
	public void secondMaxValueActual() { //Actual Implementation for Second Max Value
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(55);
		intArray.add(76);
		intArray.add(43);
		int result =  classTcoCheck.checkMaximum(intArray);
		Assert.assertEquals(76, result);
	}
	@Test
	public void thirdMaxValueTestCase() { //Test Case for Third Max Value
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(14);
		intArray.add(36);
		intArray.add(13);
		int result =  classTcoCheck.checkMaximum(intArray);
		Assert.assertNotEquals(13, result);
	}
	@Test
	public void thirdMaxValueActual() { //Actual Implementation for Third Max Value
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(55);
		intArray.add(36);
		intArray.add(83);
		int result =  classTcoCheck.checkMaximum(intArray);
		Assert.assertEquals(83, result);
	}
}
