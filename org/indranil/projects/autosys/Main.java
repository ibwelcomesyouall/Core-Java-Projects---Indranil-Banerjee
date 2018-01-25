/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.indranil.projects.autosys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Twinkle
 */
public class Main {

    public static void main(String[] args) {
        //System.out.println("<HTML><HEAD><TITLE></TITLE></HEAD><BODY><TABLE border =1><tr>");
                try {
                         BufferedReader in = new BufferedReader(new FileReader("dd.txt"));
                        String str = null;
                        String comment=null;
                        String ij="insert_job:";
                        String com="command:";
                        String own="owner:";
                        String mac="machine:";
                        String per="permission:";
                        String dat_c="date_condition:";
                        String day_o_week="days_of_week:";
                        String st="start_tmes:";
                        String des="description:";
                        String sof="std_out_file:";
                        String sef="std_err_file:";
                        String aif="alarm_if_fail:";

                        while ((str = in.readLine()) != null)
                        {
                         if(((str.matches(".*insert_job:.*"))))
                            {
                                ij=str;
                            }
                         if(((str.matches(".*command:.*"))))
                            {
                                com=str;
                            }
                         if(((str.matches(".*owner:.*"))))
                            {
                                own=str;
                            }
                         if(((str.matches(".*machine:.*"))))
                            {
                                mac=str;
                            }
                         if(((str.matches(".*permission:.*"))))
                            {
                                per=str;
                            }
                         if(((str.matches(".*date_condition:.*"))))
                            {
                               dat_c=str;
                            }
                         if(((str.matches(".*days_of_week:.*"))))
                            {
                                day_o_week=str;
                            }
                          if(((str.matches(".*start_times:.*"))))
                            {
                                st=str;
                            }
                          if(((str.matches(".*description:.*"))))
                            {
                                des=str;
                            }
                          if(((str.matches(".*std_out_file:.*"))))
                            {
                                sof=str;
                            }
                          if(((str.matches(".*std_err_file:.*"))))
                            {
                                sef=str;
                            }
                          if(((str.matches(".*alarm_if_fail:.*"))))
                            {
                                aif=str;
                            }
                        if((str.matches(".*/* -----------------.*")))
                            {
                                comment=str;
                            }
                         }
                        try {

			String content = comment+"\n"+ij+"\n"+com+"\n"+own+"\n"+mac+"\n"+per+"\n"+dat_c+"\n"+day_o_week+"\n"+st+"\n"+des+"\n"+sof+"\n"+sef+"\n"+aif;

			File file = new File("filename.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
                    System.out.print(e);
		}

                        System.out.println(comment+"\n"+ij+"\n"+com+"\n"+own+"\n"+mac+"\n"+per+"\n"+dat_c+"\n"+day_o_week+"\n"+st+"\n"+des+"\n"+sof+"\n"+sef+"\n"+aif);
                        in.close();
                            } catch (IOException e) {
                                System.out.print(e);
                            }
    }
}
