package application;

// TODO JAVADOC
public class Symbol {

	// TODO JAVADOC
	private int lineNumber;

	// TODO JAVADOC
	private String symbol;

	// TODO JAVADOC
	private int getLineNumber() {
		return lineNumber;
	}

	// TODO JAVADOC
	private String getSymbol() {
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
		return "Symbol [lineNumber=" + lineNumber + ", symbol=" + symbol + "]";
	}

	// TODO JAVADOC
	public Symbol(int lineNumber, String symbol) {
		super();
		this.lineNumber = lineNumber;
		this.symbol = symbol;
	}

}
