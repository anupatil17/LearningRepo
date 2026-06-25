package com.mmcoe.ds;

public class BinaryTree {
	private class Node {
		private int data;
		public Node left, right;

		public Node(int data) {
			this.data = data;
		}

	}

	private Node root;

	public BinaryTree() {
		root = null;
	}

	public void add(int data) {
		Node n = new Node(data);

		if (root == null) {
			root = n;
		}
		Node t = root;

		while (true) {
			if (data == t.data)
				break;

			if (data > t.data) {
				if (t.right == null) {
					t.right = n;
					return;
				}
				t = t.right;
			}
			if (data < t.data) {
				if (t.left == null) {
					t.left = n;
					return;
				}
				t = t.left;
			}
		}
	}

	public void print() {
		inOrder(root);
	}

	private void inOrder(Node root) {
		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

}
