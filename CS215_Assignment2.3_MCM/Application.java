
/**
 * This application will create a queue of costumers that will enqueue, dequeue, and print the list of the queue
 * @author Matt
 *
 */
public class Application {

	/**
	 * This is the main method that will call the queue class to create a new queue, add and remove customers from the queue
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		
		Queue<String> queue = new Queue<>();
		
		queue.enqueue("Bill");
		System.out.println();
		queue.enqueue("Alice");
		System.out.println();
		queue.enqueue("Bob");
		System.out.println();
		
		queue.dequeue();
		System.out.println();
		
		queue.enqueue("Jane");
		System.out.println();
		queue.enqueue("Hamad");
		System.out.println();
		
		queue.dequeue();
		System.out.println();
		queue.dequeue();
		System.out.println();
		
		queue.enqueue("Jim");
		System.out.println();
		
		queue.dequeue();
		System.out.println();
		queue.dequeue();
		System.out.println();
		queue.dequeue();		
		System.out.println();
		queue.dequeue();


		
	}//end main
	
		
}//end class