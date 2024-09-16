package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class TreeSupport {

	private Node root;

	private int size;

	private class Node {

		private int value;

		private Node leftChild;

		private Node rightChild;

		public Node(int value) {
			this.value = value;
		}
	}

	public void insert(int value) {

		Node node = new Node(value);

		if (isEmpty())
			root = node;
		else
			insertNode(node);

		size++;

	}

	private void insertNode(Node node) {

		Node current = root;

		while (current != null) {

			if (current.value > node.value) {

				if (current.leftChild == null) {
					current.leftChild = node;
					break;
				}

				current = current.leftChild;
			}

			else {

				if (current.rightChild == null) {
					current.rightChild = node;
					break;
				}

				current = current.rightChild;
			}

		}

	}

	public boolean search(int value) {

		Node current = root;

		while (current != null) {

			if (value < current.value)
				current = current.leftChild;

			else if (current.value < value)
				current = current.rightChild;

			else
				return true;

		}

		return false;
	}

	public void traversePreOrder() {

		traversePreOrder(root);
	}

	private void traversePreOrder(Node root) {

		if (root == null)
			return;

		System.out.println(root.value);

		traversePreOrder(root.leftChild);

		traversePreOrder(root.rightChild);
	}

	public void traverseInOrder() {

		traverseInOrder(root);

	}

	private void traverseInOrder(Node root) {

		if (root == null)
			return;

		traverseInOrder(root.leftChild);

		System.out.println(root.value);

		traverseInOrder(root.rightChild);
	}

	public void traversePostOrder() {

		traversePostOrder(root);

	}

	private void traversePostOrder(Node root) {

		if (root == null)
			return;

		traversePostOrder(root.leftChild);

		traversePostOrder(root.rightChild);

		System.out.println(root.value);

	}

	public int height() {

		return height(root);

	}

	private int height(Node root) {

		if (root == null)
			return -1;

		if (isLeaf(root))
			return 0;

		return 1 + Math.max(height(root.leftChild), height(root.rightChild));
	}

	public int findMinValueOfBT() {

		return findMinValueOfBT(root);
	}

	private int findMinValueOfBT(Node root) {

		if (root == null)
			return Integer.MAX_VALUE;

		if (isLeaf(root)) {
			return root.value;
		}

		int left = findMinValueOfBT(root.leftChild);

		int right = findMinValueOfBT(root.rightChild);

		return Math.min(root.value, Math.min(left, right));
	}

	public int findMinvalueOfBST() {
		return findMinOrMaxOfBST(root, "MIN");

	}

	public int findMaxvalueOfBST() {

		return findMinOrMaxOfBST(root, "MAX");

	}

	public int findMinOrMaxOfBST(Node root, String check) {

		if (root == null)
			return -1;

		Node current = root;

		Node lastVisited = current;

		while (current != null) {

			lastVisited = current;

			if (check.equals("MIN"))

				current = current.leftChild;

			if (check.equals("MAX"))

				current = current.rightChild;
		}
		return lastVisited.value;

	}

	public boolean equals(TreeSupport tree2) {

		return equals(root, tree2.root);

	}

	private boolean equals(Node first, Node second) {

		if (first == null && second == null)
			return true;

		if (first != null && second != null)

			return first.value == second.value && equals(first.leftChild, second.leftChild)
					&& equals(first.rightChild, second.rightChild);

		return false;
	}

	public void swapTree() {
		Node temp = root.leftChild;

		root.leftChild = root.rightChild;

		root.rightChild = temp;
	}

	public boolean isBinarySearchTree() {

		return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBinarySearchTree(Node root, int min, int max) {

		if (root == null)
			return true;

		if (min > root.value || root.value > max)
			return false;

		return isBinarySearchTree(root.leftChild, min, root.value - 1)
				&& isBinarySearchTree(root.rightChild, root.value + 1, max);
	}

	public List<Integer> getNodesAtDistance(int distance) {

		List<Integer> list = new ArrayList<>();

		getNodesAtDistance(root, distance, list);

		return list;
	}

	private void getNodesAtDistance(Node root, int distance, List<Integer> list) {

		if (root == null)
			return;

		if (distance == 0) {
			list.add(root.value);
			return;
		}

		getNodesAtDistance(root.leftChild, distance - 1, list);

		getNodesAtDistance(root.rightChild, distance - 1, list);

	}

	public void traverseLevelOrder() {

		int treeHeight = height();

		for (int i = 0; i <= treeHeight; i++)
			for (int value : getNodesAtDistance(i))
				System.out.println(value);
	}

	public int countLeaves() {

		return countLeaves(root, 0);
	}

	private int countLeaves(Node root, int count) {

		if (root == null)
			return 0;

		if (isLeaf(root))
			return count + 1;

		return countLeaves(root.leftChild, count) + countLeaves(root.rightChild, count);
	}

	private boolean isLeaf(Node node) {
		return node.leftChild == null && node.rightChild == null;
	}

	public int size() {
		return size;
	}

	private boolean isEmpty() {

		return root == null;
	}

	public boolean areSibling(int value1, int value2) {

		return areSibling(root, value1, value2);

	}

	private boolean areSibling(Node root, int value1, int value2) {

		if (root == null)
			return false;

		boolean isSibling = false;

		if (root.leftChild != null && root.rightChild != null)
			if (root.leftChild.value == value1 && root.rightChild.value == value2
					|| root.leftChild.value == value2 && root.rightChild.value == value1)

				isSibling = true;

		return isSibling || areSibling(root.leftChild, value1, value2) || areSibling(root.rightChild, value1, value2);
	}

	public List<Integer> getAncestors(int value) {

		List<Integer> list = new ArrayList<>();

		getAncestors(root, value, list);

		return list;
	}

	private boolean getAncestors(Node root, int value, List<Integer> list) {

		if (root == null)
			return false;

		if (root.value == value)
			return true;

		if (getAncestors(root.leftChild, value, list) || getAncestors(root.rightChild, value, list)) {
			list.add(root.value);
			return true;
		}
		return false;

	

	}

}
