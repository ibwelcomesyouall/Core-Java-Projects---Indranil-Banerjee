package org.indranil.learning.topicwise.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {
    public static void main(String[]args)
    {
        double d = 123456.789;
        NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
        String s = nf.format(d);
        System.out.println("Italy Specific form: "+s);
    }
    
}
/*run:
Italy Specific form: 123.456,789
BUILD SUCCESSFUL (total time: 0 seconds)
*/