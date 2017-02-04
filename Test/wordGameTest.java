import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
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
        String userOption = "colors";
        assertTrue(newWordGame.gameFunctionUserInput(userOption));
    }

    @Test
    public void wrongAnswer() throws Exception{
        wordGame newWordGame = new wordGame();
        String userOption = "chance";
        assertFalse(newWordGame.gameFunctionUserInput(userOption));
    }
}
