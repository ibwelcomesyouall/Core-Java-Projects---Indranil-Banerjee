package org.indranil.learning.topicwise.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);//[Z, A, M, K, a]
        Collections.sort(l);
        System.out.println(l);//[A, K, M, Z, a]
        System.out.println(Collections.binarySearch(l, "Z")); //3
        System.out.println(Collections.binarySearch(l, "J")); //-2
    }
}
