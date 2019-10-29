package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

// TODO JAVADOC
public class Symbol {

	/** This string gets built as the file is read in */
	private String originalText;

	// TODO JAVADOC
	private int lineNumber;

	// TODO JAVADOC
	private String symbol;

	// TODO JAVADOC
	public int getLineNumber() {
		return lineNumber;
	}

	// TODO JAVADOC
	public String getSymbol() {
		return symbol;
	}

	// TODO JAVADOC
	private void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	// TODO JAVADOC
	private void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	// TODO JAVADOC
	public String getOriginalText() {
		return originalText;
	}

	@Override
	public String toString() {
		return this.symbol + " on line " + this.lineNumber;
	}

	// TODO JAVADOC
	public Symbol(int lineNumber, String symbol) {
		setSymbol(symbol);
		setLineNumber(lineNumber);
		this.originalText = "";
	}

	// TODO JAVADOC
	public void symbolDetector(File inputFile) {
		Scanner input;
		Stack<Symbol> cymbals = new Stack<Symbol>();

		// TODO JAVADOC
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

					if (str.equals("(")) {
						cymbals.add(new Symbol(lineNumber, "("));
					} else if (str.equals("[")) {
						cymbals.add(new Symbol(lineNumber, "["));
					} else if (str.equals("{")) {
						cymbals.add(new Symbol(lineNumber, "{"));
					} else if (str.equals("}")) {
						if (cymbals.peek().getSymbol().equals("{")) {
							originalText += cymbals.pop().toString() + " matches with } on line " + lineNumber + "\n";
						} else {
							originalText += cymbals.pop().toString() + " doesn't matche with " + str + " on line ";
							grac = false;
							break;
						}
					} else if (str.equals(")")) {
						if (cymbals.peek().getSymbol().equals("(")) {
							originalText += cymbals.pop().toString() + " matches with ) on line " + lineNumber + "\n";
						} else {
							originalText += cymbals.pop().toString() + " doesn't matche with " + str + " on line ";
							grac = false;
							break;
						}
					} else if (str.equals("]")) {
						if (cymbals.peek().getSymbol().equals("[")) {
							originalText += cymbals.pop().toString() + " matches with ] on line " + lineNumber + "\n";
						} else {
							originalText += cymbals.pop().toString() + " doesn't matche with " + str + " on line ";
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
