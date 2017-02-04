import java.util.ArrayList;

/**
 * Created by bearden-tellez on 2/3/17.
 */
public class Round {
    //round composed of al categories, hint & answer
    String answer;
//    String secondAnswer;
    String hint;
    String word1;
    String word2;
    String word3;
    String word4;
    ArrayList<String> wordsForRound = new ArrayList<>();

    public Round() {
    }

    public Round(String answer, String hint, String word1, String word2, String word3){
        this.answer= answer;
        this.hint = hint;
        this.wordsForRound.add(word1);
        this.wordsForRound.add(word2);
        this.wordsForRound.add(word3);
    }

    public Round(String answer, String hint, String word1, String word2, String word3, String word4){
        this.answer= answer;
        this.hint = hint;
        this.wordsForRound.add(word1);
        this.wordsForRound.add(word2);
        this.wordsForRound.add(word3);
        this.wordsForRound.add(word4);
    }
}