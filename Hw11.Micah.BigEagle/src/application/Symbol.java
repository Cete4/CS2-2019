package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Class that is an object called symbol
 * 
 * @author Micah BigEagle
 *
 */
public class Symbol {

	/** This string gets built as the file is read in */
	private String originalText;

	/**
	 * The line number that the symbol object was found on
	 */
	private int lineNumber;

	/**
	 * The symbol that was found in the text file
	 */
	private String symbol;

	/**
	 * Method that returns the line number that the object was found on
	 * 
	 * @return the line number which is an int
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * The symbol that is the main point of the object
	 * 
	 * @return A string that is either (, {, [
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * A method that receives a positive integer
	 * 
	 * @param lineNumber A positive integer
	 */
	private void setLineNumber(int lineNumber) {
		if (lineNumber > 0) {
			this.lineNumber = lineNumber;
		}
	}

	/**
	 * 
	 * @param symbol
	 */
	private void setSymbol(String symbol) {
		if (symbol != null && !(symbol.equals(""))) {
			this.symbol = symbol;
		}
	}

	/**
	 * Method that returns text that is all of the different symbols of a text file
	 * together
	 * 
	 * @return String filled out with the values of a text file
	 */
	public String getOriginalText() {
		return originalText;
	}

	@Override
	public String toString() {
		return this.symbol + " on line " + this.lineNumber;
	}

	/**
	 * Constructor
	 * 
	 * @param lineNumber
	 * @param symbol
	 */
	public Symbol(int lineNumber, String symbol) {
		setSymbol(symbol);
		setLineNumber(lineNumber);
		this.originalText = "";
	}

	/**
	 * This method adds any symbols to a string named originalText which can be used
	 * to see what opening and closing symbols were used in the text file
	 * 
	 * @param inputFile The file to be parsed
	 */
	public void symbolDetector(File inputFile) {
		Scanner input;
		Stack<Symbol> cymbals = new Stack<Symbol>();

		// Boolean that will break the while loop if an error is encountered
		boolean grac = true;
		try {
			input = new Scanner(inputFile);

			// Reading in one line at a time
			int lineNumber = 1;
			while (input.hasNextLine() && grac == true) {
				// Read in a whole line
				String line = input.nextLine();
				// Iterate a character at a time
				for (int i = 0; i < line.length(); i++) {
					String str = Character.toString(line.charAt(i));

					// for any opening symbol add it to the stack
					if (str.equals("(")) {
						cymbals.add(new Symbol(lineNumber, "("));
					} else if (str.equals("[")) {
						cymbals.add(new Symbol(lineNumber, "["));
					} else if (str.equals("{")) {
						cymbals.add(new Symbol(lineNumber, "{"));

						// for any closing symbol check if it matches the top of the stack if not list
						// the error and break out of the method
					} else if (str.equals("}")) {
						if (cymbals.peek().getSymbol().equals("{")) {
							originalText += cymbals.pop().toString() + " matches with } on line " + lineNumber + "\n";
						} else {
							originalText += cymbals.pop().toString() + " doesn't match with " + str + " on line "
									+ lineNumber;
							grac = false;
							break;
						}
					} else if (str.equals(")")) {
						if (cymbals.peek().getSymbol().equals("(")) {
							originalText += cymbals.pop().toString() + " matches with ) on line " + lineNumber + "\n";
						} else {
							originalText += cymbals.pop().toString() + " doesn't match with " + str + " on line "
									+ lineNumber;
							grac = false;
							break;
						}
					} else if (str.equals("]")) {
						if (cymbals.peek().getSymbol().equals("[")) {
							originalText += cymbals.pop().toString() + " matches with ] on line " + lineNumber + "\n";
						} else {
							originalText += cymbals.pop().toString() + " doesn't match with " + str + " on line "
									+ lineNumber;
							grac = false;
							break;
						}
					} else {
						// Do nothing because that's a whole notha project
					}
				}

				lineNumber++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
