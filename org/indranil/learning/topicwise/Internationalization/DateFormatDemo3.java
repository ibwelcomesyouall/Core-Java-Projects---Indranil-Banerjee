package org.indranil.learning.topicwise.Internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo3 {
    public static void main(String[]args)
    {
        DateFormat uk = DateFormat.getDateTimeInstance(0,0,Locale.UK);
        DateFormat us = DateFormat.getDateTimeInstance(0,0,Locale.US);
        DateFormat italy = DateFormat.getDateTimeInstance(0,0,Locale.ITALY);
        System.out.println("UK style is:"+uk.format(new Date()));
        System.out.println("US style is:"+us.format(new Date()));
        System.out.println("ITALY style is:"+italy.format(new Date()));
    }
}
/*
run:
UK style is:Friday, 24 March 2017 23:53:40 o'clock IST
US style is:Friday, March 24, 2017 11:53:40 PM IST
ITALY style is:venerdì 24 marzo 2017 23.53.40 IST
BUILD SUCCESSFUL (total time: 0 seconds)
*/
