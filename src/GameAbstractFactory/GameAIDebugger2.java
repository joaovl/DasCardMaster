package GameAbstractFactory;

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

        //show what we created:
        List<Integer> player1 = player.subList(0, 10);
        List<Integer> player2 = player.subList(10, 20);
        List<Integer> player3 = player.subList(20, 30);
        List<Integer> player4 = player.subList(30, 40);

        //Start playing
        int teamA = 0, teamB = 0;
        int cardHumaUser = 0 ,tempHumanValue = 0;

        for( int i = 0; i < 10; i++) {
//            for (int j = 0; j <= MAX_TEAMS; j++) {

                //Ask user to pick a card
                System.out.println("Which card would you like to play? (select Position 0 - 9 )");
                //List cards
                System.out.println(player1);
                cardHumaUser = Integer.parseInt(user_input.next());


                //Rule Valid input
                while ((cardHumaUser < 0) || (cardHumaUser > 9)) {
                    System.out.println("You cannot select an invalid position \n" +
                            " (select Position 0 - 9 )");
                    System.out.println(player1);
                    cardHumaUser = Integer.parseInt(user_input.next());
                }

                //Rule Valid value in array
                // It was not used before
                while (tempHumanValue == 0) {
                    System.out.println("You selected an invalid card");
                    cardHumaUser = Integer.parseInt(user_input.next());
                    tempHumanValue = player1.get(cardHumaUser);
                }

                tempHumanValue = player1.get(cardHumaUser);

                System.out.println("card Selected is : " + tempHumanValue);
                // Selected card is added to the end of List.
                // It is possible to list last play buy searching for last positions


                // TODO - I need to create a valid sublist capable of adding values
                // and able to read them after that.
                //player1.add(cardHumaUser, 0);


                if ((player1.get(i) + player3.get(i)) < (player2.get(i) + player4.get(i))) {
                    teamB = teamB + 2;
                } else if ((player1.get(i) + player3.get(i)) > (player2.get(i) + player4.get(i))) {
                    teamA = teamA + 2;
                } else {
                    teamA = teamA++;
                    teamB = teamB++;
                }
//            }
        }
        List<Integer> results = new ArrayList<>(MAX_TEAMS + 1);

        results.add(teamA);
        results.add(teamB);

        return results;
    }

    // Ask human player to play


    //AI selects card to be played


    /*constrains:
    I need to



    */


}

