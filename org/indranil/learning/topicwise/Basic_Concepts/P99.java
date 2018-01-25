
//Date     : 3rd Sept 2016.
/*Question : Write a Java Program that works as a simple calculator
             */
//Ans      : See Below.

package org.indranil.learning.topicwise.Basic_Concepts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class P99 {
    public static void main(String[] args) throws IOException {
        System.out.println("******** Welcome to My calulator ***********");
        System.out.println("Enter your choice");
        System.out.println("1: Addition\n2: Substraction\n3: Multiplication\n4: Division");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice=Integer.parseInt(br.readLine()); 
        System.out.println("Enter first number");
        int a=Integer.parseInt(br.readLine()); 
        System.out.println("Enter Second number");
        int b=Integer.parseInt(br.readLine()); 
        switch(choice)
        {
            case 1: 
                System.out.println("Addition result:"+add(a,b));
                break;
            case 2: 
                System.out.println("Substraction result:"+sub(a,b));
                break;
            case 3: 
                System.out.println("Multiplication result:"+mul(a,b));
                break;
            case 4: 
                System.out.println("Division result:"+div(a,b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static int add(int a, int b)
    {
        int c=a+b;
        return c;
    }
    public static int sub(int a, int b)
    {
        int c=a-b;
        return c;
    }
    public static int mul(int a, int b)
    {
        int c=a*b;
        return c;
    }
    public static float div(int a, int b)
    {
        float c=a/b;
        return c;
    }
}
/*Output: run:
******** Welcome to My calulator ***********
Enter your choice
1: Addition
2: Substraction
3: Multiplication
4: Division
1
Enter first number
2
Enter Second number
3
Addition result:5
BUILD SUCCESSFUL (total time: 7 seconds)
            or
******** Welcome to My calulator ***********
Enter your choice
1: Addition
2: Substraction
3: Multiplication
4: Division
2
Enter first number
3
Enter Second number
5
Substraction result:-2
BUILD SUCCESSFUL (total time: 6 seconds)
                or
******** Welcome to My calulator ***********
Enter your choice
1: Addition
2: Substraction
3: Multiplication
4: Division
3
Enter first number
4
Enter Second number
23
Multiplication result:92
BUILD SUCCESSFUL (total time: 6 seconds)
                or
******** Welcome to My calulator ***********
Enter your choice
1: Addition
2: Substraction
3: Multiplication
4: Division
4
Enter first number
23
Enter Second number
2
Division result:11.0
BUILD SUCCESSFUL (total time: 8 seconds)
*/

