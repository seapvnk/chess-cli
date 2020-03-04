package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] moves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		int incrementMove = this.getMoveCount() != 0? 0 : 1;
		
		if (getColor() == Color.BLACK) {
			Position p = new Position(0, 0);
			// below
			for (int i = 1; i <= 1 + incrementMove; i++) {
				p.setValues(position.getRow() + i, position.getColumn());
				if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
				}
			}

			// left
			p.setValues(position.getRow() + 1, position.getColumn() - 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				moves[p.getRow()][p.getColumn()] = true;
			}

			// right
			p.setValues(position.getRow() + 1, position.getColumn() + 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				moves[p.getRow()][p.getColumn()] = true;
			}

		} else {
			Position p = new Position(0, 0);
			// above
			for (int i = 1; i <= 1 + incrementMove; i++) {
				p.setValues(position.getRow() - i, position.getColumn());
				if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					moves[p.getRow()][p.getColumn()] = true;
				}
			}

			// left
			p.setValues(position.getRow() - 1, position.getColumn() - 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				moves[p.getRow()][p.getColumn()] = true;
			}

			// right
			p.setValues(position.getRow() - 1, position.getColumn() + 1);
			if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				moves[p.getRow()][p.getColumn()] = true;
			}
		}

		return moves;
	}

	@Override
	public String toString() {
		return "P";
	}
	
}
