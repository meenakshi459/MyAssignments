package week1.day2;

public class JS_Break { // Jump Statement

	public static void main(String[] args) {
		// print numbers from 1 to 10 when i value = 3 then print numbers in word
		// and stop the iteration

		for (int i = 1; i <= 10; i++) {

			if (i == 3) {
				System.out.println("Three");
				break;
			}

			System.out.println(i);

			// if loop continues then it will print 1 2 three 4 5 6 7 8 9 10
			// to stop after Three, then we need to put break .

		}

	}

}
