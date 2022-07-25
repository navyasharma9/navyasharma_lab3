package com.dsa.lab3.ques1;

import java.util.Stack;

public class BalanceBracket {
	
	public static boolean checkBalanceBracket(String expression) {

		Stack<Character> stack = new Stack<Character>();

		// iterate through the characters
		for (int i = 0; i < expression.length(); i++) {

			// check if c is '(' '{' '['
			char character = expression.charAt(i);

			// push to stack
			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}
			
			char topOfTheStack=stack.pop();;
			// pop from the stack c= ( )
			switch (character) {

			case '}':
				//topOfTheStack = stack.pop();
				if (topOfTheStack == '(' || topOfTheStack == '[')
					return false;
				break;

			case ')':
				//topOfTheStack = stack.pop();
				if (topOfTheStack == '{' ||topOfTheStack == '[')
					return false;
				break;

			case ']':
				//topOfTheStack = stack.pop();
				if(topOfTheStack == '(' || topOfTheStack== '{')
					return false;
				break;
				

			}		
		}
		
		return stack.isEmpty();

	}

}
