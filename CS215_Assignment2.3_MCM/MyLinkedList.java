/**
 * This class models a linked list in which each node has a pointer
 * to the node after it, except the tail which does not have a node after. 
 * @author Matt
 *
 * @param <T>
 */
public class MyLinkedList<T> {
	
	Node <T> head;
	int length;
	Node<T> tail;
	
	/**
	 * The constructor for this object initializes the list such that
	 * it is empty (no head or tail) generic node.
	 */
	public MyLinkedList()
	{
		head=null;
		length=0;
		tail=head;
	}
	
	/**
	 * Method to see if there are any elements in the list.
	 * @return boolean true/false
	 */
	public boolean isEmpty()
	{
		if (head==null) { return true;}
		else return false;
	}
	
	/**
	 * This method returns the head generic node of the list from which
	 * you can traverse the entire by following node links.
	 * @return head
	 */
	public Node <T> getList()
	{
		return head;
	}
	
	/**
	 * This method adds a new generic node to the list. It first checks to see
	 * if the list is empty. If so, it sets the head and the tail nodes
	 * to the node passed in. If the list is not empty it places the node
	 * at the end of the list and updates the pointers in the tail. This
	 * implementation does not support adding entries to the middle
	 * of the list.
	 * @param aNode
	 */
	public void addNode(Node <T> aNode)
	{
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> myList=new MyLinkedList<>();
		
		Node<Integer> aNode=new Node<>();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node<Integer>();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node<Integer> tempnode=myList.getList();
			do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.nextNode;
		} while (tempnode!=null);
		*/	
		

}