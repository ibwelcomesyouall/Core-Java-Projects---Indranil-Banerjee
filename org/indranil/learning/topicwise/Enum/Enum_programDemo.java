package org.indranil.learning.topicwise.Enum;

enum Beer3
{
    RO(20),KF(40),GI(73),FO;
    int price;
    Beer3(int price)
    {
        this.price=price;
    }
    Beer3()
    {
        this.price=65;
    }
    int getPrice()
    {
        return price;
    }
}
public class Enum_programDemo {
    public static void main(String[]args)
    {
      Beer3 b[] = Beer3.values();
      for(Beer3 b1 : b)
      {
          System.out.println(b1+"...."+b1.getPrice());
      }
    }
    
}
/*
O/P:
RO....20
KF....40
GI....73
FO....65
*/
