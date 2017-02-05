/**
 * Created by bearden-tellez on 2/4/17.
 */
public class TestingPackage {
    boolean complete;
    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getGameResponse() {
        return gameResponse;
    }

    public void setGameResponse(String gameResponse) {
        this.gameResponse = gameResponse;
    }

    String gameResponse;

    public TestingPackage(boolean complete, String gameResponse) {
        this.complete = complete;
        this.gameResponse = gameResponse;
    }

    public TestingPackage() {
    }
}
