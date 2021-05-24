package programmingUsingJava.SortTheList;

import java.util.Scanner;

public class Source {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		while(true) {
			try {
				System.out.print("Enter a number (0 to Stop): ");
				double n = scanner.nextDouble();
				if(n == 0)
					break;
				sum += n;
			} catch (Exception e) {
				System.out.println("Invalid Input");
			}
		}
		
		System.out.println(sum);
	}

}
