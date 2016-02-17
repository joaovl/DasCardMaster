package GameAbstractFactory.Command;

/**
 * Created by maitesin on 17/02/16.
 */
public class MoveForwardOneInTheGameHistory extends MoveForwardInTheGameHistory {
    public MoveForwardOneInTheGameHistory(SaveLoadData saveLoadData) {
        super(saveLoadData, 1);
    }
}
