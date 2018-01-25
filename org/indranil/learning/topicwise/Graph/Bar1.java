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
public class Bar1 {
    public static void main(String[] args) {
    
    double[] values = new double[] {5,15,23,-34,-45,56,28,17,-16,-30};
        	Color[] sampleColor = new Color[] {Color.red};
        	Color[] rangeColor = new Color[] {new Color(0xA20202)};

        	BarChart chart = new BarChart();
        	chart.setSampleCount(10);
        	chart.setSampleValues(0, values);
        	chart.setSampleColors(sampleColor);
        	chart.setBackground(new Color(0xF8F7B8));
        	chart.setChartBackground(new Color(0xFFFFD6));
        	chart.setBarWidth(0.3);
        	chart.setRange(0, -60);
        	chart.setLowerRange(0, 60);
        	chart.setRangeColor(0, new Color(0xA20202));
        	chart.setLabel("rangeLabelPostfix", "#");
        	chart.setFont("rangeLabelFont_0", new Font("Arial", Font.PLAIN, 10));
        	chart.setRangeAdjusterOn(0, true);
        	chart.setRangeDecimalCount(0, 1);
        	chart.setValueLabelsOn(true);

        	Frame f = new Frame();
        	f.setSize(450,320);
        	f.add("Center", chart);
        	f.show();
    }
    
}
