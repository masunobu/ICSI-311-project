package project1_311;

import java.util.Collection;
/**
 * Java application to build and search a B-Tree
 * @author Naganobu Masuda(001447584)
 * @version 1.0
 */
public class RootNode extends Node{
	
	/**
	 * Inherits default constructor
	 */
	public RootNode(){
		super();
	}
	
	/**
	 * Constructor for "Top" RootNode
	 * @param Integer of start range value of RootNode
	 * @param Integer of end range value of RootNode
	 */
	public RootNode(int start, int end){
		super(start, end);
	}
	
	/**
	 * Constructor for RootNode
	 * @param Integer of start range value of RootNode
	 * @param Integer of end range value of RootNode
	 * @param Collection of nodes either RootNode or LeafNode
	 */
	public RootNode(int min, int max, Collection<Node> nodes){
		super(min, max, nodes);
	}
}
