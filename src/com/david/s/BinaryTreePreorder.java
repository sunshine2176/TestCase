package com.david.s;


public class BinaryTreePreorder {

	public static void preorder(BinaryTree root){
		if(root != null){
		System.out.println(root.data+"-");
		preorder(root.left);
		preorder(root.right);
		}
	}
	
	public static void inorder(BinaryTree root){
		if(root != null){
			inorder(root.left);
			System.out.println(root.data+"--");
			inorder(root.right);
		}
	}
	
	public static void postorder(BinaryTree root){
		if(root != null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data+"---");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] array = {12,76,35,22,16,48,90,46,9,40};
		BinaryTree root = new BinaryTree(array[0]);
		for (int i = 1; i < array.length; i++) {
			root.insert(root, array[i]);
		}
		System.out.println("先序");
		preorder(root);
		System.out.println("中序");
		inorder(root);
		System.out.println("后序");
		postorder(root);
	}

}
