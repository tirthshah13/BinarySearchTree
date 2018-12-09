package com.learn.java;

public class ApplicationMain {

	public static void main(String arg[]) {
		Node root = null;
		BinarySearchTree b = new BinarySearchTree();
		b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display(b.root);
		System.out.println("");
		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		System.out.println("Delete Node with no children (2) : " + b.delete(2));
		b.display(root);
		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));
		b.display(root);
		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
		b.display(root);
	}

}
