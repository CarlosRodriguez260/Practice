public class TreeNode<K, V> implements Node<K,V> {
	private Object key;
	private Object value;
	private TreeNode<K,V> right;
	private TreeNode<K,V> left;
	
	public TreeNode()
	{
		this.key = null;
		this.value = null;
		this.right = null;
		this.left = null;
	}
	
	public Object getKey()
	{
		return this.key;
	}
	
	public Object getValue()
	{
		return this.value;
	}
	
	public void setKey(Object key)
	{
		this.key = key;
	}
	
	public void setValue(Object value)
	{
		this.value = value;
	}
	
	public TreeNode<K,V> getRight()
	{
		return this.right;
	}
	
	public TreeNode<K,V> getLeft()
	{
		return this.left;
	}
	
	public void setRight(TreeNode<K,V> right)
	{
		this.right = right;
	}
	
	public void setLeft(TreeNode<K,V> left)
	{
		this.left = left;
	}
}
