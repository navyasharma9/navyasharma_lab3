package com.dsa.lab3.ques2;

import java.util.HashSet;
import java.util.Set;

public class FindSumPair {
	public static class Node {
		int nodeData;
		Node leftNode, rightNode;

	}

	public static Node newNode(int nodeData) {
		Node tempNode = new Node();
		tempNode.nodeData = nodeData;
		tempNode.leftNode = null;
		tempNode.rightNode = null;

		return tempNode;

	}

	public Node insert(Node root, int key) {
		if (root == null) {
			return newNode(key);

		}

		if (key < root.nodeData) {
			root.leftNode = insert(root.leftNode, key);

		} else {
			root.rightNode = insert(root.rightNode, key);
		}
		return root;

	}

	public boolean findPair(Node root, int sum, Set<Integer> set) {
		if (root == null) {
			return false;

		}

		if (findPair(root.leftNode, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.nodeData)) {
			System.out.println("\n Pair is found: (" + (sum - root.nodeData) + "," + root.nodeData + ")");
			return true;
		} else {
			set.add(root.nodeData);
		}
		return findPair(root.rightNode, sum, set);
	}

	public void findPairWithGivenSum(Node root, int sum) {
	Set<Integer> set = new HashSet<Integer>();

		if (!findPair(root, sum, set)) {
			System.out.println("\n Pair Doesnot Exist");

		}
	}
}

