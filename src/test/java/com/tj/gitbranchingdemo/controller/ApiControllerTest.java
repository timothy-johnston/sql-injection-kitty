package com.tj.gitbranchingdemo.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiControllerTest {
	
	apiController testController;
	
	@Before
	public void setup () {
		testController = new apiController();
	}

	@Test
	public void performAdditionProducesCorrectSumOfTwoValidInputs() {

		int input1 = 4;
		int input2 = 6;
		int expectedSum = input1 + input2;
		
		int returnedSum = testController.performAddition(input1, input2);
		
		assertEquals("Incorrect sum", expectedSum, returnedSum);
		
	}
	
	@Test
	public void performMultiplicationProducesCorrectProductOfTwoValidInputs() {

		int input1 = 4;
		int input2 = 6;
		int expectedProduct = input1 * input2;
		
		int returnedProduct = testController.performMultiplication(input1, input2);
		
		assertEquals("Incorrect sum", expectedProduct, returnedProduct);
		
	}

}
