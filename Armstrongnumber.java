package week2.day3;

public class Armstrongnumber {

	public static void main(String[] args) {
		int number = 153, reminder, originalNumber, result = 0;
		originalNumber = number;
		while (originalNumber != 0) {
			reminder = originalNumber % 10;
			result = (int) (result + Math.pow(reminder, 3));
			originalNumber = originalNumber / 10;

		}
		if (result == number) {
			System.out.println(number + "is an Armstrong number");
		} else {
			System.out.println(number + " is not an Armstrong number");
		}

	}

}
