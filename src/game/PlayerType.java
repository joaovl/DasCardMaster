package game;

public enum PlayerType {
	HUMAN, MACHINE;
	@Override
	public String toString() {
	return name().toLowerCase();
	}
	
}