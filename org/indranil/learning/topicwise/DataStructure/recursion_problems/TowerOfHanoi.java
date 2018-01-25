package org.indranil.learning.topicwise.DataStructure.recursion_problems;

import java.util.Scanner;

public class TowerOfHanoi
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); 
	int n;
	System.out.print("\n\t\t*****Tower of Hanoi*****\n");
	System.out.print("\t\t Enter number of discs : ");
	n=sc.nextInt();
	System.out.println();
	System.out.println();
	tower(n,'A','B','C'); 
	sc.close();
	}
	
	static void tower(int a,char from,char aux,char to){
		if(a==1){
			System.out.println("\t\t Move disc 1 from "+from+" to "+to);
			return;
			}
		else{
			tower(a-1,from,to,aux); 
			System.out.println("\t\t Move disc "+a+" from "+from+" to "+to);
			tower(a-1,aux,from,to);
	}
	}
	
}
