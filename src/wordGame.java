
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bearden-tellez on 1/26/17.
 */
public class wordGame {
    public static ArrayList<Round> totalRounds = new ArrayList<>();

    public static void main(String[] args) {
        wordGame theGame = new wordGame();
        theGame.gameFunction();
    }

    public void addRounds(){
        totalRounds.add(0, new Round("Red", "Green", "Yellow", "You use these to paint or draw with","colors"));
        totalRounds.add(1,  new Round("Primes", "Evens", "Odds", "You count with these", "Numbers"));
        totalRounds.add(2, new Round("Spongebob", "Tom & Jerry", "Courage The Cowardly Dog","Saturday morning ________", "Cartoons"));
        totalRounds.add(3, new Round("Blanche", "Rose", "Dorothy", "Sophia", "A golden TV show", "Golden Girls"));
        totalRounds.add(4, new Round("Hops", "Yeast", "Water", "Grain", "Relax with one of these","beer"));
        totalRounds.add(5, new Round("Bronco", "Mustang", "Brumby", "Modes of transportation named after predecessors","Cars named for horses"));
        totalRounds.add(6, new Round("Colorado", "Yellow", "Amazon", "Way down yonder on the Chattahoochee", "River"));
        totalRounds.add(7, new Round("Flush", "Straight", "Full House", "Think Gambling & Vegas", "Poker Hands" ));
        totalRounds.add(8, new Round("Java", "Ruby", "C", "This game is written in one of these","Programming languages"));
        totalRounds.add(9, new Round("Remington", "Colt", "Winchester", "bang bang","gun brands"));
        totalRounds.add(10, new Round("Chinook", "Azawakh", "Mudi", "Man's best friend","dog breeds"));
        totalRounds.add(11, new Round("Larch", "Linden", "Orange", "You can climb these", "trees"));
        totalRounds.add(12, new Round("Pacific", "Mountain", "Central", "Pay attention to your watch when you cross these", "time zones"));
        totalRounds.add(13, new Round("Denmark", "Norway", "Sweden", "Historical and cultural region in Northern Europe...or think Vikings", "Scandinavian countries"));
        totalRounds.add(14, new Round("Glossy", "Plain", "Heavy", "Write it down","paper types"));
        totalRounds.add(15, new Round("Lur", "Crwth", "Cajon", "Play a cool tune","musical instruments"));
        totalRounds.add(16, new Round("Hammer", "Anvil", "Stirrup", "Listen carefully", "ear bones"));
        totalRounds.add(17, new Round("Cortadita", "Vienna", "Breve", "Fuel for programmers","coffee"));
        totalRounds.add(18, new Round("Zinc", "Brass", "Copper", "Not iron or steel", "non-ferrous metals"));
        totalRounds.add(19, new Round("Despina", "Galatea", "Larissa", "Neil Tyson Degrasse", "moons of Neptune"));
    }

    public void gameFunction(){
        System.out.println("Welcome to the Guess the Common Denominator" + "\nFor example Water, Juice, and Coffee  \nThe answer would be drinks" + "\n* Answers can range from one word to an entire phrase. Don't add a space after your answer or it will be counted incorrect *");
        System.out.println("If you get an answer wrong, a hint will be displayed on the screen and you will be returned to the level that was incomplete. Also, most answers are in plural form");
        System.out.println("If you would like to exit at any time press 0");
        Scanner inputScanner = new Scanner(System.in);
        addRounds();

//        for (int index = 0; index < totalRounds.size(); index ++){
//            System.out.println("\nRound Number " + (index+1) + ": "+ totalRounds.get(index).wordsForRound);
//            String userInput = inputScanner.nextLine();
//            if(userInput.equalsIgnoreCase(totalRounds.get(index).answer)){
//                continue;
//            } else if(userInput.equalsIgnoreCase("0")){
//                break;
//            } else if(!userInput.equalsIgnoreCase(totalRounds.get(index).answer)){
//                System.out.println(totalRounds.get(index).hint);
//                index--;
//            }
//        }

        for(int index = 0; index < totalRounds.size(); index++){
            System.out.println("\nRound Number " + (index+1) + ": "+ totalRounds.get(index).wordsForRound);
            String userInput = inputScanner.nextLine();
            if(userInput.equalsIgnoreCase("0")){
                break;
            }
            if(playARound(totalRounds.get(index), userInput).isComplete() == true){
                continue;
            } else if (playARound(totalRounds.get(index), userInput).isComplete() == false) {
                System.out.println(playARound(totalRounds.get(index), userInput).gameResponse);
                index --;
            }

        }
    }

    public TestingPackage gameFunctionUserInputParameters(String userOption){
        System.out.println("Welcome to the Guess the Common Denominator" + "\nFor example Water, Juice, and Coffee  \nThe answer would be drinks" + "\n* Don't add a space after your answer or it will be counted incorrect *");
        System.out.println("If you get an answer wrong, a hint will be displayed on the screen and you will be returned to the level that was incomplete. Also, most answers are in plural form");
        System.out.println("If you would like to exit at any time press 0");
        TestingPackage newPack = new TestingPackage();


            System.out.println("\n" + ": "+ totalRounds.get(0).wordsForRound);
            if(userOption.equalsIgnoreCase(totalRounds.get(0).answer)){
                newPack.setComplete(true);
                return newPack;
            }  else if(!userOption.equalsIgnoreCase(totalRounds.get(0).answer)){
                System.out.println(totalRounds.get(0).hint);
                newPack.setComplete(false);
                newPack.setGameResponse(totalRounds.get(0).hint);
                return newPack;
            } return newPack;
    }

    public TestingPackage playARound(Round playRound, String userChoice){
        TestingPackage newPack = new TestingPackage();
        if(userChoice.equalsIgnoreCase(playRound.answer)){
            newPack.setComplete(true);
            }  else if(!userChoice.equalsIgnoreCase(playRound.answer)){
            newPack.setComplete(false);
            newPack.setGameResponse(playRound.hint);
            return newPack;
            }
        return newPack;
    }
}

