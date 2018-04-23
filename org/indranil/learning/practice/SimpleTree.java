package org.indranil.learning.practice;

import java.util.Iterator;

public class SimpleTree implements Tree {
	
	public int depth(Tree T, Position v) { // O(dv) -- dv denotes the depth of the node v in the Tree T.
		if(Tree.isRoot(v))
			return 0;
		else
			return 1+ depth(T,T.parent(v));
	}
	
	public static int height(Tree T) {
		int h = 0;
		Iterator positer = T.positions();
		while(positer.hasNext()) {
			Position v = (Position) positer.next();
			if(T.isExternal(v)) {
				h= Math.max(h,depth(T,v));
			}
			return h;
		}
	}
	
	public static int height(Tree T, Position v) {
		if(T.isExternal(v))
			return 0;
		else {
			int h=0;
			Iterator children = T.children(v);
			while(children.hasNext())
				h=Math.max(h,height(T,(Position)children.next()));
			return 1+h;
		}
	}
	
	public static String preordePrint(Tree T, Position v) {
		String s = v.element().toString();
		Iterator children = T.children(v);
		while(children.hasNext())
			s+=" " + preordePrint(T, (Position)children.next());
		return s;
	}
	
	public static String parentheticRepresentation(Tree T, Position v) {
		String s = v.element().toString();
		if(T.isInternal(v)) {
			Iterator children = T.children(v);
			s+=" ( "+parentheticRepresentation(T, (Position)children.next());
			while(children.hasNext())
				s+=", "+parentheticRepresentation(T, (Position)children.next());
			s+=" )";
		}
		return s;
	}
	
	public static String postorderPrint(Tree T, Position v) {
		String s="";
		Iterator children = T.children(v);
		while(children.hasNext())
			s+=postorderPrint(T,(Position)children.next())+" ";
		s+=v.element();
		return s;
	}

}
