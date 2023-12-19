package com.example.demo.impl;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AlgorithmsImpl {

	public static int isPrime(int n) {
		// return 1 if prime, return 0 otherwise
		if(n<2){
			return 0;
		}
		if(n==2){
			return 1;
		}
		if(n%2==0){
			return 0;
		}
		int i=3;
		while(i*i<=n){
			if(n%i==0) {return 0;}
			i+=2;
		}
		return 1;
	}
	
	public static String is_Palindrome(int a) {
		
		int t= a;
		int rev=0;
		while(t>0) {
			rev=10*rev+t%10;
			t=t/10;
		}// if palindrome, return "Yes", if not, return "No"
		String res= (a==rev)?"Yes":"No";
		return res;
	}
	
	public static int factorial(int n) {
		
		int res=1;
		while(n>0) {
			res*=n;
			n--;
		}
		return res;
	}
	
	public static int isPalindrome(String s) {
		
		StringBuilder str =new StringBuilder(s);
		int i= (s.equals(str.reverse().toString()))?1:0;
		return i;
	}
	
	public static int nthFibonacci(int a) {
		
		int f=0;
		int s=1;
		int n=0;
		if(a==1)
			return 0;
		if(a==2)
			return 1;
		while(a>2) {
			n=(f+s)%1000000007;
			f=s;
			s=n;
			a--;
		}
		return n;
	}
	
	public static List<Integer> series(int n){
		
		List<Integer> fib= new ArrayList<>();
		fib.add(0);
		if(n>1)
			fib.add(1);
		for(int i=2;i<=n;i++) {
			int a= fib.get(i-1)+fib.get(i-2);
			fib.add(a);
		}
		return fib;		
	}
	
//	public static int findDiff(int amount) {
//		
//		String a= Integer.toString(amount);
//		String b= a;
//		for(int i=0;i<b.length();i++) {
//			if(b.charAt(i)=='6') {
//				b.charAt(i)='9';
//			}
//		}
//	}
	public static int findDiff(Integer amount) {

		String actualAmount = amount.toString();
		if (actualAmount.contains("9")) {
			String modifiedAmount = actualAmount.replace("9", "6");
			Integer differnce = Integer.parseInt(modifiedAmount);
			Integer differnceAmmount = amount - differnce;
			return differnceAmmount;
		} else
			return 0;

	}

	public static int calculate_Area(int arr[][]) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= arr.length - 1; i++) { 
			list.add(arr[i][0] * arr[i][1]);
		}
		return Collections.max(list);
	}

	public static List<Integer> immediateSmaller(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				list.add(arr[i + 1]);
			} else
				list.add(-1);
		}
		return list;
	}

	public static int thirdLargest(List<Integer> list) {
		if (list.size() > 3) {
			Collections.sort(list);
			list.forEach(i -> System.out.println(i));
			return list.get(list.size() - 3);
		} else
			return -1;
	}

	public static String minAnd2ndMin(List<Integer> list) {
		Set<Integer> list2 = new HashSet<Integer>();

		list2 = list.stream().sorted().collect(Collectors.toSet());
		ArrayList<Integer> updatedList = new ArrayList<Integer>(list2);
		System.out.println(updatedList);

		if (list2.size() > 1) {
			return  updatedList.get(0)+" "+ updatedList.get(1);
		} else
			return "{-1,-1}";

	}

	public static int remAnagram(String str1, String str2) { 
		Set<Character> charList = new HashSet<Character>();

		for (char i : str1.toCharArray()) {
			charList.add(i);
		}
		for (char i : str2.toCharArray()) {
			charList.add(i);
		}

		System.out.println(charList);
		for (int j = 0; j < str2.length(); j++) {
			charList.remove(str2.charAt(j));
		}

		return  charList.size();

	}

	
	public static List<Integer> sieveOfEratosthenes(int prime) {// 13
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < prime; i++) {
			if (isPrime(i)==1) {
				list.add(i);
			}
		}
		return list;
	}

	public static boolean isSubsequence(String str1, String str2) { 
		int m = str1.length();
		int n = str2.length();
		int j = 0;
		for (int i = 0; i < n && j < m; i++) {
			if (str1.charAt(j) == str2.charAt(i)) {
				j++;
			}
		}
		return (j == m);
	}

	public static String firstAndLast(List<Integer> list, int number) { 

		if(list.contains(number))
			return + list.indexOf(number)+" " + list.lastIndexOf(number);
		else
			return "-1";
	}
	public static String merge(String str1, String str2) {

		String result = "";
		int j = 0;
		for (int i = 0; i < str1.length(); i++) {
			result = result + str1.charAt(i);

			if (j < str2.length()) {
				result = result + str2.charAt(j);
				j += 1;
			}
		}
		return result;
	}
	public static int isGoodorBad(String s) {
		 String regexConsonants = ".*[bcdfghjklmnpqrstvwxyz]{4,}.*";
		 String regexVowels=".*[aeiou]{6,}.*";
	  if(s.matches(regexConsonants)||s.matches(regexVowels)) {
		  return 1;
	  }else 
		  return 0;
	}
	
	public static boolean isFrequencyUnique(int arr[], int n){	 
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (freq.containsKey(arr[i])) {
				freq.put(arr[i], freq.get(arr[i]) + 1);
			} else {
				freq.put(arr[i], 1);
			}
		}
		HashSet<Integer> uniqueOccurrence = new HashSet<Integer>();
		for (Map.Entry<Integer, Integer> i : freq.entrySet()) {
			if (uniqueOccurrence.contains(i.getValue()))
				return false;
			else
				uniqueOccurrence.add(i.getValue());
		}
		return true;
	}
	
	public static void  stockBuySell(Integer []arr) {  
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> copyList=new ArrayList<Integer>();
		Map<Integer, Integer> hmap=new LinkedHashMap<>();
		int lowest=0;
		int highest=0;
		for(Integer i:arr) {
			list.add(i);
			copyList.add(i);
		}		
		do {
			 lowest=Collections.min(list);
			 highest=Collections.max(list);
			
		if(highest==lowest) {
			list.remove(list.indexOf(lowest));
		}else {
			list.remove(list.indexOf(lowest));
			list.remove(list.indexOf(highest));
			hmap.put(copyList.indexOf(lowest), copyList.indexOf(highest));
		}
			
		} while (lowest!=highest);
		System.out.println(hmap);
	}
	
	public static int addMinChar(String str) {
		int n = str.length();
        int count = 0;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                count++;
            }
        }
        return count;
	}
	
	public static int missingNumber(Integer []arr, int n) {
		int expectedSum = (n * (n + 1)) / 2;
	    int actualSum = 0;
	        for (int num : arr) {
	            actualSum += num;
	        }
	        return expectedSum - actualSum;
	}
	
	public static int kthSmallest(List<Integer> list, int element) {
		
		Collections.sort(list);
		return (list.get(element-1));
	}
	
	public static int equilibriumPoint(int arr[], int n) { 
		   if (n < 2) {
	            return 1;
	        }
		   int totalSum = 0;
	        for (int i = 0; i < n; i++) {
	            totalSum += arr[i];
	        }

	        int leftSum = 0;
	        for (int i = 0; i < n; i++) {
	            totalSum -= arr[i];

	            if (leftSum == totalSum) {
	                return i + 1;
	            }

	            leftSum += arr[i];
	        }
	        return -1;
	    }
	
	public static int print2largest(List<Integer> list) {
		Set<Integer> setList= list.stream().sorted().collect(Collectors.toSet());
		if(setList.size()<1) {
			return -1;
		}else {
			List<Integer> result=setList.stream().sorted().collect(Collectors.toList());
			return (result.get(result.size()-2));
		}
		
	}
	
	public static int getPairsCount(Integer []arr,int n, int sum) {
		 HashMap<Integer, Integer> elementCount = new HashMap<>();
		 int count = 0;
		 for (int i = 0; i < n; i++) {
	           int complement = sum - arr[i];
	           if (elementCount.containsKey(complement)) {
	                count += elementCount.get(complement);
	            }
	           elementCount.put(arr[i], elementCount.getOrDefault(arr[i], 0) + 1);
	        }

	        return count;
	    
	}
	
	public static int maxProduct(Integer []arr) {
		List<Integer> list=new ArrayList<Integer>();
		for(Integer i:arr) {
			list.add(i);
		}
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		int product=list.get(0);   //[4, 3, 1, 0]
		for(int j=1;j<list.size();j++) {
			if(list.get(j)!=0) {
				product*=list.get(j);
			}
		}
		if(product<0) {
			return Math.abs(product);
		}
		else 
			return product;
	}
}

