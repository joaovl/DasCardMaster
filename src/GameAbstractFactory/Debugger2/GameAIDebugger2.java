package GameAbstractFactory.Debugger2;

import GameAbstractFactory.IAI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Joao on 08/02/2016.
 */
public class GameAIDebugger2 implements IAI {

    private static final int MAX_TEAMS     = 2;

    public String getGameAI() {
        return "AI for debugger2 game";
    }


    public List<Integer> playGameDebugger(List<Integer> player){
        Scanner user_input = new Scanner( System.in );

        //TODO - This is completly wrong here.
        //It is required to implement this in PLayer Class
        List<Integer> player1 = new ArrayList<>(player.subList(0, 10));
        List<Integer> player2 = new ArrayList<>(player.subList(10, 20));
        List<Integer> player3 = new ArrayList<>(player.subList(20, 30));
        List<Integer> player4 = new ArrayList<>(player.subList(30, 40));

        //Start playing
        int teamA = 0, teamB = 0;
        int cardHumanUser = 0 ,tempHumanValue = 0;

        for( int i = 0; i < 10; i++) {

            //Ask user to pick a card
            System.out.println("Which card would you like to play? (select Position 0 - 9 )");
            //List cards
            System.out.println(player1);
            cardHumanUser = Integer.parseInt(user_input.next());


            //TODO - This is a Rule Validation input
            while ((cardHumanUser < 0) || (cardHumanUser > 9)) {
                System.out.println("You cannot select an invalid position \n" +
                        " (select Position 0 - 9 )");
                System.out.println(player1);
                cardHumanUser = Integer.parseInt(user_input.next());
            }

            tempHumanValue = player1.get(cardHumanUser);

            //TODO - This is a Rule Validation value
            // It was not used before
            while (tempHumanValue == 0) {
                System.out.println("You selected an invalid card");
                cardHumanUser = Integer.parseInt(user_input.next());
                tempHumanValue = player1.get(cardHumanUser);
            }

            System.out.println("card Selected is : " + tempHumanValue);

            player1.set(cardHumanUser, 0);


            if ((tempHumanValue + player3.get(i)) < (player2.get(i) + player4.get(i))) {
                teamB = teamB + 2;
            } else if ((tempHumanValue + player3.get(i)) > (player2.get(i) + player4.get(i))) {
                teamA = teamA + 2;
            } else {
                teamA = teamA++;
                teamB = teamB++;
            }
        }
        List<Integer> results = new ArrayList<>(MAX_TEAMS + 1);

        results.add(teamA);
        results.add(teamB);

        return results;
    }
}

