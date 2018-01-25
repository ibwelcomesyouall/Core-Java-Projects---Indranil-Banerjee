package org.indranil.learning.topicwise.Internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo2 {
    public static void main(String[]args)
    {
        DateFormat uk = DateFormat.getDateInstance(0,Locale.UK);
        DateFormat us = DateFormat.getDateInstance(0,Locale.US);
        DateFormat italy = DateFormat.getDateInstance(0,Locale.ITALY);
        System.out.println(uk.format(new Date()));
        System.out.println(us.format(new Date()));
        System.out.println(italy.format(new Date()));
    }
}
/*run:
Friday, 24 March 2017
Friday, March 24, 2017
venerdì 24 marzo 2017
BUILD SUCCESSFUL (total time: 0 seconds)*/
