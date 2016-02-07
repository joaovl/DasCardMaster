package GameAbstractFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joao on 07/02/2016.
 */
public class GameAIDebugger implements IAI {

    private static final int MAX_TEAMS     = 2;

    public String getGameAI() {
        return "AI for Sueca game";
    }

    public List<Integer> playGameDebugger(List<Integer> test){
        //show what we created:
        List<Integer> player1 = test.subList(0, 10);
        List<Integer> player2 = test.subList(10, 20);
        List<Integer> player3 = test.subList(20, 30);
        List<Integer> player4 = test.subList(30, 40);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);

        //Start playing
        int teamA = 0, teamB = 0;

        for( int i = 0; i < 10; i++) {
            if ((player1.get(i) + player3.get(i)) < (player2.get(i) + player4.get(i))) {
                teamB = teamB + 2;
            }

            else if ((player1.get(i) + player3.get(i)) > (player2.get(i) + player4.get(i))) {
                teamA = teamA + 2;
            }

            else {
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
