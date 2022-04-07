package iti.quarta.game_board;

import java.util.Optional;

import iti.quarta.game_board.enums.Color;

public class Block {
	private final Color color;
	private Piece piece;
	
	public Block(Color color) {
		this(color, null);
	}
	
	public Block(Color color, Piece piece) {
		this.color = color;
		this.piece = piece;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Optional<Piece> getPiece() {
		return Optional.ofNullable(piece);
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
}
