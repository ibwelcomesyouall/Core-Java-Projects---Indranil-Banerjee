package org.indranil.learning.topicwise.Serialization.serialVersionUID;

import java.io.Serializable;

public class Dog implements Serializable{
    
    private static final long serialVersionUID=1L; // ----- Line 1
    int i=10;
    int j=20;
    int k=30;
    int l=40;
    
    // By adding Line 1, we can change the Dog class after the serialization  in sender end also and it will not affect the de-serialization in receiver end

}
