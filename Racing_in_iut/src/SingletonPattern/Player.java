package SingletonPattern;

public class Player {
    private static Player instance;
    private String playerName;

    private Player() {
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Player();
        }
        return instance;
    }

    public boolean setPlayerName(String playerName) {
        if (this.playerName == null) {
            this.playerName = playerName;
            return true; // Player name set successfully
        } else {
            return false; // Player instance already has a name
        }
    }

    public String getPlayerName() {
        return playerName;
    }
}