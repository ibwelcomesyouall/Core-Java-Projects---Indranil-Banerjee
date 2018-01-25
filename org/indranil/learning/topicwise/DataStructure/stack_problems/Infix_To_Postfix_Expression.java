package org.indranil.learning.topicwise.DataStructure.stack_problems;

public class Infix_To_Postfix_Expression {

	public static void main(String[] args) {
		//1. Read the infix expression for left to right, one character at a time. 2. If the input symbol read is an operand then place it in the postfix expression. 3. If the input symbol is an operator then: (a) Check if the priority of the operator in the stack is greater than the priority of the incoming (or input read) operator. If yes, then pop that operator from the stack and place it in the postfix expression. Repeat Step 3(a) till we get the operator in the
		//stack which has a greater priority than the incoming operator. (b) Otherwise push the operator being read, onto the stack. (c) If we read the input operator as ‘)’ then pop all the operators until we get ‘(’ and append the popped operators to the postfix expression. Finally just pop ‘(’. 1. Finally pop the remaining contents from the stack until the stack becomes empty. Append them to the postfix expression. 2. Print the postfix expression as a result.

	}

}
