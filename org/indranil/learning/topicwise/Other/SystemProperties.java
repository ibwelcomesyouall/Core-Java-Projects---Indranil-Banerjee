/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.indranil.learning.topicwise.Other;
import java.util.*;
/**
 *
 * @author user
 */
public class SystemProperties {
    public static void main(String[]args)
    {
        Properties p = System.getProperties();
        p.list(System.out);
    }
    
}
