package iti.quarta.game_board.utils;

import java.util.Objects;

public class Pair<K> {
	private final K first;
	private final K second;
	
	public Pair(K first, K second) {
		super();
		this.first = first;
		this.second = second;
	}

	public K getFirst() {
		return first;
	}

	public K getSecond() {
		return second;
	}

	@Override
	public int hashCode() {
		return Objects.hash(first, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return Objects.equals(first, other.first) && Objects.equals(second, other.second);
	}
	
}
