package game;

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
   * 
   * The builder class.
   * 
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
}