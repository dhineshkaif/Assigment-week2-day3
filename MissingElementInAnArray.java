package week2.day3;

import java.util.Arrays;

public class MissingElementInAnArray {
	


	public static void main(String[] args) {
		int[] ar = {1,2,3,4,6,7,8};
		Arrays.sort(ar);
		for (int i = 0; i < ar.length; i++) {
          int index = i + 1;
          if (ar[i] != index) {
        	  System.out.println(index);
        	  break;
          	}
	      
	    }
	}
}

	    

