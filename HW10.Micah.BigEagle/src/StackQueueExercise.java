
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Inclass exercise: Stacks and Queues
 * 
 * @author DT Output
 * 
 *         Before modification [3, 5, 2, 2] After stutter operation [3, 3, 5, 5,
 *         2, 2, 2, 2] After mirror operation [3, 3, 5, 5, 2, 2, 2, 2, 2, 2, 2,
 *         2, 5, 5, 3, 3]
 */

public class StackQueueExercise {
	/**
	 * Stutter replaces each item in the queue with two copies of itself [a b c]
	 * becomes [a a b b c c]
	 * 
	 * @param inputQueue The queue to be stuttered
	 */
	public static void stutter(Queue<Integer> inputQueue) {
		for (int i = 0; i < 3; i++) {
			
		}
	}

	/**
	 * Mirror method takes in a queue and populates it with the original queue + the
	 * mirror image of itself [a b c] should become [a b c c b a]
	 * 
	 * @param inputQueue The queue to be mirrored
	 */
	public static void mirror(Queue<Integer> inputQueue) {

	}

	/**
	 * Main method
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		int[] input = { 3, 5, 2, 2 };
		Queue<Integer> inputQueue = new LinkedList<Integer>();

		for (int i = 0; i < input.length; i++)
			inputQueue.add(input[i]);
		System.out.println("Before modification");
		System.out.println(inputQueue); // Should be [3, 5, 2, 2]
		stutter(inputQueue);
		System.out.println("After stutter operation");
		System.out.println(inputQueue); // Should be [3, 3, 5, 5, 2, 2, 2, 2]
		mirror(inputQueue);
		System.out.println("After mirror operation");
		System.out.println(inputQueue);// Should be [3, 3, 5, 5, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 3, 3]
	}
}
