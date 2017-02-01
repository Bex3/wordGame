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

        boolean mainGame = true;

        while (mainGame){
            System.out.println("\n" + "Round 1: Red, Green, and Yellow");
            //colors
            String userInput = inputScanner.nextLine();

            if (userInput.equalsIgnoreCase("colors")) {
                System.out.println("\nRound 2: Spongebob, Tom & Jerry, and Courage The Cowardly Dog");
                userInput = inputScanner.nextLine();

                if (userInput.equalsIgnoreCase("cartoons")){
                    System.out.println("\nRound 3: One, Two, and Three");
                    userInput = inputScanner.nextLine();

                    if (userInput.equalsIgnoreCase("numbers")){
                        System.out.println("\nRound 4: Flush, Straight, and Full House" + "\nThis answer is two words");
                        userInput = inputScanner.nextLine();

                        if (userInput.equalsIgnoreCase("poker hands") || (userInput.equalsIgnoreCase("poker hands"))) {
                            System.out.println("\nCongratulations! You made it to the 5th Round! ");
                            System.out.println("\n\nRound 5: Larch, Linden, and Orange");
                            userInput = inputScanner.nextLine();

                            if (userInput.equalsIgnoreCase("trees")){
                                System.out.println("\nRound 6: Java, Ruby, and C" + "\nThis answer is two words");
                                userInput = inputScanner.nextLine();

                                if(userInput.equalsIgnoreCase("programming languages")){
                                    System.out.println("\nRound 7: Winchester, Remington, and Colt" + "\nThis answer is two words");
                                    userInput = inputScanner.nextLine();

                                    if (userInput.equalsIgnoreCase("gun brands") || userInput.equalsIgnoreCase("gun manufacturers")){
                                        System.out.println("\nRound 8: Blanche, Rose, Dorothy, and Sophia" + "\nThis answer is two or three words");
                                        userInput = inputScanner.nextLine();

                                        if (userInput.equalsIgnoreCase("golden girls")|| userInput.equalsIgnoreCase("the golden girls")){
                                            System.out.println("\nRound 9: Hops, Yeast, Water and Grain");
                                            userInput = inputScanner.nextLine();

                                            if(userInput.equalsIgnoreCase("beer")){
                                                System.out.println("\nYou made it to Round 10! ");
                                                System.out.println("\nRound 10: Bronco, Mustang, and Brumby" + "\nThere are two options for this round");
                                                userInput = inputScanner.nextLine();

                                                if (userInput.equalsIgnoreCase("horses") || userInput.equalsIgnoreCase("cars")){
                                                    System.out.println("\nCongratulations! You won the game!");
                                                    mainGame = false;

                                                } else if (userInput.equalsIgnoreCase("0")) {
                                                    System.out.println("Thank you for playing");
                                                    mainGame = false;
                                                } else if (!userInput.equalsIgnoreCase("horses") || !userInput.equalsIgnoreCase("cars")){
                                                    System.out.println("Round 10 Hint: Modes of transportation");
                                                }

                                            } else if (userInput.equalsIgnoreCase("0")) {
                                                System.out.println("Thank you for playing");
                                                mainGame = false;
                                            } else if (!userInput.equalsIgnoreCase("beer")){
                                                System.out.println("Round 9 Hint: Relax with one of these");
                                            }

                                        } else if (userInput.equalsIgnoreCase("0")) {
                                            System.out.println("Thank you for playing");
                                            mainGame = false;
                                        } else if (!userInput.equalsIgnoreCase("golden girls") || !userInput.equalsIgnoreCase("the golden girls")){
                                            System.out.println("Round 8 Hint: A golden TV show");
                                        }

                                    }else if (userInput.equalsIgnoreCase("0")) {
                                        System.out.println("Thank you for playing");
                                        mainGame = false;
                                    } else if (!userInput.equalsIgnoreCase("gun brands")){
                                        System.out.println("Round 7 Hint: bang bang");
                                    }

                                } else if (userInput.equalsIgnoreCase("0")) {
                                    System.out.println("Thank you for playing");
                                    mainGame = false;
                                } else if (!userInput.equalsIgnoreCase("programming languages")){
                                    System.out.println("Round 6 Hint: This game uses one of these to run");
                                }

                            } else if (userInput.equalsIgnoreCase("0")) {
                                System.out.println("Thank you for playing");
                                mainGame = false;
                            } else if (!userInput.equalsIgnoreCase("trees")){
                                System.out.println("Round 5 Hint: You can climb these");
                            }

                        } else if (userInput.equalsIgnoreCase("0")){
                            System.out.println("Thank you for playing");
                            mainGame = false;
                        } else if(!userInput.equalsIgnoreCase("")){
                            System.out.println("Round 4 Hint: Think Gambling & Vegas");
                        }

                    } else if (userInput.equalsIgnoreCase("0")){
                        System.out.println("Thank you for playing");
                        mainGame = false;
                    } else if (!userInput.equalsIgnoreCase("numbers")){
                        System.out.println("Round 3 Hint: You count with these");
                    }

                } else if (userInput.equalsIgnoreCase("0")){
                    System.out.println("Thank you for playing");
                    mainGame = false;
                } else if (!userInput.equalsIgnoreCase("cartoons")){
                    System.out.println("Round 2 Hint: Saturday morning ________");
                }


            } else if (userInput.equalsIgnoreCase("0")){
                System.out.println("Thank you for playing");
                mainGame = false;

            } else if (!userInput.equalsIgnoreCase("colors")){
                System.out.println("Round 1 Hint: you use these to paint or draw with");
            }

        }

    }

}
//make more detailed instructions
//input a way to exit
//add a hint option
//figure out alternative levels? / for loop for incorrect answers