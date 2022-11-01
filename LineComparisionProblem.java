package assignment2;

import java.util.Scanner;

public class LineComparisionProblem {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coordinates of first point");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter Coordinates of Second point");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		float lengthofline=0;
		lengthofline=(float)Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("length of line is :"+lengthofline);
	}    
}
