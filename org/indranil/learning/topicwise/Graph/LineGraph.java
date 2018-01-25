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
public class LineGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] sampleValues_0 = new double[] {89,71,55,54,45,34};
        double[] sampleValues_1 = new double[] {56,30,25,33,28,10};
        double[] sampleValues_2 = new double[] {12,43,67,76,73,84};
        Color[] sampleColors = new Color[] {new Color(0xFFCC00),new Color(0xFF6600),new Color(0x99CC00)};
        String[] sampleLabels = new String[] {"one","two","three","four","five","six"};
        
        LineChart chart = new LineChart();
        chart.setSeriesCount(3);
        chart.setSampleCount(sampleValues_0.length);
        chart.setSampleValues(0, sampleValues_0);
        chart.setSampleValues(1, sampleValues_1);
        chart.setSampleValues(2, sampleValues_2);
        chart.setSampleColors(sampleColors);
        chart.setSampleLabels(sampleLabels);
        chart.setSampleLabelsOn(true);
        chart.setSampleLabelStyle(Chart.BELOW);
        chart.setFont("sampleLabelFont", new Font("Arial", Font.BOLD, 12));
        chart.setValueLabelsOn(true);
        chart.setFont("valueLabelFont", new Font("Arial", Font.BOLD, 11));
        chart.setLegendOn(true);
        chart.setLegendLabels(new String[] {"line 1", "line 2", "line 3"});  
        chart.setFont("legendFont", new Font("Arial", Font.BOLD, 11));
        chart.setFont("rangeLabelFont", new Font("Arial", Font.BOLD, 12));
        chart.setBackground(Color.white);
		  
        com.objectplanet.chart.NonFlickerPanel p = new com.objectplanet.chart.NonFlickerPanel(new BorderLayout());
        p.add("Center", chart);
        Frame f = new Frame();
        f.add("Center", p);
        f.setSize(450,320);
        f.show();
    }
    
}
