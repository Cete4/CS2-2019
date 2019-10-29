package application;

// TODO JAVADOC
public class Symbol {

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

	@Override
	public String toString() {
		return this.symbol + " on line " + this.lineNumber;
	}

	// TODO JAVADOC
	public Symbol(int lineNumber, String symbol) {
		setSymbol(symbol);
		setLineNumber(lineNumber);
	}

}
