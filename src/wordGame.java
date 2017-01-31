import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by bearden-tellez on 1/26/17.
 */
public class wordGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Common Denominator" + "\n" + "\nFor example Water, Juice, and Coffee  \nThe answer would be drinks");
        System.out.println("If you would like to exit at any time press 0");
        Scanner inputScanner = new Scanner(System.in);

        while (true){
            System.out.println("\n" + "Round 1: red, green, and yellow");
            //colors
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("colors")) {
                System.out.println("Round 2: Spongebob, Tom & Jerry, and Courage The Cowardly Dog");
                userInput = inputScanner.nextLine();

                if (userInput.equalsIgnoreCase("cartoons")){
                    System.out.println("Round 3: one, two, and three");
                    userInput = inputScanner.nextLine();

                    if (userInput.equalsIgnoreCase("numbers")){
                        System.out.println("Round 4: Flush, Straight, and Full House" + "\nThis answer is two words");
                        userInput = inputScanner.nextLine();

                        if (userInput.equalsIgnoreCase("poker hands") || userInput.equalsIgnoreCase("poker hands")) {
                            System.out.println("Congratulations! You made it to the 5th Round! ");
                            System.out.println("Round 5: Larch, Linden, and Orange");
                            userInput = inputScanner.nextLine();

                            if (userInput.equalsIgnoreCase("trees")){
                                System.out.println("Round 6: Java, Ruby, and C3" + "\nThis answer is two words");
                                userInput = inputScanner.nextLine();

                                if(userInput.equalsIgnoreCase("programming languages")){
                                    System.out.println("Round 7: Winchester, Remington, and Colt" + "\nThis answer is two words");
                                    userInput = inputScanner.nextLine();

                                    if (userInput.equalsIgnoreCase("gun brands")){
                                        System.out.println("Round 8: Blanche, Rose, Dorothy, and Sophia" + "\nThis answer is two words");
                                        userInput = inputScanner.nextLine();

                                        if (userInput.equalsIgnoreCase("golden girls")){
                                            System.out.println("Round 9: Hops, Yeast, Water and Grain");
                                            userInput = inputScanner.nextLine();

                                            if(userInput.equalsIgnoreCase("beer")){
                                                System.out.println("You made it to Round 10! ");
                                                System.out.println("Round 10: Bronco, Mustang, and Brumby" + "\n There are two options for this round");
                                                userInput = inputScanner.nextLine();

                                                if (userInput.equalsIgnoreCase("horses") || (userInput.equalsIgnoreCase("cars"))){

                                                }
                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }


                } else {
                    System.out.println();
                }


            } else if (userInput.equalsIgnoreCase("0")){
                System.out.println("Thank you for playing");
                break;

            }

        }

    }

}
//make more detailed instructions
//input a way to exit
//add a hint option
//figure out alternative levels? / for loop for incorrect answers