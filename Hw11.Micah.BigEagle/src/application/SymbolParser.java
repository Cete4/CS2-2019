package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SymbolParser {

	/** This string gets built as the file is read in */
	private String originalText;

	/** This string gets built with all matching pairs */
	private String symbolMatchingText;

	/** Constructor */
	public SymbolParser() {
		originalText = "";
		symbolMatchingText = "";
	}

	/**
	 * This method gets called when a new file is opened
	 * 
	 * @param inputFile The file that has to be parsed
	 */
	public void parseFile(File inputFile) {
		Scanner input;
		try {
			input = new Scanner(inputFile);

			// Reading in one line at a time
			int lineNumber = 1;
			while (input.hasNextLine()) {
				// Read in a whole line
				String line = input.nextLine();
				// Iterate a character at a time
				for (int i = 0; i < line.length(); i++) {
					originalText = originalText + "\n" + lineNumber + ": " + line.charAt(i);
				}
				lineNumber++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Returns the string to display in the left text area
	 * 
	 * @return The string to be printed
	 */
	public String getOriginalString() {
		return originalText;

	}

	/**
	 * Returns the string to display in the rights text area
	 * 
	 * @return The string to be printed
	 */
	public String getSymbolMatchingString() {
		return symbolMatchingText;

	}

	// TODO JAVADOC
	public void codeParse(File inputFile) {

		// TODO JAVADOC or create a method
		boolean inBlockComment = false;

		// TODO JAVADOC or create a method
		boolean inString = false;

		Scanner input;
		try {
			input = new Scanner(inputFile);

			// Reading in one line at a time
			int lineNumber = 1;
			while (input.hasNextLine()) {
				// Read in a whole line
				String line = input.nextLine();
				// Iterate a character at a time
				for (int i = 0; i < line.length(); i++) {
					lineNumber++;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// TODO JAVADOC
	public int commentParse(File inputFile, int lineNumber, int charNumber) {
		Scanner input;
		try {
			// Read in a whole line
			input = new Scanner(inputFile);
			String line = input.nextLine();

			// Iterate through the file until you get the line where the comment is
			for (int i = 1; i < lineNumber; i++) {
				line = input.nextLine();
			}

			// Iterate through the line until you get to where the comment begins
			for (int i = charNumber; i < line.length(); i++) {
				this.originalText += line.charAt(i);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lineNumber++;

	}

	// TODO JAVADOC
	public int blockCommentParse(File inputFile, int lineNumber, int charNumber) {
		Scanner input;
		try {
			// Read in a whole line
			input = new Scanner(inputFile);
			String line = input.nextLine();

			// Iterate through the file until you get the line where the comment is
			for (int i = 1; i < lineNumber; i++) {
				line = input.nextLine();
			}

			while (input.hasNextLine()) {
				// Iterate through the line until you get to where the comment begins
				for (int i = charNumber; i < line.length(); i++) {
					this.originalText += line.charAt(i);
				}
				line = input.nextLine();
				lineNumber++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lineNumber++;

	}

}
