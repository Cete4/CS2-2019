import java.util.Scanner;

//TODO Insta meme from nate 
//Drives things like uber but code
//Comment out above when it stops being funny 
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

			} catch (

			Exception e) {
				System.out.println(e.getMessage());
			}
		}
		input.close();
	}

}
