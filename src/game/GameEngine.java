package game;

public class GameEngine {

  private final AvailableGames gameType;
  private final String name;

  public AvailableGames getGame() {
    return gameType;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();
    sb.append("This is a ")
            .append(gameType)
            .append(" named ")
            .append(name);
    sb.append(".");
    return sb.toString();
  }

  private GameEngine(GameBuilder builder) {
    this.gameType = builder.gameTypebuilder;
    this.name = builder.name;
  }

  /**
   * 
   * The builder class.
   * 
   */
  public static class GameBuilder {

    private final AvailableGames gameTypebuilder;
    private final String name;

    /**
     * Constructor
     */
    public GameBuilder(AvailableGames gameType, String name) {
      if (gameType == null || name == null) {
        throw new IllegalArgumentException("profession and name can not be null");
      }
      this.gameTypebuilder = gameType;
      this.name = name;
    }

    public GameEngine build() {
      return new GameEngine(this);
    }
  }
}