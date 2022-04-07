package iti.quarta.game_board;

import java.util.HashMap;

import iti.quarta.game_board.enums.Color;
import iti.quarta.game_board.utils.Pair;

public final class GameBoard {
	public static final int SIZE_X = 8;
	public static final int SIZE_Y = 8;
	
	private final HashMap<Pair<Integer>, Block> blocks = new HashMap<>();
	private final int sizeX;
	private final int sizeY;
	
	public GameBoard(int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		boolean isBlack = true;
		for(int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {
				if (isBlack) {
					blocks.put(new Pair<>(i, j), new Block(Color.BLACK));
				} else {
					blocks.put(new Pair<>(i, j), new Block(Color.WHITE));
				}
				isBlack = !isBlack;
			}
			isBlack = !isBlack;
		}
	}
	
	public GameBoard() {
		this(SIZE_X, SIZE_Y);
	}
	
	public GameBoard(int size) {
		this(size, size);
	}
	
	public Block getBlock(Pair<Integer> location) {
		return blocks.get(location);
	}
	
	public String printBoard() {
        String text = "";
        for(int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                if (blocks.get(new Pair<>(i, j)).getPiece().isPresent()) {
                    if (blocks.get(new Pair<>(i, j)).getPiece().get().getColor() == Color.WHITE) {
                        text += "|1" + blocks.get(new Pair<>(i, j)).getPiece().get();
                    } else {
                        text += "|0" + blocks.get(new Pair<>(i, j)).getPiece().get();
                    }
                } else {
                    text += "| ";
                }
            }
            text += "|\n";
        }
        return text;
    }
	
}
