package day12;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class GenericsTestCasesClass {
	
	ClassToCheckTestCases classTcoCheck = new ClassToCheckTestCases();

	@Test
	public void firstIntMaxValueTestCase() { //Test Case for First Max Value
		
		Integer[] genericArray = {29,34,76};
		Comparable result =  classTcoCheck.checkMaximum(genericArray);
		classTcoCheck.printMax(genericArray, "firstIntMaxValueTestCase()");
		Assert.assertNotEquals(29, result);
	}
	@Test
	public void firstIntMaxValueActual() { //Actual Implementation for First Max Value
		
		Integer[] genericArray = {89,78,34};
		Comparable result =  classTcoCheck.checkMaximum(genericArray);
		classTcoCheck.printMax(genericArray, "firstIntMaxValueActual()");
		Assert.assertEquals(89, result);
	}
	@Test
	public void secondIntMaxValueTestCase() { //Test Case for Second Max Value
		
		Integer[] genericArray = {24,8,18};
		Comparable result =  classTcoCheck.checkMaximum(genericArray);
		classTcoCheck.printMax(genericArray, "secondIntMaxValueTestCase()");
		Assert.assertNotEquals(8, result);
	}
	@Test
	public void secondIntMaxValueActual() { //Actual Implementation for Second Max Value
		
		Integer[] genericArray = {24,38,18};
		Comparable result =  classTcoCheck.checkMaximum(genericArray);
		classTcoCheck.printMax(genericArray, "secondIntMaxValueActual()");
		Assert.assertEquals(38, result);
	}
	@Test
	public void thirdIntMaxValueTestCase() { //Test Case for Third Max Value
		
		Integer[] genericArray = {43,34,10};
		Comparable result =  classTcoCheck.checkMaximum(genericArray);
		classTcoCheck.printMax(genericArray, "thirdIntMaxValueTestCase()");
		Assert.assertNotEquals(10, result);
	}
	@Test
	public void thirdIntMaxValueActual() { //Actual Implementation for Third Max Value
		
		Integer[] genericArray = {23,20,43};
		Comparable result =  classTcoCheck.checkMaximum(genericArray);
		classTcoCheck.printMax(genericArray, "thirdIntMaxValueActual()");
		Assert.assertEquals(43, result);
	}
}
