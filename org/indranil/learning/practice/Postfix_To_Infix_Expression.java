package org.indranil.learning.practice;

public class Postfix_To_Infix_Expression {

	public static void main(String[] args) {
		//1. Read the prefix expression from left to right, one character at a time. 2. If we read the operand then push it onto the stack. 3. If we read the operator then pop the first operand and concatenate it with ‘(‘, call it as str1. Then pop the second operand and concatenate it with str1, call it as str2. And then concatenate str2 with ‘)’. Thus and infix expression ‘(operand 1 operator operand 2’ gets performed. Push this expression onto stack. 4. Go to Step1 until the complete input is read.

	}

}
