package week2.day3;

//public class PrintDuplicatesInArray {
//	public static void main(String[] args) {
//		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
//		int c = (int) arr.length;
//		int count;
//		for (int i = 0; i < arr.length - 1; i++) {
//			count = 0;
//			for (int j = 0; j < arr.length + 1; j++) {
//
//				if (arr[i] == arr[j]) {
//					count++;
//					
//
//				}
//
//				if (count >0);
//					
//				System.out.println(arr[i]);
//		
//			}
public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int c = (int) arr.length;
		int count;
		for (int i = 0; i < arr.length -1; i++) {
			count = 0;
			for (int j = 0; j < arr.length +1 ; j++) {

				if (arr[i] == arr[j]) {
					count++;
					}

				if (count >0);
				
					
				System.out.println(arr[i]);
		
			}

		}
	}
}
