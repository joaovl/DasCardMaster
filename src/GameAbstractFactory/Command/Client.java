package GameAbstractFactory.Command;

/**
 * Created by Joao on 16/02/2016.
 */
public class Client {

    public static void main(String[] args) {
        // Create a radio and its up/down command objects
        //todo Create a Game and their save and load commands
        SaveLoadData saveData = new SaveLoadData();
//        saveData..on();
        Command listActualResults = new ListActualGameResults(saveData);
        Command ListGameResults = new ListLastGamesResults(saveData);
        Command saveDataCommand = new SaveGameResults(saveData);

        //todo Create a login
        // Create an electric window and its up/down command objects
//        ElectricWindow window = new ElectricWindow();
//        Command windowUpCommand = new WindowUpCommand(window);
//        Command windowDownCommand = new WindowDownCommand(window);

//        // Create a objGameEmulator object
        GameEmulator objGameEmulator = new GameEmulator();
        objGameEmulator.setCommands(listActualResults, ListGameResults, saveDataCommand);
        System.out.println("Do What is expected, List games and save ");
        objGameEmulator.listGamesResultsCommand();
        objGameEmulator.listPlaysCommand();
        objGameEmulator.setSaveGameResults();

        System.out.println("Debug option");

    }

}