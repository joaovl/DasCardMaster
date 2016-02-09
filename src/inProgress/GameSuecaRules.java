package inProgress;

import inProgress.IRules;

/**
 * Created by Joao on 05/02/2016.
 */
public class GameSuecaRules implements IRules {

    static final String DESCRIPTION = "This is rules for Sueca!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}