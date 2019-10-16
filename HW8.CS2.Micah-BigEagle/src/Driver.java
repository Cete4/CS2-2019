import java.util.Scanner;

//Drives things like uber but code
//Comment out above when it stops being funny 
public class Driver {
	public static void main(String[] args) {

		// TODO JAVADOC
		boolean grac = true;

		// TODO JAVADOC
		LinkedList list = new LinkedList();

		// TODO JAVADOC
		while (grac) {
			System.out.println("1: Add 2: Delete 3: Quit");

			Scanner input = new Scanner(System.in);
			input.nextLine();
			int option = input.nextInt();
			switch (option) {

			case 1:
				System.out.println("Please enter a string");
				String str = input.next();
				input.next();
				//list.addItem(str);
				break;

			case 2:
				break;

			case 3:
				break;

			}
			input.close();
		}
	}

}
