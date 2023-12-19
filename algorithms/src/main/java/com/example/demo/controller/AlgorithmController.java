package com.example.demo.controller;

import java.util.List;

import com.example.demo.impl.AlgorithmsImpl;

public class AlgorithmController {

	public int checkPrimeNo(int x) {
		return AlgorithmsImpl.isPrime(x);
	}

	public String is_Palindrome(int number) {
		return AlgorithmsImpl.is_Palindrome(number);
	}
	public int factorial(int a) {
		return AlgorithmsImpl.factorial(a);
	}

	public int isPalindrome(String str) {
		return AlgorithmsImpl.isPalindrome(str);
	}


	public int getFibonacci(int index) {
		return AlgorithmsImpl.nthFibonacci(index);
	}

	public List<Integer> getFibonacciUptoIndex(int index) {
		return AlgorithmsImpl.series(index);
	}

	public int findDiff(int amount) {
		return AlgorithmsImpl.findDiff(amount);
	}

	public int calculate_Area(int arr[][]) {
		return AlgorithmsImpl.calculate_Area(arr);
	}
	
	public List<Integer> immediateSmaller(int[] list){
		return AlgorithmsImpl.immediateSmaller(list);
	}

	public int thirdLargest(List<Integer> list) {
		return AlgorithmsImpl.thirdLargest(list);
	}


	public String minAndSecondMin(List<Integer> list) {
		return AlgorithmsImpl.minAnd2ndMin(list);
	}
    
	public int remAnagram(String str1, String str2) {
		return AlgorithmsImpl.remAnagram(str1, str2);
	}

	public List<Integer> sieveOfEratosthenes(int prime) {
		return AlgorithmsImpl.sieveOfEratosthenes(prime);
	}
	
	public boolean isSubsequence(String str1, String str2) {
		return isSubsequence(str1, str2);
	}

	public String firstAndLast(List<Integer> list,int number) {
		return AlgorithmsImpl.firstAndLast(list, number);
	}
	
	public String merge(String str1, String str2) {
		return AlgorithmsImpl.merge(str1, str2);
	}
	
	public int isGoodorBad(String str) {
		return AlgorithmsImpl.isGoodorBad(str);
	}
	
	public void  stockBuySell(Integer []arr) {
		AlgorithmsImpl.stockBuySell(arr);
	}
	public int addMinChar(String str) {
		return AlgorithmsImpl.addMinChar(str);
	}
	public int missingNumber(Integer []arr, int n) {
		return AlgorithmsImpl.missingNumber(arr, n);
	}
	public int kthSmallest(List<Integer> list,Integer element) {
		return AlgorithmsImpl.kthSmallest(list, element);
	}
	public int equilibriumPoint(int Arr[], int n) {
		return AlgorithmsImpl.equilibriumPoint(Arr,n);
	}
	public int print2largest(List<Integer> list) {
		return AlgorithmsImpl.print2largest(list);
	}
	public int getPairsCount(Integer []arr,int num, int sum) {
		return AlgorithmsImpl.getPairsCount(arr,num, sum);
	}
	public int  maxProduct(Integer []arr) {
		return AlgorithmsImpl.maxProduct(arr);
	}
}
