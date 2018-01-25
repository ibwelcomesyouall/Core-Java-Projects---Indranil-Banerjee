package org.indranil.learning.topicwise.Basic_Concepts;

import java.util.Scanner;
public class Arithmetic{
	public void Run(){
		Scanner in = new Scanner(System.in);
		System.out.println("What arithmetic operation you want to perform?");
		System.out.println("1: Add"+"\n"+"2: Substract"+"\n"+"3: Multiply"+"\n"+"4: Divide"+"\n"+"5: Nothing");
		int n=0;
		n=in.nextInt();
		int a=0,b=0,c=0;
		System.out.println("Enter two number of your choice:");
		a=in.nextInt();
		b=in.nextInt();
		switch(n){
		case 1: 
			c=a+b;
			System.out.println("Sum = "+c);
			break;
		
		case 2: 
			if (a>=b){
				c= a-b;
			}
			else{
				c=b-a;
			}
			System.out.println("Difference = "+c);
			break;
		
		case 3: 
			c=a*b;
			System.out.println("Product = "+c);
			break;
		
		case 4: 
			c=a/b;
			System.out.println("Division = "+c);
			break;
		
		case 5: 
			break;
			
		}
	}
}