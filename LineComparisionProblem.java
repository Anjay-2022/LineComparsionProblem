package assignment2;

import java.util.Scanner;
public class LineComparisionProblem {	
	public static  float length(int p1x,int p1y,int p2x,int p2y) {
		float lengthofline=(float)Math.sqrt(Math.pow((p2x-p1x),2)+Math.pow((p2y-p1y),2));
		return(lengthofline);	
	}
	public static void check(float l1,float l2) {
		if (l1 == l2) {
			System.out.println("Lines are equal");
		} else {
			System.out.println("Lines are unequal");
		}	
	}
	public static void main(String[] args) {
	  System.out.println("Welcome to Line Comparison Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Coordinates of line1 first point");
		int x11 = sc.nextInt();
		int y11 = sc.nextInt();
		System.out.println("Enter Coordinates of line1 Second point");
		int x21 = sc.nextInt();
		int y21 = sc.nextInt();
		float lengthofline1=length(x11,y11,x21,y21);
		System.out.println("length of line is :"+lengthofline1);
		System.out.println("Enter Coordinates of line2 first point");
		int x12 = sc.nextInt();
		int y12 = sc.nextInt();
		System.out.println("Enter Coordinates of line2  Second point");
		int x22 = sc.nextInt();
		int y22 = sc.nextInt();
		float lengthofline2=length(x12,y12,x22,y22);
		System.out.println("length of line is :"+lengthofline2);
		check(lengthofline1,lengthofline2);
	}
}
