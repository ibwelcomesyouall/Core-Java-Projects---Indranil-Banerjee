package org.indranil.learning.topicwise.DOMParser;

import java.io.File; 
import java.io.IOException;  
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 
import javax.xml.parsers.ParserConfigurationException;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;  

public class PODomParser {  
	public static void main(String args[]) throws ParserConfigurationException,SAXException, IOException {   
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();  
		factory.setIgnoringElementContentWhitespace(true);
		DocumentBuilder builder = factory.newDocumentBuilder();   
		Document poDocument = builder.parse(new File("F:\\Study\\First.xml"));
		Element itemCode = poDocument.getElementById("itemCode");
		System.out.println(itemCode.getTextContent());
		//printNode(poDocument);
		} 
	
	private static void printNode(Node node) {   
		if (node != null) {    
			int type = node.getNodeType();    
			switch (type) {    
			case Node.DOCUMENT_NODE:
				System.out.println("<?xml version='1.0'?>");     
				printNode(node.getFirstChild());     
				break;    
			case Node.ELEMENT_NODE:
				System.out.print("<"+node.getNodeName()+">");     
				NodeList childrens = node.getChildNodes();     
				if(childrens != null) {
					for(int i=0;i<childrens.getLength();i++) {
						Node child = childrens.item(i);
						printNode(child);
						}
					}
				System.out.println("</"+node.getNodeName()+">");     
				break;    
			case Node.TEXT_NODE:   
				System.out.print(node.getNodeValue());
				break;    
						}   
			}  
		} 
	}
