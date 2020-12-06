package session1;

import java.util.*;

public class ClassWork {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		String[] arr = {"hi","abc","hello","Abc","fgh"};
		
		System.out.println(arr[5]);
		
		System.out.println(Arrays.toString(upperCasedFirstIndex(arr)));
		
		List<String> list = new ArrayList<String>();
		
		list = getElementsWithoutA(arr);
				
				
		for(int i=0;i<list.size();i++){
		    System.out.println(list.get(i));
		} 

	}
	
	//Return an array where each element of this array has been converted to uppercase
	// [abc, hello, hi] -> [Abc, Hello, Hi]
	//if the array is empty, just return the argument array itself	
		public static String[] upperCasedFirstIndex (String[] arr) {
			
			if (arr.length == 0) {
				return arr;
			}else {
			
				String[] newArray = new String[arr.length];
				
				for(int i = 0; i< arr.length; i++) {
					
					String first = ""+ arr[i].charAt(0);
					System.out.println(first);
					newArray[i] = first.toUpperCase();
					
				}
				
				
				
				return newArray;
			}
		}
	//given a String array, return a list where String elements containing 'A' or 'a' have been excluded
	// [Hi, hello, Abc, cat] -> [Hi, hello]
		public static List<String> getElementsWithoutA(String[] arr){
			//if the method signature returns an interface type, 
			//that means you can return any class type that implements that interface
			
			
			List<String> newList = new ArrayList<String>();
			
			for (int i = 0; i < arr.length; i++) {
				//arr[i] = arr[i].toLowerCase();
				if(!arr[i].contains("a") && !arr[i].contains("A")) {
					newList.add(arr[i]);
				}
				
				
			}
			
			
			
			
			return newList;
		}

}
