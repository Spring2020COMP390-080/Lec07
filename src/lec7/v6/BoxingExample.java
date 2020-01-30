package lec7.v6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxingExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		List<Integer> alist = new ArrayList<Integer>();
		
		while (s.hasNextInt()) {
			alist.add(s.nextInt());
		}
		
		int sum = 0;
		for (int i=0; i < alist.size(); i++) {
			sum += alist.get(i);
		}
		
		System.out.println("The sum of the list is: " + sum);
	}
}
