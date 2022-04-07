package iti.quarta.game_board;

import iti.quarta.game_board.enums.Color;
import iti.quarta.game_board.enums.PieceType;

public abstract class Piece {
	private final Color color;
	
	public Piece(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public abstract PieceType getPieceType();
}
