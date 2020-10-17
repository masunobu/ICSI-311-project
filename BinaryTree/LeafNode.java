package project1_311;

import java.util.Collection;
/**
 * Java application to build and search a B-Tree
 * @author Naganobu Masuda(001447584)
 * @version 1.0
 */
public class LeafNode extends Node{

	/**
	 * Inherits default constructor
	 */
	public LeafNode(){
		super();
	}
	
	/**
	 * Constructor for LeafNode
	 * @param Collection of integers of LeafNode
	 */
	public LeafNode(Collection<Integer> values){
		super(values);
	}
}