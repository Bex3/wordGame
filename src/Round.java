import java.util.ArrayList;

/**
 * Created by bearden-tellez on 2/3/17.
 */
public class Round {
    //round composed of al categories, hint & answer

    String hintOne = "You use these to paint or draw with";
    String hintTwo = "You count with these";
    String hintThree = "Saturday morning ________";
    String hintFour = "A golden TV show";
    String hintFive = "Relax with one of these";
    String hintSix = "Modes of transportation";
    String hintSeven = "Way down yonder on the Chattahoochee";
    String hintEight = "Think Gambling & Vegas";
    String hintNine = "This game is written in one of these";
    String hintTen = "Bang Bang";
    String hintEleven = "Man's best friend";
    String hintTwelve = "You can climb these";
    String hintThirteen = "Pay attention to your watch when traveling across these";
    String hintFourteen = "Historical and cultural region in Northern Europe";
    String hintFifteen = "Write it down";
    String hintSixteen = "Play for a cool tune";
    String hintSeventeen = "Listen Carefully";
    String hintEighteen = "The fuel of programmers";
    String hintNineteen = "Not iron or steel";
    String hintTwenty = "Neil Tyson Degrasse";

    ArrayList <String> roundOne = new ArrayList<>();
    ArrayList <String> roundTwo = new ArrayList<>();
    ArrayList <String> roundThree = new ArrayList<>();
    ArrayList <String> roundFour= new ArrayList<>();
    ArrayList <String> roundFive = new ArrayList<>();
    ArrayList <String> roundSix = new ArrayList<>();
    ArrayList <String> roundSeven = new ArrayList<>();
    ArrayList <String> roundEight = new ArrayList<>();
    ArrayList <String> roundNine = new ArrayList<>();
    ArrayList <String> roundTen = new ArrayList<>();
    ArrayList <String> roundEleven = new ArrayList<>();
    ArrayList <String> roundTwelve= new ArrayList<>();
    ArrayList <String> roundThirteen = new ArrayList<>();
    ArrayList <String> roundFourteen = new ArrayList<>();
    ArrayList <String> roundFifteen = new ArrayList<>();
    ArrayList <String> roundSixteen = new ArrayList<>();
    ArrayList <String> roundSeventeen = new ArrayList<>();
    ArrayList <String> roundEighteen = new ArrayList<>();
    ArrayList <String> roundNineteen = new ArrayList<>();
    ArrayList <String> roundTwenty = new ArrayList<>();


    public void add(int index, String words){
        roundOne.add(0, "Red");
        roundOne.add(1,"Green");
        roundOne.add(2, "Yellow");

        roundTwo.add(0, "Primes");
        roundTwo.add(1, "Evens");
        roundTwo.add(2, "Odds");

        roundThree.add(0, "Spongebob");
        roundThree.add(1, "Tom & Jerry");
        roundThree.add(2, "Courage The Cowardly Dog");

        roundFour.add(0, "Blanche");
        roundFour.add(1, "Rose");
        roundFour.add(2, "Dorothy");
        roundFour.add(3, "Sophia");

        roundFive.add(0, "Hops");
        roundFive.add(1, "Yeast");
        roundFive.add(2, "Water");
        roundFive.add(3, "Grain");

        roundSix.add(0, "Bronco");
        roundSix.add(1, "Mustang");
        roundSix.add(2, "Brumby");

        roundSeven.add(0, "Colorado");
        roundSeven.add(1, "Yellow");
        roundSeven.add(2, "Amazon");

        roundEight.add(0, "Flush");
        roundEight.add(1,"Straight");
        roundEight.add(2, "Full House");

        roundNine.add(0, "Java");
        roundNine.add(1, "Ruby");
        roundNine.add(2, "C");

        roundTen.add(0, "Winchester");
        roundTen.add(1, "Remington");
        roundTen.add(2, "Colt");

        roundEleven.add(0, "Chinook");
        roundEleven.add(1, "Azawakh");
        roundEleven.add(2, "Mudi");

        roundTwelve.add(0, "Larch");
        roundTwelve.add(1, "Linden");
        roundTwelve.add(2, "Orange");

        roundThirteen.add(0, "Pacific");
        roundThirteen.add(1, "Mountain");
        roundThirteen.add(2, "Central");

        roundFourteen.add(0, "Denmark");
        roundFourteen.add(1, "Norway");
        roundFourteen.add(2, "Sweden");

        roundFifteen.add(0, "Glossy");
        roundFifteen.add(1, "Plain");
        roundFifteen.add(2, "Heavy");

        roundSixteen.add(0, "Cajon");
        roundSixteen.add(1, "Lur");
        roundSixteen.add(2, "Crwth");

        roundSeventeen.add(0, "Hammer");
        roundSeventeen.add(1, "Anvil");
        roundSeventeen.add(2, "Stirrup");

        roundEighteen.add(0, "Cortadita");
        roundEighteen.add(1, "Breve");
        roundEighteen.add(2,  "Vienna");

        roundNineteen.add(0, "Copper");
        roundNineteen.add(1, "Brass");
        roundNineteen.add(2, "Zinc");

        roundTwenty.add(0, "Despina");
        roundTwenty.add(1, "Galatea");
        roundTwenty.add(2, "Larissa");
    }

}
