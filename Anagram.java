package week2.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String text1 = "the eyes";
		String text2 ="they see";
		int a1= text1.length();
		int a2 =text2.length();
		char b1[]=text1.toCharArray();
		char b2[]= text2.toCharArray();
		
		
		
		if(a1==a2) {
			
			Arrays.sort(b2);
			Arrays.sort(b1);
			System.out.println("it is equal");
			boolean check;
			check=Arrays.equals(b1,b2);
			if(check) {
				System.out.println("it is anagram");
			}
			
			else {
				System.out.println("not an anagram");
			}
			
		}
	}

}
