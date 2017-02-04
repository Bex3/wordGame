import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        newWordGame.gameFunction();
        
    }

    @Test
    public void wrongAnswer() throws Exception{

    }
}
