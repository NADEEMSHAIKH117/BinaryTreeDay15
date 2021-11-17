package com.bridgelabz;

public class BinaryTree {
	BinaryTreeNode root;

	BinaryTreeNode addRecursive(BinaryTreeNode current, int value) {
		if (current == null) {
			return new BinaryTreeNode(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	public void add(int value) {
	    root = addRecursive(root, value);
	}
	int getSizeRecursive(BinaryTreeNode current) {
		return current == null ? 0:1 + this.getSizeRecursive(current.left )  +this .getSizeRecursive(current.right);
		
	}
	int getSize()
	{
	return this.getSizeRecursive(root);
		
	
	}
	
	private boolean searchRecursively(BinaryTreeNode current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		return value < current.value ? searchRecursively(current.left, value)
				: searchRecursively(current.right, value);
	}

	public boolean search(int value) {
		return searchRecursively(root, value);
	}
}
