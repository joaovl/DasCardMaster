package game;

//There is no advantage to use this builder patter to list games.
//It was not removed because it is required to follow "Enunciado do Projecto" proposal.
public enum AvailableGames {

	  SUECA, BLACKJACK;
	  @Override
	  public String toString() {
		  return name().toLowerCase();
		  }
	  
	  public static void printAvailableGames(){
		  System.out.println("Available games are:"
		  		+ "\n 1 - Sueca"
		  		+ "\n 2 - BlackJack"
		  		+ "\n 3 ..."
				+ "=====================");
	  }
}