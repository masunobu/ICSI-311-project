package project1_311;

import java.util.Collection;
/**
 * Java application to build and search a B-Tree
 * @author Naganobu Masuda(001447584)
 * @version 1.0
 */
public class Node{

	public int min, max;
	public Node left, right;
	public Collection<Node> nodes;
	public Collection<Integer> values;
 
	/**
	 * Default constructor
	 */
	public Node(){
	}
 
	/**
	 * Constructor for "Top" RootNode
	 * @param Integer of start range value of RootNode
	 * @param Integer of end range value of RootNode
	 */
	public Node(int min, int max){
		this.min = min;
		this.max = max;
	}
	
	/**
	 * Constructor for RootNode
	 * @param Integer of start range value of RootNode
	 * @param Integer of end range value of RootNode
	 * @param Collection of nodes either RootNode or LeafNode
	 */
	public Node(int min, int max, Collection<Node> nodes){
		this.min = min;
		this.max = max;
		this.nodes = nodes;
	}
	
	/**
	 * Constructor for LeafNode
	 * @param Collection of integers of LeafNode
	 */
	public Node(Collection<Integer> values){
		this.values = values;
	}
	
	/**
	 * The search method checks to see if a value is in the B-tree
	 * @param x The value to check for
     * @return true if x is in the tree, false otherwise
	 */
	public boolean search(int x){
		// method recursive
		return search(x, this);
	}

	/**
	 * The search method checks to see if a value is in the B-tree
	 * @param x The value to check for
	 * @param root The B-tree to look in
     * @return true if found, false otherwise
	 */
	private boolean search(int x, Node root){
		if(this.min <= x && x <= this.max){
			if(x < this.left.max){
				if(this.left.left.contains(x)){
					return true;
				}
			}else{
				if(x < this.right.max){
					if(this.right.left.contains(x)){
						return true;
					}
				}else if(x < this.right.right.max){
					if(this.right.right.left.contains(x)){
						return true;
					}
				}else if(x < this.right.right.right.max){
					if(this.right.right.right.left.contains(x)){
						return true;
					}
				}
			}
		}return false;
	}
	
	/**
	 * The contains method checks to see if a value is in the LeafNode
	 * @param x The value to check for
     * @return true if x is in the tree, false otherwise
	 */
	public boolean contains(int x){
		System.out.print("Leaf Node searched:" + this.values + " -> ");
		return this.values.contains(x);
	}
}
