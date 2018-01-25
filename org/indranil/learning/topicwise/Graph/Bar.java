/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.indranil.learning.topicwise.Graph;
import com.objectplanet.chart.*; 
import java.awt.*; 
/**
 *
 * @author user
 */
public class Bar {
    public static void main(String[] args) {
    double[] values = new double[] {10,20,40,65,50};
        	Color[] c = new Color[] {new Color(0xFF7310)};
        	BarChart chart = new BarChart();

        	chart.setSampleCount(5);
        	chart.setSampleValues(0, values);
        	chart.setSampleColors(c);
        	chart.setBackground(Color.white);
        	chart.setRange(0, 70);

        	Frame f = new Frame();
        	f.setSize(450,320);
        	f.add("Center", chart);
        	f.show();
    }
    
}
