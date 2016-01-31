package game;

import game.Player.PlayerBuilder;
import game.GameEngine.GameBuilder;

import java.util.Scanner;

public class Main {

	public static void main (String[] args){
		
		Scanner user_input = new Scanner( System.in );
		String user_name, saveStringGameSelection, humanStringUsers;
		int saveGameSelection, humanUsers;
		
		System.out.println("Insert your name");
		user_name = user_input.next( );
		
		
		//String name;
		System.out.println("Hi" + user_name + " which game would you like to start?");

		//TODO - List games available
		System.out.println("List of Available Games:" + "\n"
				+ "\t" + "1 - Sueca"+ "\n"
				+ "\t" + "2 - BlackJak");
		saveStringGameSelection = user_input.next( );
		saveGameSelection = Integer.parseInt(saveStringGameSelection);
		if(saveGameSelection == 1){
			GameBuilder sueca = new GameBuilder(AvailableGames.SUECA, "sueca");
			AbstractGameRules suecaRules = new GameSueca();
			suecaRules.printRules();
		}
		else if (saveGameSelection == 2){
			GameBuilder sueca = new GameBuilder(AvailableGames.BLACKJACK, "blackjack");
		}

		//list of players is return from game
		System.out.println("Number of Human Users");
		humanStringUsers = user_input.next( );
		humanUsers = Integer.parseInt(humanStringUsers);
		
		
		if (humanUsers == 1){
			System.out.println("\n 1 Human User was Selected \n");

		    Player human = new PlayerBuilder(PlayerType.HUMAN, user_name).build();
		    Player Automated1 = new PlayerBuilder(PlayerType.MACHINE, "Bad1").build();
		    Player Automated2 = new PlayerBuilder(PlayerType.MACHINE, "Bad2").build();
		    Player Automated3 = new PlayerBuilder(PlayerType.MACHINE, "Bad3").build();
		    System.out.println(human+ ", your opponents are " +Automated1+ " and "+Automated2+ " and "+Automated3 );
		}
		else{
			System.out.println("\n" + humanUsers + " Human User Selected");
			//Create XX Human User
			//Create YY AI users
		}
		//TODO - Select Game

		System.out.println("Sueca game will start soon, enjoy your expirience");
		int humanUsers1 = Integer.parseInt(humanStringUsers);
	}




}
