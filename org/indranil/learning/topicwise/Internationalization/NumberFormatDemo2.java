package org.indranil.learning.topicwise.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo2 {
    public static void main(String[]args)
    {
        double d = 123456.789;
        Locale india = new Locale("pa","IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(india);
        System.out.println("India Form is:"+nf.format(d));
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US Form is:"+nf1.format(d));
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("UK Form is:"+nf2.format(d));
    }  
}
/*run:
India Form is:INR 123,456.79
US Form is:$123,456.79
UK Form is:£123,456.79
BUILD SUCCESSFUL (total time: 0 seconds)*/
