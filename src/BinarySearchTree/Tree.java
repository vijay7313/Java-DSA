package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Tree {

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

		var node = new Node(value);

		if (isEmpty())
			root = node;
		else
			insertNode(node);

		size++;

	}

	private void insertNode(Node newNode) {

		var current = root;

		while (current != null) {

			if (current.value > newNode.value) {

				if (current.leftChild == null) {
					current.leftChild = newNode;
					break;
				}
				current = current.leftChild;
			}

			else {

				if (current.rightChild == null) {
					current.rightChild = newNode;
					break;
				}
				current = current.rightChild;
			}

		}
	}

	public boolean search(int value) {

		var current = root;

		while (current != null) {

			if (current.value > value)
				current = current.leftChild;

			else if (current.value < value)
				current = current.rightChild;

			else
				return true;
		}

		return false;

	}

	public boolean contains(int value) {

		return contains(root, value);
	}

	private boolean contains(Node root, int value) {

		if (root == null)
			return false;

		if (root.value == value)
			return true;

		if (root.value > value)
			return contains(root.leftChild, value);

		else
			return contains(root.rightChild, value);

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

	public int findMinValue() {

		return findMinOrMax(root, "min");
	}

	public int findMaxValue() {

		return findMinOrMax(root, "max");
	}

	private int findMinOrMax(Node root, String direction) {

		var current = root;
		var lastVisited = current;

		while (current != null) {

			lastVisited = current;

			if (direction.equals("min"))
				current = current.leftChild;

			if (direction.equals("max"))
				current = current.rightChild;
		}

		return lastVisited.value;
	}

	public int findMinValueOfBT() {

		if (isEmpty())
			return -1;

		return findMinValueOfBT(root);
	}

	private int findMinValueOfBT(Node root) {

		if (root == null)
			return Integer.MAX_VALUE;

		if (isLeaf(root))
			return root.value;

		var left = findMinValueOfBT(root.leftChild);

		var right = findMinValueOfBT(root.rightChild);

		return Math.min(Math.min(left, right), root.value);

	}

	public boolean equals(Tree tree2) {

		if (tree2 == null)
			return false;

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

	public boolean isBinarySearchTree() {

		return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

	}

	private boolean isBinarySearchTree(Node root, int min, int max) {

		if (root == null)
			return true;

		if (root.value < min || root.value > max)
			return false;

		return isBinarySearchTree(root.leftChild, min, root.value - 1) &&

				isBinarySearchTree(root.rightChild, root.value + 1, max);

	}

	public void swapTree() {

		var temp = root.leftChild;

		root.leftChild = root.rightChild;

		root.rightChild = temp;

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

	public int size() {
		return size;
	}

	private boolean isLeaf(Node node) {
		return node.leftChild == null && node.rightChild == null;
	}

	private boolean isEmpty() {
		return root == null;

	}

}
