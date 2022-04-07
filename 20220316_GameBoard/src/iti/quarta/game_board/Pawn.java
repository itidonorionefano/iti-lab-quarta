package iti.quarta.game_board;

import iti.quarta.game_board.enums.Color;
import iti.quarta.game_board.enums.PieceType;

public class Pawn extends Piece {

	private final PieceType pieceType;
	
	public Pawn(Color color) {
		super(color);
		this.pieceType = PieceType.PAWN;
	}

	@Override
	public PieceType getPieceType() {
		return pieceType;
	}
	
	@Override
    public String toString() {
        return "P";
    }

}
