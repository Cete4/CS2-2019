package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

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

}
