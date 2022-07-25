package com.dsa.lab3.ques1;
import java.util.Scanner;

public class DriveBalancedBracket {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//String expression = "([[{}]])"; this uses for input is hard-code
		System.out.println("Enter the String");
		String expression;
		//we take value from user
		expression=sc.next();
		boolean isBalanced=BalanceBracket.checkBalanceBracket(expression);
		//boolean isBlanced=BalancingBracket.checkBalancingBrackets(bracketExpression);
		if (isBalanced) {
			System.out.println("Input is "+expression);
			System.out.print("The entered String has Balanced Brackets");
		} else {
			System.out.println("Input is "+expression);
			System.out.println("The entered String do not contain Balanced Brackets");
		}
		sc.close();

	}


	

}
