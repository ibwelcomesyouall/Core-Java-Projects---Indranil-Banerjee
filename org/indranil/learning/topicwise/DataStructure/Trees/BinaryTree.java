package org.indranil.learning.topicwise.DataStructure.Trees;

public interface BinaryTree extends Tree {
	
	/** Returns the left child of a node */
	public Position left(Position v) throws InvalidPositionException, BoundaryViolationException; //O(1)
	
	/** Returns the right child of a node */
	public Position right(Position v) throws InvalidPositionException, BoundaryViolationException; //O(1)
	
	/** Returns whether a node has a left child */
	public boolean hasLeft(Position v) throws InvalidPositionException //O(1)
	
	/** Returns whether a node has a right child */
	public boolean hasRight(Position v) throws InvalidPositionException //O(1)
}
