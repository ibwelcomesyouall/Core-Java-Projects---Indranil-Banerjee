/** Problem -1 : Discuss Towers of Hanoi puzzle 
 * 
 * The Tower of Hanoi (also called the Tower of Brahma or Lucas' Tower and sometimes pluralized) is a mathematical game or puzzle.
 * The puzzle was first publicized in the West by the French mathematician Edouard Lucas in 1883.
 * 
 * There is a history about an Indian temple in Kashi Vishwanath which contains a large room with three time-worn posts in it, surrounded by 64 golden disks. 
 * Brahmin priests, acting out the command of an ancient prophecy, have been moving these disks, in accordance with the immutable rules of the Brahma, since that time. 
 * The puzzle is therefore also known as the Tower of Brahma puzzle. According to the legend, when the last move of the puzzle will be completed, the world will end. 
 * It is not clear whether Lucas invented this legend or was inspired by it. If the legend were true, and if the priests were able to move disks at a rate of one per second, 
 * using the smallest number of moves, it would take them 264 − 1 seconds or roughly 585 billion years or 18,446,744,073,709,551,615 turns to finish, or about 45 times 
 * the life span of the sun.

 * The solution of this problem is very simple.
 * The solution can be stated as
	* Move top n-1 disks from Source to Auxiliary tower
	* Move the nth disk from Source to Destination tower
	* Move the n-1 disks from Auxiliary tower to Destination tower
	* Transferring the top n-1 disks from Source to Auxiliary tower can again be thought of as, a fresh problem and can be solved in the same manner.
*/


package org.indranil.learning.topicwise.DataStructure.Recursion_Backtracking;

import java.util.Scanner;

public class TowerOfHanoi
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); 
	int no_of_disks;
	System.out.print("\n\t\t*****Tower of Hanoi*****\n");
	System.out.print("\t\t Enter number of discs : ");
	no_of_disks=sc.nextInt();
	System.out.println();
	System.out.println();
	tower(no_of_disks,'A','B','C'); 
	sc.close();
	}
	
	static void tower(int no_of_disks,char frompeg,char topeg, char auxpeg){
		// if only 1 disk, make the move and return
		if(no_of_disks==1){
			System.out.println("\t\t Move disc 1 from "+frompeg+" to "+topeg);
			return;
			}
		// Move top n-1 disks from A to B, using C as auxiliary
		tower(no_of_disks-1,frompeg,auxpeg,topeg); 
		System.out.println("\t\t Move disc "+no_of_disks+" from "+frompeg+" to "+topeg);
		
		//Move n1 disks from B to C using A as auxiliary	
		tower(no_of_disks-1,auxpeg,topeg,frompeg);
	}
	
}
