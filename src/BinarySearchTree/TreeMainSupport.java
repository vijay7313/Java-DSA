package BinarySearchTree;

public class TreeMainSupport {

	public static void main(String[] args) {

		TreeSupport tree1 = new TreeSupport();

		tree1.insert(7);

		tree1.insert(4);

		tree1.insert(9);

		tree1.insert(1);

		tree1.insert(6);

		tree1.insert(8);

		tree1.insert(10);

		tree1.insert(5);

		TreeSupport tree2 = new TreeSupport();

		tree2.insert(7);

		tree2.insert(4);

		tree2.insert(9);

		tree2.insert(1);

		tree2.insert(6);

		tree2.insert(8);

		tree2.insert(10);

		tree2.insert(5);

//		System.out.println(tree.size());

//		System.out.println(tree.search(11));

//		tree.traversePreOrder();

//		tree.traverseInOrder();

//		tree.traversePostOrder();

//		System.out.println(tree.height());

//		System.out.println(tree.findMinValueOfBT());

//		System.out.println(tree.findMinvalueOfBST());

//		System.out.println(tree.findMaxvalueOfBST());

//		System.out.println(tree1.equals(tree2));

//		tree1.swapTree();

//		System.out.println(tree1.isBinarySearchTree());

//		System.out.println(tree1.getNodesAtDistance(2));

//		tree1.traverseLevelOrder();

//		System.out.println(tree1.countLeaves());

//		System.out.println(tree1.areSibling(8, 10));
		
		System.out.println(tree1.getAncestors(5));

	}
}
