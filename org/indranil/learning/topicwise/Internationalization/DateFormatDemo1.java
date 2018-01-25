package org.indranil.learning.topicwise.Internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo1 {
    public static void main(String[]args)
    {
        System.out.println("Full form "+DateFormat.getDateInstance(0,Locale.US).format(new Date()));
        System.out.println("Long form "+DateFormat.getDateInstance(1,Locale.US).format(new Date()));
        System.out.println("Medium form "+DateFormat.getDateInstance(2,Locale.US).format(new Date()));
        System.out.println("Short form "+DateFormat.getDateInstance(3,Locale.US).format(new Date()));
    }   
}
/*
run:
Full form Friday, March 24, 2017
Long form March 24, 2017
Medium form Mar 24, 2017
Short form 3/24/17
BUILD SUCCESSFUL (total time: 1 second)
*/
