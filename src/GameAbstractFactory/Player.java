package GameAbstractFactory;

import java.util.Scanner;

/**
 * Created by Joao on 12/02/2016.
 */
public class Player {

    private int AskNumberOfHumanPLayers(){
        String humanStringUsers, user_name;
        int humanUsers = 0;

        Scanner user_input = new Scanner(System.in);
        System.out.println("Insert your name");
        user_name = user_input.next();

        //THIS requires to be more generic, it is used just one Human player.
        System.out.println("Number of Human Users");
        humanStringUsers = user_input.next();
        humanUsers = Integer.parseInt(humanStringUsers);
        return humanUsers;

    }


    public Player PlayerCreator(Boolean soloGame) {

        if (soloGame == true ) {
            //Return number of players

        }else {

            // TODO - Ask for registed players:


            //AiPlayers depends on RULES for each game
            int humanPlayer = AskNumberOfHumanPLayers();

            //From Rules I create = ( Number of players - Human PLayers )
            //int AiPlayers =

            if (humanPlayer == 1) {
                System.out.println("\n 1 Human User was Selected \n");

            } else {
                System.out.println("\n" + humanPlayer + " Human User Selected");
                //Create XX Human User
                //Create YY AI users
            }
        }
        return null;
    }
}
