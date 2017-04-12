import java.util.ArrayList;
import java.util.List;

/**
 * Created by bearden-tellez on 2/3/17.
 */
public class Round {
    String answer;
    String hint;
    ArrayList<String> wordsForRound = new ArrayList<>();


    public ArrayList toString(int index){
    ArrayList returnWords = new String;
    returnWords= wordsForRound.get(index);
    return returnWords;
    }

    public Round() {
    }

    public Round(String word1, String word2, String word3, String hint, String answer){
        this.answer= answer;
        this.hint = hint;
        this.wordsForRound.add(word1);
        this.wordsForRound.add(word2);
        this.wordsForRound.add(word3);
    }

    public Round(String word1, String word2, String word3, String word4, String hint, String answer){
        this.answer= answer;
        this.hint = hint;
        this.wordsForRound.add(word1);
        this.wordsForRound.add(word2);
        this.wordsForRound.add(word3);
        this.wordsForRound.add(word4);
    }
}
