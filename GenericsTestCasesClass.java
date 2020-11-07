package day12;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class GenericsTestCasesClass {
	
	ClassToCheckTestCases classTcoCheck = new ClassToCheckTestCases();

	@Test
	public void firstMaxValueTestCase() { //Test Case for First Max Value
		
		ArrayList<Float> floatArray = new ArrayList<>();
		floatArray.add((float) 14.3);
		floatArray.add((float) 36.5);
		floatArray.add((float) 43.9);
		float result =  classTcoCheck.checkMaximum(floatArray);
		Assert.assertNotEquals(14.3, result);
	}
	@Test
	public void firstMaxValueActual() { //Actual Implementation for First Max Value
		
		ArrayList<Float> floatArray = new ArrayList<>();
		floatArray.add((float) 55.3);
		floatArray.add((float) 36.5);
		floatArray.add((float) 43.9);
		float result =  classTcoCheck.checkMaximum(floatArray);
		Assert.assertEquals(55.3, result, 0.01);
	}
	@Test
	public void secondMaxValueTestCase() { //Test Case for Second Max Value
		
		ArrayList<Float> floatArray = new ArrayList<>();
		floatArray.add((float) 14.3);
		floatArray.add((float) 36.5);
		floatArray.add((float) 43.9);
		float result =  classTcoCheck.checkMaximum(floatArray);
		Assert.assertNotEquals(36.5, result);
	}
	@Test
	public void secondMaxValueActual() { //Actual Implementation for Second Max Value
		
		ArrayList<Float> floatArray = new ArrayList<>();
		floatArray.add((float) 15.3);
		floatArray.add((float) 56.5);
		floatArray.add((float) 43.9);
		float result =  classTcoCheck.checkMaximum(floatArray);
		Assert.assertEquals(56.5, result, 0.01);
	}
	@Test
	public void thirdMaxValueTestCase() { //Test Case for Third Max Value
		
		ArrayList<Float> floatArray = new ArrayList<>();
		floatArray.add((float) 14.3);
		floatArray.add((float) 36.5);
		floatArray.add((float) 12.9);
		float result =  classTcoCheck.checkMaximum(floatArray);
		Assert.assertNotEquals(12.9, result);
	}
	@Test
	public void thirdMaxValueActual() { //Actual Implementation for Third Max Value
		
		ArrayList<Float> floatArray = new ArrayList<>();
		floatArray.add((float) 15.3);
		floatArray.add((float) 46.5);
		floatArray.add((float) 49.9);
		float result =  classTcoCheck.checkMaximum(floatArray);
		Assert.assertEquals(49.9, result, 0.01);
	}
}
