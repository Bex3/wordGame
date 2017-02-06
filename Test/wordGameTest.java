import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by bearden-tellez on 2/3/17.
 */
public class wordGameTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void correctAnswer() throws Exception {
        wordGame newWordGame = new wordGame();
        newWordGame.addRounds();
        String userOption = "colors";
        assertTrue(newWordGame.playARound((newWordGame.totalRounds.get(0)) , userOption).complete);
    }

    @Test
    public void wrongAnswer() throws Exception{
        wordGame newWordGame = new wordGame();
        newWordGame.addRounds();
        String userOption = "chance";
        assertFalse(newWordGame.playARound((newWordGame.totalRounds.get(0)) ,userOption).complete);
    }

    @Test
    public void hint() throws Exception{
        wordGame newWordGame = new wordGame();
        newWordGame.addRounds();
        String userOption = "Falcons";
        assertEquals("You use these to paint or draw with", newWordGame.playARound((newWordGame.totalRounds.get(0)) , userOption).gameResponse);
    }
}
