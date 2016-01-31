package game;

	public class GameBlackjack extends AbstractGameRules{

		@Override
		protected int numberOfGamesPerSession() {
			System.out.println("For BackJack Game 5 games are allowed per session");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected int numberOfValidPlays() {
			System.out.println("It ends when plyers decide to stop or have more than 21 points");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected int maxNumberOfPlayers() {
			System.out.println("Less than 6 players can play this game");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected boolean stopPlayingDurnigSession() {
			System.out.println("It is possible to stop this game in "
					+ "\n" + "the midle of a session without abort it");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		protected boolean specialCardsAllowed() {
			System.out.println("No special card rule is allowed");
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		protected int cardsValue() {
			System.out.println("Each card has their own value");
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		protected boolean gameOrder() {
			System.out.println("This game starts from left to right");
			// TODO Auto-generated method stub
			return false;
		}

		protected int showTotalPoints() {
			System.out.println("Show your total point Expert, Medium or begginer level");
			// TODO Auto-generated method stub
			return 0;
		}

		protected int showSessionPoints() {
			System.out.println("Show session points");
			// TODO Auto-generated method stub
			return 0;
		}

		protected int showActualPoints() {
			System.out.println("Show the number of points in the table at each moment per player");
			// TODO Auto-generated method stub
			return 0;
		}
		

	}
