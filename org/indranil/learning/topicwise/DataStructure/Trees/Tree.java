package org.indranil.learning.topicwise.DataStructure.Trees;

import java.util.Iterator;

/*
 * An interface for a tree where nodes can have an arbitrary number of children
 */

public interface Tree {
	
	/** Returns the number of nodes in the tree */
	public int size(); //O(1)
	
	/** Returns whether the tree is empty */
	public boolean isEmpty(); //O(1)
	
	/** Returns an iterator of the elements stored in the tree */
	public Iterator elements(); //O(n)
	
	/** Returns an iterator of the nodes stored in the tree */
	public Iterator positions(); //O(n)
	
	/** Replaces the element stored at a given node */
	public Object replace(Position v, Object e) throws InvalidPositionException;
	
	/** Returns the root of the tree */
	public Position root() throws EmptyTreeException; // O(1)
	
	/** Returns the parent of a given node */
	public Position parent(Position v) throws InvalidPositionException, BoundaryViolationException; //O(1)
	
	/** Returns an iterator of the children of a given node */
	public Iterator children(Position v) throws InvalidPositionException;
	
	/** Returns whether a given node is internal */
	public boolean isInternal(Position v) throws InvalidPositionException; //O(1)
	
	/** Returns whether a given node is external */
	public boolean isExternal(Position v)throws InvalidPostionException; //O(1)
	
	/** Returns whether a given node is the root of the tree */
	public boolean isRoot(Position v) throws InvalidPositionException; //O(1)

}
