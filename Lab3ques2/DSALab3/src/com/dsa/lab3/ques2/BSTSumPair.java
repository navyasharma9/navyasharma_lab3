package com.dsa.lab3.ques2;
import java.util.Scanner;
import com.dsa.lab3.ques2.FindSumPair.Node;

public class BSTSumPair {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		FindSumPair pair = new FindSumPair();
		Node root = null;
		root = pair.insert(root, 40);
		root = pair.insert(root, 20);
		root = pair.insert(root, 60);
		root = pair.insert(root, 10);
		root = pair.insert(root, 30);
		root = pair.insert(root, 50);
		root = pair.insert(root, 70);
		System.out.println(" Enter the Sum");
		//this method for user take input from user
		int sum ;
		 
		//int sum= 130; //here we already define the value of sum is 130 after it give or tell pair
		sum=sc.nextInt();
		pair.findPairWithGivenSum(root, sum);
		sc.close();

	}

}
