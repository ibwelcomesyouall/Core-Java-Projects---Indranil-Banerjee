package org.indranil.learning.topicwise.DataStructure.stack_problems;

public class Evaluation_Of_Postfix_Expression {

	public static void main(String[] args) {
		// 1. Read the postfix expression from left to right, one character at a time. 2. If we read the operand then push it onto the stack. 3. 
		//If we read the operator then pop two operands. Call the first popped operand as OP2 and second popped operand as OP1. Perform an arithmetic operation. 
		//If the operator is + then result = OP1 + OP2 – then result = OP1 – OP2 * then result = OP1 * OP2 / then result = OP1/OP2 <<up arrow>> then result = OP1 <<up arrow>> OP2 so on. 
		//4. Push the result onto the stack. 5. Repeat Steps 1-4 till the postfix expression is not over.

	}

}
