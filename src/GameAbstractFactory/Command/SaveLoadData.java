package GameAbstractFactory.Command;

/**
 * Created by Joao on 16/02/2016.
 */
public class SaveLoadData {

    public static final int LIST_LAST_GAMES_RESULTS = 10;
    public static final int LIST_ACTUAL_GAME_RESULTS = 10;


    public SaveLoadData() {
        //Save data;
    }

    public String getListLastGamesResults() {
        return "list of games played";
    }

    public String setListActualGameResults() {
        return "List valid plays during actual game";
    }

    public String saveData() {
        return "Data was saved in database";
    }


}