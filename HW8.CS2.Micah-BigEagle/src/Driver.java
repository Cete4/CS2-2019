import java.util.Scanner;

/**
 * Main that runs the interaction with the user
 * 
 * @author Micah BigEagle
 *
 */
public class Driver {
	public static void main(String[] args) {

		/*
		 * grac a boolean that tracks whether or not the loop should continue
		 */
		boolean grac = true;
		Scanner input = new Scanner(System.in);

		/*
		 * Create a list to add items to in the loop
		 */
		LinkedList list = new LinkedList();

		/*
		 * Loop that will continue until the user asks it to stop
		 */
		while (grac) {
			try {
				try {
					System.out.println("Please select an option.");
					System.out.println("1: Add 2: Delete 3: Quit");
					switch (input.nextInt()) {

					case 1:
						input.nextLine();
						System.out.println("Please enter a string");
						list.addItem(input.nextLine());
						System.out.println("List size: " + list.getSize());
						System.out.println(list + "\n");
						break;

					case 2:
						input.nextLine();
						System.out.println("Please enter a string");
						list.deleteItem(input.nextLine());
						System.out.println("List size: " + list.getSize());
						System.out.println(list + "\n");
						break;

					case 3:
						grac = false;
						break;

					}
				} catch (NullPointerException npe) {
					// Catches null pointers if one is over looked and gets into the code doesnt
					// change the anything and just does nothing and resets the loop so that the
					// user doesnt notice any change
				}
			} catch (Exception e) {
				// Catches and prints releveant error messages so the user can understand why
				// something didnt work
				System.out.println(e.getMessage());
			}
		}
		input.close();
	}

}
