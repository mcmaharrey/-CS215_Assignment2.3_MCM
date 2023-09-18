/**
 * This class models a GenericNode object which contains any object. Each
 * node has its internal data (an object) and pointers to the next 
 * node in the list.
 * @author Matt
 *
 * @param <T>
 */
class Node<T>{
	private T data;
	Node<T> nextNode;
	
	/**
	 * Constructor build Node object. Initializes nextNode and data
	 * to null.
	 */
	public Node()
	{
		nextNode=null;
		data=null;
	}
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(T data) {
		this.data=data;
	}
	
	/**
	 * This method returns the data of the object.
	 * @return T (data)
	 */
	public T getData() {
		return this.data;
	}
	
	/**
	 * This method returns itself to the caller.
	 * @return this.node
	 */
	public Node<T> getNode() {
		return this;
	}
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(Node<T> nextNode)
	{
		this.nextNode=nextNode;
	}
	
	
}