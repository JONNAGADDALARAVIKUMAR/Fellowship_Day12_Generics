package day12;

import org.junit.Assert;
import org.junit.Test;

public class GenericsTestCasesClass<E> {
	
	ClassToCheckTestCases classTcoCheck = new ClassToCheckTestCases();

	@Test
	public void firstMaxValueTestCase() { //Test Case for First Max Value
		
		Comparable result =  classTcoCheck.checkMaximum("Apple","Banana","PineApple");
		Assert.assertNotEquals("Apple", result);
	}
	@Test
	public void firstMaxValueActual() { //Actual Implementation for First Max Value
		
		Comparable result =  classTcoCheck.checkMaximum("PineApple","Banana","Apple");
		Assert.assertEquals("PineApple", result);
	}
	@Test
	public void secondMaxValueTestCase() { //Test Case for Second Max Value
		
		Comparable result =  classTcoCheck.checkMaximum("Apple","Banana","PineApple");
		Assert.assertNotEquals("Banana", result);
	}
	@Test
	public void secondMaxValueActual() { //Actual Implementation for Second Max Value
		
		Comparable result =  classTcoCheck.checkMaximum("Banana","PineApple","Apple");
		Assert.assertEquals("PineApple", result);
	}
	@Test
	public void thirdMaxValueTestCase() { //Test Case for Third Max Value
		
		Comparable result =  classTcoCheck.checkMaximum("Apple","PineApple","Banana");
		Assert.assertNotEquals("Banana", result);
	}
	@Test
	public void thirdMaxValueActual() { //Actual Implementation for Third Max Value
		
		Comparable result =  classTcoCheck.checkMaximum("Apple","Banana","PineApple");
		Assert.assertEquals("PineApple", result);
	}
	@Test
	public void firstIntMaxValueTestCase() { //Test Case for First Max Value
		
		Comparable result =  classTcoCheck.checkMaximum(29,34,76);
		Assert.assertNotEquals(29, result);
	}
	@Test
	public void firstIntMaxValueActual() { //Actual Implementation for First Max Value
		
		Comparable result =  classTcoCheck.checkMaximum(89,78,34);
		Assert.assertEquals(89, result);
	}
	@Test
	public void secondIntMaxValueTestCase() { //Test Case for Second Max Value
		
		Comparable result =  classTcoCheck.checkMaximum(24,8,18);
		Assert.assertNotEquals(8, result);
	}
	@Test
	public void secondIntMaxValueActual() { //Actual Implementation for Second Max Value
		
		Comparable result =  classTcoCheck.checkMaximum(24,38,18);
		Assert.assertEquals(38, result);
	}
	@Test
	public void thirdIntMaxValueTestCase() { //Test Case for Third Max Value
		
		Comparable result =  classTcoCheck.checkMaximum(43,34,10);
		Assert.assertNotEquals(10, result);
	}
	@Test
	public void thirdIntMaxValueActual() { //Actual Implementation for Third Max Value
		
		Comparable result =  classTcoCheck.checkMaximum(23,20,43);
		Assert.assertEquals(43, result);
	}
}
