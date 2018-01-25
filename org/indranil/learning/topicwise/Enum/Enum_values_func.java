package org.indranil.learning.topicwise.Enum;

enum Beer2
{
   KE,RO,FC,KF; 
}
public class Enum_values_func {
    public static void main(String[]args)
    {
        Beer2 b[] = Beer2.values();
        for(Beer2 b1 : b)
        {
           System.out.println(b1+"...."+b1.ordinal()); 
        }
    }
    
}

/*O/P:
KE....0
RO....1
FC....2
KF....3
*/
