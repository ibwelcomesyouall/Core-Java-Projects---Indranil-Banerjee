package org.indranil.Starter;

import java.util.Scanner;

import org.indranil.learning.topicwise.Basic_Concepts.Arithmetic;
class Linker{
	Linker(){
		Scanner in = new Scanner(System.in);
		System.out.println("Which code you want to run?");
		System.out.println("1: Arithmetic"+"\n"+"2: etc"+"\n"+"3: don't want to run any code");
		int n=0;
		n=in.nextInt();
		switch(n){
		case 1: 
			Arithmetic ari = new Arithmetic();
			ari.Run();
			break;
		case 2: 
			System.out.print("etc");
			break;
		case 3: 
			break;
		
		}
	}
}