import java.util.Scanner;

//TODO Insta meme from nate 
//Drives things like uber but code
//Comment out above when it stops being funny 
public class Driver {
	public static void main(String[] args) {

		try {
			// TODO JAVADOC
			boolean grac = true;
			Scanner input = new Scanner(System.in);

			// TODO JAVADOC
			LinkedList list = new LinkedList();

			// TODO JAVADOC
			while (grac) {
				System.out.println("Please select an option.");
				System.out.println("1: Add 2: Delete 3: Quit");
				switch (input.nextInt()) {

				case 1:
					System.out.println("Please enter a string");
					list.addItem(input.next());
					System.out.println("List size: " + list.getSize());
					System.out.println(list);
					break;

				case 2:
					System.out.println("Please enter a string");
					list.deleteItem(input.next());
					System.out.println("List size: " + list.getSize());
					System.out.println(list);
					break;

				case 3:
					grac = false;
					break;

				}
			}
			input.close();
		} catch (

		Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
