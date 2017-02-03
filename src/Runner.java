import java.util.Scanner;

/**
 * Created by bearden-tellez on 2/3/17.
 */
public class Runner {
    Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public void gameMenu() {
        System.out.println("Welcome to the Guess the Common Denominator" + "\nFor example Water, Juice, and Coffee  \nThe answer would be drinks" + "\n* Don't add a space after your answer or it will be counted incorrect *");
        System.out.println("If you get an answer wrong, a hint will be displayed on the screen and you will be returned to the level that was incomplete. Also, most answers are in plural form");
        System.out.println("If you would like to exit at any time press 0");

        Round theRound = new Round();

    }
}
