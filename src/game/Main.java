package game;

import game.Player.PlayerBuilder;
import game.GameEngine.GameBuilder;
import game.Login;

import java.util.Scanner;

public class Main {


	public static void main (String[] args){
		
		
		
		Scanner user_input = new Scanner( System.in );
		String user_name, saveStringGameSelection, humanStringUsers;
		int saveGameSelection, humanUsers;
		
		System.out.println("Insert your name");
		user_name = user_input.next( );
		public checkLogin(String user_name,String user_name);
		
		
		//String name;
		System.out.println("Hi" + user_name + " which game would you like to start?");

		//TODO - List games available
		System.out.println("List of Available Games:" + "\n"
				+ "\t" + "1 - Sueca"+ "\n"
				+ "\t" + "2 - BlackJak");
		saveStringGameSelection = user_input.next( );
		saveGameSelection = Integer.parseInt(saveStringGameSelection);


		//list of players is return from game
		System.out.println("Number of Human Users");
		humanStringUsers = user_input.next( );
		humanUsers = Integer.parseInt(humanStringUsers);
		
		
		if (humanUsers == 1){
			System.out.println("\n 1 Human User Selected");

		    PlayerBuilder human = new PlayerBuilder(PlayerType.HUMAN, user_name);
		    PlayerBuilder Automated1 = new PlayerBuilder(PlayerType.AUTOMATED, "Bad1");
		    PlayerBuilder Automated2 = new PlayerBuilder(PlayerType.AUTOMATED, "Bad2");
		    PlayerBuilder Automated3 = new PlayerBuilder(PlayerType.AUTOMATED, "Bad3");
		    System.out.println("\n Your opponents are Bad1, Bad2 and Bad3");
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
