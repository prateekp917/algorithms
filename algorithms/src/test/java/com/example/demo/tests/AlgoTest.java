package com.example.demo.tests;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.AlgorithmController;
import com.example.demo.impl.AlgorithmsImpl;

@SpringBootTest
public class AlgoTest {
	
	@Mock
	AlgorithmController controller;

	List<Integer> listforFib=Arrays.asList(0, 1, 1 ,2 ,3 ,5 ,8 ,13, 21, 34);

	List<Integer> listForMinAndSecondMin=Arrays.asList(8,3,5,7,1,-1,6,2,7,8,1,2);

	List<Integer> listFirstAndLast=Arrays.asList(1,3,6,3,3,7,8,3);	

	int[][] numbers = { {2, 3}, {9, 8}, {6, 4},{6,20} };

	@Test
	public void checkPrimeTest() {
		when(controller.checkPrimeNo(3)).thenReturn(1);
	}

	@Test
	public void isPalindromeOrNotTest() {
		when(controller.isPalindrome("abcba")).thenReturn(1);
	}

	@Test
	public void isPalindromeNumberTest() {
		when(controller.is_Palindrome(1234)).thenReturn("No");
		assertEquals("No", AlgorithmsImpl.is_Palindrome(1234));
	}

	@Test
	public void factorialTest() {
		when(controller.factorial(4)).thenReturn(24);
		assertEquals(24, AlgorithmsImpl.factorial(4));
	}

	@Test
	public void FibonacciTest() {
		when(controller.getFibonacci(4)).thenReturn(4);
		assertEquals(3, AlgorithmsImpl.nthFibonacci(4));
	}

	@Test
	public void FibonacciUptoIndexTest() {
		assertEquals(listforFib, AlgorithmsImpl.series(7));
	}

	@Test
	public void findDiffTest() {
		when(controller.findDiff(49)).thenReturn(3);
		assertEquals(30, AlgorithmsImpl.findDiff(396));
	}

	@Test
	public void thirdLargest() {
		when(controller.thirdLargest(listforFib)).thenReturn(13);
		assertEquals(13, AlgorithmsImpl.thirdLargest(listforFib));
	}

	@Test
	public void calculateAreaTest() {
		when(controller.calculate_Area(numbers)).thenReturn(12);
		assertEquals(120, AlgorithmsImpl.calculate_Area(numbers));
	}

	@Test
	public void minAnd2ndMinTest() {
		when(controller.minAndSecondMin(listforFib)).thenReturn("No more elemets");
		assertEquals("The min=-1 and the second min=1", AlgorithmsImpl.minAnd2ndMin(listForMinAndSecondMin));
	}

	@Test
	public void remAnagramTest() {	
		when(controller.remAnagram("eats","tea")).thenReturn(1);
		assertEquals(1, AlgorithmsImpl.remAnagram("eats","tea"));		
	}

	@Test
	public void firstAndLastTest() {
		when(controller.firstAndLast(listFirstAndLast,3)).thenReturn("1 7");
		assertEquals("1 7", AlgorithmsImpl.firstAndLast(listFirstAndLast,3));
	}
	
	
}

