
public class AVLTree <T extends Comparable<T>>
{
	private AVLNode<T> root;
	
	public AVLTree()
	{
		setRoot(null);
	}
	
	public AVLNode<T> getRoot()
	{
		return root;
	}
	
	public void setRoot(AVLNode<T> root)
	{
		this.root = root;
	}
	
	public void add (T element) throws Exception
	{
		root = add(root, element);
	}
	
	private AVLNode<T> add(AVLNode<T> root, T element) throws Exception
	{
		if( getRoot() == null ) {
			return new AVLNode<T> (element);
		} else if (element.compareTo(root.getElement()) == 0) {
			throw new Exception("Both elements are equeals.");
		} else if (element.compareTo(root.getElement()) < 0) {
			//root.getLeft().setElement(element);
			root.setLeft(add(root.getLeft(), element));
		} else if (element.compareTo(root.getElement()) > 0) {
			//root.getRight().setElement(element);
			root.setRight(add(root.getRight(), element));
		} return getRoot(); //.updateHeight();
	}
	
	/**
	 * Public toString method.
	 * 
	 * @return toString private and recursive method
	 */
	public String toString()
	{
		return toString(root);
	}
	
	/**
	 * toString private recursive method.
	 * 
	 * @param root
	 * @return null if root = null. Otherwise: "root+left+right".
	 */
	private String toString(AVLNode<T> root)
	{
		if( getRoot() == null ) { 
			return "-";
		} else {
			return root.toString() + toString(root.getLeft()) + toString(root.getRight());
		}
	}

}
