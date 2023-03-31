public class BinaryTree{
	private TreeNode<?,?> root;
	//The start of the tree or subtree.
	
	private int currentSize;
	//Tracks amount of nodes in the tree with values.
	
	
	public BinaryTree(TreeNode<?, ?> root)
	{
		this.root = root;
		currentSize = 1;
		this.updateSize();
	}
	
	public BinaryTree()
	{
		this.root = null;
		currentSize = 0;
	}
	
	public int size()
	{
		return this.currentSize;
	}
	
	public void updateSize()
	{
		if(this.root.getLeft()!=null)
		{
			currentSize++;
			updateSizeHelper(this.root.getLeft());
		}
		
		if(this.root.getRight()!=null)
		{
			currentSize++;
			updateSizeHelper(this.root.getRight());
		}
	}
	
	public void updateSizeHelper(TreeNode<?, ?> root)
	{
		if(root.getLeft()!=null)
		{
			currentSize++;
			updateSizeHelper(root.getLeft());
		}
		
		if(root.getRight()!=null)
		{
			currentSize++;
			updateSizeHelper(root.getRight());
		}
	}
	
	public boolean add(Object value)
	{
		boolean added = false;
		if(this.root.getValue().getClass()==value.getClass())
		{
			System.out.println("Object types match!");
			added = addHelper(value, this.root);
		}
		return added;
	}
	
	public boolean addHelper(Object value, TreeNode<?, ?> root)
	{
		//Implement a method that will add any value to the binary tree. Assume that the value = key;
	}
	
	public static void main(String[] args)
	{
		TreeNode<Integer, Integer> testerR = new TreeNode<Integer, Integer>();
		testerR.setKey(1);
		testerR.setValue(1);
		
		TreeNode<Integer, Integer> testerL = new TreeNode<Integer, Integer>();
		testerL.setKey(3);
		testerL.setValue(3);
		
		TreeNode<Integer, Integer> tester = new TreeNode<Integer, Integer>();
		tester.setKey(2);
		tester.setValue(2);
		tester.setRight(testerR);
		tester.setLeft(testerL);
		
		BinaryTree test = new BinaryTree(tester);
		System.out.println(test.size());
		test.add(1);
	}
}
