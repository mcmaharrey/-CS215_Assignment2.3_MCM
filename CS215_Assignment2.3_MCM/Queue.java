/**
 * This class creates a queue where an object can be enqueued and dequeued
 * @author Matt
 *
 * @param <T>
 */
public class Queue<T> {
	
	private MyLinkedList<T> list;
	
	/**
	 * Creates a new queue with an empty MyLinkedList
	 */
	public Queue() {
		
		list = new MyLinkedList<>();
	}
	
	/**
	 * Adds a new item to the queue
	 * @param item the item being added to the queue
	 */
	public void enqueue(T item) {
		
		Node<T> newNode = new Node<>();
		newNode.setData(item);
		
		list.addNode(newNode);
		
		System.out.println(item + " arrives");
		System.out.println(toString());
	}
	
	/**
	 * Removes the first item in the queue
	 * @return the item at the front of the queue or null if the queue is empty
	 */
	public T dequeue() {
		
		Node<T> frontNode = list.getList();
		
		if (frontNode != null) {
			list.head = frontNode.nextNode;
			System.out.println(frontNode.getData() + " is served.");
			System.out.println(toString());
			return frontNode.getData();
			
		}
		System.out.println("No more customers in queue.");
		return null;
	}
		
	/**
	 * Checks if the queue is empty
	 * @return true if the queue is empty, false if not
	 */
	public boolean isEmpty() {
			
		return list.isEmpty();
	}
	
	/**
	 * Returns the number of items in the queue
	 * @return the number of items in the queue
	 */
	public int size() {
			
		return list.length;
	}
	
	/**
	 * Returns a string that lists all the items currently in the queue
	 * @return String containg all items currenlty in the queue
	 */
	public String toString() {
		Node<T> currentNode = list.getList();
		StringBuilder sb = new StringBuilder();
		sb.append("Queue: ");
		while (currentNode != null) {
			sb.append(currentNode.getData()).append(" ");
			currentNode = currentNode.nextNode;
		}
		return sb.toString();
	}
	
}//end class
