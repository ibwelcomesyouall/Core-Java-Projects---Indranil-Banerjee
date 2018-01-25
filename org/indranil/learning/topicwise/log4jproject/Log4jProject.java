/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.indranil.learning.topicwise.log4jproject;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
/**
 *
 * @author user
 */
public class Log4jProject {
    static Logger log = Logger.getLogger("bacon");

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("This is a debug message");
		myMethod();
		log.info("This is an info message");
	}

	private static void myMethod() {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			log.error("This is an exception", e);
		}
	}
}
