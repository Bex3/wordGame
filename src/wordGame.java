import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by bearden-tellez on 1/26/17.
 */
public class wordGame {

    public static void main(String[] args) {
        System.out.println("Guess the common word among the words given");
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Round 1: red, green, and yellow");
        //colors
        String userInput = inputScanner.nextLine();

        if (userInput.equalsIgnoreCase("colors")) {
            System.out.println("Round 2: Spongebob, Tom & Jerry, and Courage The Cowardly Dog");
            //cartoons
            userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("cartoons")){
                System.out.println("Round 2: Spongebob, Tom & Jerry, and Courage The Cowardly Dog");
                //cartoons
                userInput = inputScanner.nextLine();

                if (userInput.equalsIgnoreCase("cartoons")){
                    System.out.println("Round 3: Flush, Straight, and Full House" + "This answer is two words");
                    //poker hands
                    userInput = inputScanner.nextLine();

                    if (userInput.equalsIgnoreCase("poker hands") || userInput.equalsIgnoreCase("poker hands")) {
                        System.out.println("Round 4: Larch, Linden, and Orange");
                        //trees
                        userInput = inputScanner.nextLine();

                        if (userInput.equalsIgnoreCase("trees")){
                            System.out.println("Congratulations! You made it to the 5th Round! ");
                            System.out.println("Round 5: Java, Ruby, and C3" + "This answer is two words");
                            //programming languages
                            userInput = inputScanner.nextLine();

                            if(userInput.equalsIgnoreCase("programming languages")){
                                System.out.println("Round 6: Winchester, Remington, and Colt" + "This answer is two words");
                                //gun brands
                                userInput = inputScanner.nextLine();

                                if (userInput.equalsIgnoreCase())
                            }

                        }
                    }
                }


            }


        }

    }

}
//make more detailed instructions
//input a way to exit
//add a hint option
//figure out alternative levels? / for loop for incorrect answers