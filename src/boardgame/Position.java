package boardgame;

public class Position {
	public Integer row;
	public Integer column;
	
	public Position(Integer row, Integer column) {
		super();
		this.row = row;
		this.column = column;
	}

	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %d]", row, column);
	}
}
