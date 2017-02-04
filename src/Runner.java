import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bearden-tellez on 2/3/17.
 */
public class Runner {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Common Denominator" + "\nFor example Water, Juice, and Coffee  \nThe answer would be drinks" + "\n* Don't add a space after your answer or it will be counted incorrect *");
        System.out.println("If you get an answer wrong, a hint will be displayed on the screen and you will be returned to the level that was incomplete. Also, most answers are in plural form");
        System.out.println("If you would like to exit at any time press 0");



        Scanner inputScanner = new Scanner(System.in);

        Round roundOne = new Round("Red", "Green", "Yellow", "You use these to paint or draw with","colors");
        Round roundTwo= new Round("Primes", "Evens", "Odds", "You count with these", "Numbers" );
        Round roundThree = new Round("Spongebob", "Tom & Jerry", "Courage The Cowardly Dog","Saturday morning ________", "Cartoons");
        Round roundFour = new Round("Blanche", "Rose", "Dorothy", "Sophia", "A golden TV show", "Golden Girls");
        Round roundFive = new Round("Hops", "Yeast", "Water", "Grain", "Relax with one of these","beer") ;
        Round roundSix = new Round("Bronco", "Mustang", "Brumby", "Modes of transportation named after predecessors","Cars named for horses");
        Round roundSeven = new Round("Colorado", "Yellow", "Amazon", "Way down yonder on the Chattahoochee", "River");
        Round roundEight = new Round("Flush", "Straight", "Full House", "Think Gambling & Vegas", "Poker Hands" );
        Round roundNine = new Round("Java", "Ruby", "C", "This game is written in one of these","Programming languages");
        Round roundTen = new Round("Remington", "Colt", "Winchester", "bang bang","gun brands");
        Round roundEleven = new Round("Chinook", "Azawakh", "Mudi", "Man's best friend","dog breeds");
        Round roundTwelve = new Round("Larch", "Linden", "Orange", "You can climb these", "trees");
        Round roundThirteen = new Round("Pacific", "Mountain", "Central", "Pay attention to your watch when you cross these", "time zones");
        Round roundFourteen = new Round("Denmark", "Norway", "Sweden", "Historical and cultural region in Northern Europe...or think Vikings", "Scandinavian countries");
        Round roundFifteen = new Round("Glossy", "Plain", "Heavy", "Write it down","paper types");
        Round roundSixteen = new Round("Lur", "Crwth", "Cajon", "Play a cool tune","musical instruments");
        Round roundSeventeen = new Round("Hammer", "Anvil", "Stirrup", "Listen carefully", "ear bones");
        Round roundEighteen = new Round("Cortadita", "Vienna", "Breve", "Fuel for programmers","coffee");
        Round roundNineteen = new Round("Zinc", "Brass", "Copper", "Not iron or steel", "non-ferrous metals");
        Round roundTwenty = new Round("Despina", "Galatea", "Larissa", "Neil Tyson Degrasse", "moons of Neptune");

        ArrayList<Round> totalRounds = new ArrayList<>();
        totalRounds.add(0, roundOne);
        totalRounds.add(1, roundTwo);
        totalRounds.add(2, roundThree);
        totalRounds.add(3, roundFour);
        totalRounds.add(4, roundFive);
        totalRounds.add(5, roundSix);
        totalRounds.add(6, roundSeven);
        totalRounds.add(7, roundEight);
        totalRounds.add(8, roundNine);
        totalRounds.add(9, roundTen);
        totalRounds.add(10, roundEleven);
        totalRounds.add(11, roundTwelve);
        totalRounds.add(12, roundThirteen);
        totalRounds.add(13, roundFourteen);
        totalRounds.add(14, roundFifteen);
        totalRounds.add(15, roundSixteen);
        totalRounds.add(16, roundSeventeen);
        totalRounds.add(17, roundEighteen);
        totalRounds.add(18, roundNineteen);
        totalRounds.add(19, roundTwenty);


        for (int index = 0; index < 100; index ++){
            System.out.println(totalRounds.get(index).wordsForRound);
            String userInput = inputScanner.nextLine();
            if(userInput.equalsIgnoreCase(totalRounds.get(index).answer)){
                continue;
            } else if(userInput.equalsIgnoreCase("0")){
                break;
            } else if(!userInput.equalsIgnoreCase(totalRounds.get(index).answer)){
                System.out.println(totalRounds.get(index).hint);
                index--;
            }
        }
    }

}
