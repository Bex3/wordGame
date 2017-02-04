import java.util.Scanner;

/**
 * Created by bearden-tellez on 2/3/17.
 */
public class Runner {
    Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Round roundOne = new Round("colors", "You use these to paint or draw with", "Red", "Green", "Yellow");
        Round roundTwo= new Round("Numbers", "You count with these", "Primes", "Evens", "Odds");
        Round roundThree = new Round("cartoons", "Saturday morning ________", "Spongebob", "Tom & Jerry", "Courage The Cowardly Dog");
        Round roundFour = new Round("Golden Girls", "A golden TV show", "Blanche", "Rose", "Dorothy", "Sophia");
        Round roundFive = new Round("beer", "Relax with one of these", "Hops", "Yeast", "Water", "Grain") ;
        Round roundSix = new Round("Cars named for horses", "Modes of transportation named after predecessors", "Bronco", "Mustang", "Brumby");
        Round roundSeven = new Round("River", "Way down yonder on the Chattahoochee","Colorado", "Yellow", "Amazon");
        Round roundEight = new Round("Poker Hands", "Think Gambling & Vegas", "Flush", "Straight", "Full House");
        Round roundNine = new Round("Programming languages","This game is written in one of these", "Java", "Ruby", "C");
        Round roundTen = new Round("gun brands", "bang bang", "Remington", "Colt", "Winchester");
        Round roundEleven = new Round("dog breeds", "Man's best friend", "Chinook", "Azawakh", "Mudi");
        Round roundTwelve = new Round("trees", "You can climb these", "Larch", "Linden", "Orange" );
        Round roundThirteen = new Round("time zones", "Pay attention to your watch when you cross these", "Pacific", "Mountain", "Central");
        Round roundFourteen = new Round("Scandinavian countries", "Historical and cultural region in Northern Europe...or Vikings", "Denmark", "Norway", "Sweden");
        Round roundFifteen = new Round("paper types", "Write it down", "Glossy", "Plain", "Heavy");
        Round roundSixteen = new Round("musical instruments", "Play a cool tune", "Lur", "Crwth", "Cajon");
        Round roundSeventeen = new Round("ear bones", "Listen carefully", "Hammer", "Anvil", "Stirrup");
        Round roundEighteen = new Round("coffee", "Fuel for programmers", "Cortadita", "Vienna", "Breve");
        Round roundNineteen = new Round("non-ferrous metals", "Not iron or steel", "Zinc", "Brass", "Copper");
        Round roundTwenty = new Round("moons of Neptune", "Neil Tyson Degrasse", "Despina", "Galatea", "Larissa");
    }

    public void gameMenu() {
        System.out.println("Welcome to the Guess the Common Denominator" + "\nFor example Water, Juice, and Coffee  \nThe answer would be drinks" + "\n* Don't add a space after your answer or it will be counted incorrect *");
        System.out.println("If you get an answer wrong, a hint will be displayed on the screen and you will be returned to the level that was incomplete. Also, most answers are in plural form");
        System.out.println("If you would like to exit at any time press 0");

        String userInput = inputScanner.nextLine();
        


    }
}
