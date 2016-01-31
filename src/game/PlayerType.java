package game;

public enum PlayerType {
	HUMAN, AUTOMATED;
	@Override
	public String toString() {
	return name().toLowerCase();
	}
}