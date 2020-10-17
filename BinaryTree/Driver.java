package project1_311;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * Java application to build and search a B-Tree
 * @author Naganobu Masuda(001447584)
 * @version 1.0
 */
public class Driver{
	public static void main(String[] args){
		// "Top" root of the B-tree
		Node root = null;
		
	    // Builds each leaf nodes for Test case 1
		Node aLeaf = new Node(new ArrayList<Integer>(Arrays.asList(5,78,92)));
		Node bLeaf = new Node(new ArrayList<Integer>(Arrays.asList(112)));
		Node cLeaf = new Node(new ArrayList<Integer>(Arrays.asList(231)));
		Node dLeaf = new Node(new ArrayList<Integer>(Arrays.asList(457,500)));
		Node eLeaf = new Node(new ArrayList<Integer>(Arrays.asList(999)));
		
		// Builds each root nodes for Test case 1
		Node topNode = new Node(1,1000);
		
		Node aRoot = new Node(1,100,new ArrayList<Node>());
		topNode.left = aRoot;
		aRoot.left = aLeaf;
		
		Node bRoot = new Node(101,200,new ArrayList<Node>());
		topNode.right = bRoot;
		bRoot.left = bLeaf;
		
		Node cRoot = new Node(201,400,new ArrayList<Node>());
		bRoot.right = cRoot;
		cRoot.left = cLeaf;
		
		Node dRoot = new Node(401,500,new ArrayList<Node>());
		cRoot.right = dRoot;
		dRoot.left = dLeaf;
		
		Node eRoot = new Node(501,1000,new ArrayList<Node>());
		dRoot.right = eRoot;
		eRoot.left = eLeaf;
		
		// Sets first Node is "Top" Node
 		root = topNode;
		
		// Shows minimum and maximum value of each root nodes
		System.out.println("'Top' Root Node : " + root + " : " + root.min + " to " + root.max);
		System.out.println("First Root Node : " + aRoot + " : " + aRoot.min + " to " + aRoot.max);
		System.out.println("Second Root Node : " + bRoot + " : " + bRoot.min + " to " + bRoot.max);
		System.out.println("Third Root Node : " + cRoot + " : " + cRoot.min + " to " + cRoot.max);
		System.out.println("Fourth Root Node : " + dRoot + " : " + dRoot.min + " to " + dRoot.max);
		System.out.println("Fifth Root Node : " + eRoot + " : " + eRoot.min + " to " + eRoot.max);
		System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		
		// Shows minimum and maximum value of each leaf nodes
		System.out.println("First Leaf Node : " + aLeaf + " : " + aLeaf.values);
		System.out.println("Second Leaf Node : " + bLeaf + " : " + bLeaf.values);
		System.out.println("Third Leaf Node : " + cLeaf + " : " + cLeaf.values);
		System.out.println("Fourth Leaf Node : " + dLeaf + " : " + dLeaf.values);
		System.out.println("Fifth Leaf Node : " + eLeaf + " : " + eLeaf.values);
		System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		
		// Starts searching values of B-tree
		// if the searching correct, shows ○ with the sentences
		System.out.println("Searching : 112, 78, 15");
		if(root.search(112)){
			System.out.println(" 112 is contained ○");
	    }else{
	    	System.out.println(" 112 is 'not' contained");
	    }
		if(root.search(78)){
			System.out.println(" 78 is contained ○");
	    }else{
	    	System.out.println(" 78 is 'not' contained!");
	    }
		if(root.search(15)){
			System.out.println(" 15 is contained");
	    }else{
	    	System.out.println(" 15 is 'not' contained ○");
	    }
	}
}
