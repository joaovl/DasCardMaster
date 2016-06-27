package game;

import java.util.Scanner;

public class Player {

  private final PlayerType playerType;
  private final String name;

  public PlayerType getProfession() {
    return playerType;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append("This is a ")
            .append(playerType)
            .append(" named ")
            .append(name);
    sb.append(".");
    return sb.toString();
  }

  private Player(PlayerBuilder builder) {
    this.playerType = builder.playerTypebuilder;
    this.name = builder.name;
  }


  /**
   * The builder class.
   */
  public static class PlayerBuilder {

    private final PlayerType playerTypebuilder;
    private final String name;

    /**
     * Constructor
     */
    public PlayerBuilder(PlayerType playerType, String name) {
      if (playerType == null || name == null) {
        throw new IllegalArgumentException("profession and name can not be null");
      }
      this.playerTypebuilder = playerType;
      this.name = name;
    }

    public Player build() {
      return new Player(this);
    }
  }

//  private int AskNumberOfHumanPLayers(){
//    String humanStringUsers, user_name;
//    int humanUsers = 0;
//
//    Scanner user_input = new Scanner(System.in);
//    System.out.println("Insert your name");
//    user_name = user_input.next();
//
//    //THIS requires to be more generic, it is used just one Human player.
//    System.out.println("Number of Human Users");
//    humanStringUsers = user_input.next();
//    humanUsers = Integer.parseInt(humanStringUsers);
//    return humanUsers;
//
//  }
//
//
//  public void PlayerCreator(Boolean soloGame) {
//
//    if (soloGame == true ) {
//      //Return number of players
//
//    }else {
//
//      //AiPlayers depends on RULES for each game
//      int humanPlayer = AskNumberOfHumanPLayers();
//
//      //From Rules I create = ( Number of players - Human PLayers )
//      //int AiPlayers =
//
//      if (humanPlayer == 1) {
//        System.out.println("\n 1 Human User was Selected \n");
//
//        Player human = new Player.PlayerBuilder(PlayerType.HUMAN, user_name).build();
//        Player Automated1 = new Player.PlayerBuilder(PlayerType.MACHINE, "Bad1").build();
//        Player Automated2 = new Player.PlayerBuilder(PlayerType.MACHINE, "Bad2").build();
//        Player Automated3 = new Player.PlayerBuilder(PlayerType.MACHINE, "Bad3").build();
//        System.out.println(human + "\n" + Automated1 + "\n" + Automated2 + "\n and " + Automated3);
//      } else {
//        System.out.println("\n" + humanPlayer + " Human User Selected");
//        //Create XX Human User
//        //Create YY AI users
//      }
//    }
}