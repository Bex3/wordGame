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

        boolean roundOne = true;

        while (roundOne){
            System.out.println("\n" + "Round 1: Red, Green, and Yellow");
            //colors
            String userInput = inputScanner.nextLine();
            if (userInput.equalsIgnoreCase("colors")) {
                boolean roundTwo = true;
                while(roundTwo){
                    System.out.println("\nRound 2: Spongebob, Tom & Jerry, and Courage The Cowardly Dog");
                    userInput = inputScanner.nextLine();
                    if (userInput.equalsIgnoreCase("cartoons")){
                        roundTwo = false;
                        boolean roundThree = true;
                        while(roundThree){
                            System.out.println("\nRound 3: One, Two, and Three");
                            userInput = inputScanner.nextLine();
                            if (userInput.equalsIgnoreCase("numbers")){
                                roundThree= false;
                                boolean roundFour = true;
                                while(roundFour){
                                    System.out.println("\nRound 4: Flush, Straight, and Full House" + "\nThis answer is two words");
                                    userInput = inputScanner.nextLine();

                                    if (userInput.equalsIgnoreCase("poker hands") || (userInput.equalsIgnoreCase("poker hands"))) {
                                        roundFour = false;
                                        boolean roundFive = true;
                                        System.out.println("\nCongratulations! You made it to the 5th Round! ");
                                        while(roundFive){
                                            System.out.println("\n\nRound 5: Larch, Linden, and Orange");
                                            userInput = inputScanner.nextLine();

                                            if (userInput.equalsIgnoreCase("trees")){
                                                roundFive = false;
                                                boolean roundSix = true;
                                                while(roundSix){
                                                    System.out.println("\nRound 6: Java, Ruby, and C" + "\nThis answer is two words");
                                                    userInput = inputScanner.nextLine();
                                                    if(userInput.equalsIgnoreCase("programming languages")){
                                                        roundSix = false;
                                                        boolean roundSeven = true;
                                                        while(roundSeven){
                                                            System.out.println("\nRound 7: Winchester, Remington, and Colt" + "\nThis answer is two words");
                                                            userInput = inputScanner.nextLine();
                                                            if (userInput.equalsIgnoreCase("gun brands") || userInput.equalsIgnoreCase("gun manufacturers")){
                                                                roundSeven = false;
                                                                boolean roundEight = true;
                                                                while(roundEight){
                                                                    System.out.println("\nRound 8: Blanche, Rose, Dorothy, and Sophia" + "\nThis answer is two or three words");
                                                                    userInput = inputScanner.nextLine();
                                                                    if (userInput.equalsIgnoreCase("golden girls")|| userInput.equalsIgnoreCase("the golden girls")){
                                                                        roundEight = false;
                                                                        boolean roundNine= true;
                                                                        while(roundNine){
                                                                            System.out.println("\nRound 9: Hops, Yeast, Water and Grain");
                                                                            userInput = inputScanner.nextLine();
                                                                            if(userInput.equalsIgnoreCase("beer")){
                                                                                System.out.println("\nYou made it to Round 10! ");
                                                                                roundNine = false;
                                                                                boolean roundTen = true;
                                                                                while(roundTen){
                                                                                    System.out.println("\nRound 10: Bronco, Mustang, and Brumby" + "\nThere are two options for this round");
                                                                                    userInput = inputScanner.nextLine();
                                                                                    if (userInput.equalsIgnoreCase("horses") || userInput.equalsIgnoreCase("cars")){
                                                                                        roundTen = false;
                                                                                        boolean roundEleven = true;

                                                                                        while(roundEleven) {
                                                                                            System.out.println("\nRound 11: Chinook, Azawakh, and Mudi" + "\nThis answer is two words");
                                                                                            userInput = inputScanner.nextLine();
                                                                                            if(userInput.equalsIgnoreCase("dog breeds")){
                                                                                                roundEleven = false;
                                                                                                boolean roundTwelve = false;
                                                                                            while(roundTwelve){
                                                                                                System.out.println("Round 12: Hammer, Anvil, and Stirrup" + "\nThis answer is also two words");
                                                                                                userInput = inputScanner.nextLine();
                                                                                                if(userInput.equalsIgnoreCase("ear bones")){
                                                                                                    roundTwelve = false;
                                                                                                    boolean roundThirteen = true;
                                                                                                    while(roundThirteen){
                                                                                                        System.out.println("\nRound 13: Cortadita, Breve, and Vienna");
                                                                                                        userInput = inputScanner.nextLine();
                                                                                                        if(userInput.equalsIgnoreCase("coffee")){
                                                                                                            roundThirteen = false;
                                                                                                            boolean roundFourteen = true;
                                                                                                            while(roundFourteen){
                                                                                                                System.out.println("\nRound 14: Lur, Cajon, and Crwth" + "\n This answer is two words");
                                                                                                                userInput = inputScanner.nextLine();
                                                                                                                if(userInput.equalsIgnoreCase("musical instruments")){
                                                                                                                    roundFourteen = false;
                                                                                                                    boolean roundFifteen = true;
                                                                                                                    while(roundFifteen){
                                                                                                                        System.out.println("\nRound 15: Denmark, Norway, and Sweden" + "\nThis answer is two words");
                                                                                                                        userInput = inputScanner.nextLine();
                                                                                                                        if(userInput.equalsIgnoreCase("Scandinavian countries")){
                                                                                                                            roundFifteen = false;
                                                                                                                            boolean roundSixteen = true;
                                                                                                                            while(roundSixteen){
                                                                                                                                System.out.println("\nRound 16: Copper, Brass, and Zinc" + "\nThis answer is two words");
                                                                                                                                userInput = inputScanner.nextLine();
                                                                                                                                if(userInput.equalsIgnoreCase("non-ferrous metals") || userInput.equalsIgnoreCase("nonferrous metals")){
                                                                                                                                    roundSixteen = false;
                                                                                                                                    boolean roundSeventeen = true;
                                                                                                                                    while(roundSeventeen){
                                                                                                                                        System.out.println("\nRound 17: Despina, Galatea, and Larissa" + "\nThis answer is 2 or 3 words");
                                                                                                                                        userInput = inputScanner.nextLine();
                                                                                                                                        if(userInput.equalsIgnoreCase("moons of Neptune") || userInput.equalsIgnoreCase("Neptune's moons")){
                                                                                                                                            roundSeventeen = false;
                                                                                                                                            boolean roundEighteen = true;
                                                                                                                                            while(roundEighteen){
                                                                                                                                                System.out.println("\nRound 18: Pacific, Mountain, and Central");
                                                                                                                                                userInput = inputScanner.nextLine();
                                                                                                                                                if(userInput.equalsIgnoreCase("time zones")){
                                                                                                                                                    roundEighteen = false;
                                                                                                                                                    boolean roundNineteen = true;
                                                                                                                                                    while(roundNineteen){
                                                                                                                                                        System.out.println("\nRound 19: Amazon, Colorado, and Yellow");
                                                                                                                                                        userInput = inputScanner.nextLine();
                                                                                                                                                        if(userInput.equalsIgnoreCase("rivers") || userInput.equalsIgnoreCase("rivers")){
                                                                                                                                                            roundNineteen = false;
                                                                                                                                                            boolean roundTwenty = true;
                                                                                                                                                            while(roundTwenty){
                                                                                                                                                                System.out.println("Round 20: Glossy, Plain, and Heavy" + "\nThis answer is two words");
                                                                                                                                                                userInput = inputScanner.nextLine();
                                                                                                                                                                if(userInput.equalsIgnoreCase("paper types")){
                                                                                                                                                                    roundTwenty = false;
                                                                                                                                                                    System.out.println("Congratulations you won the game!");
                                                                                                                                                                    roundOne = false;
                                                                                                                                                                } else if (userInput.equalsIgnoreCase("0")){
                                                                                                                                                                    System.out.println("Thanks for playing");
                                                                                                                                                                    roundOne = false;
                                                                                                                                                                } else if (!userInput.equalsIgnoreCase("paper types")){
                                                                                                                                                                    System.out.println("Round 20 Hint: Write it down");
                                                                                                                                                                }
                                                                                                                                                            }

                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }  else if (userInput.equalsIgnoreCase("0")){
                                                                                                                                                    System.out.println("Thanks for playing");
                                                                                                                                                    roundOne = false;
                                                                                                                                                } else if (!userInput.equalsIgnoreCase("time zones")){
                                                                                                                                                    System.out.println("\nRound 18 Hint: Pay attention to you watch when traveling across these");
                                                                                                                                                }
                                                                                                                                            }

                                                                                                                                        } else if (userInput.equalsIgnoreCase("0")){
                                                                                                                                            System.out.println("Thanks for playing");
                                                                                                                                            roundOne = false;
                                                                                                                                        } else if (!userInput.equalsIgnoreCase("moons of Neptune") || !userInput.equalsIgnoreCase("Meptune's moons")){
                                                                                                                                            System.out.println("Round 17 Hint: Neil Tyson Degrasse");
                                                                                                                                        }
                                                                                                                                    }

                                                                                                                                } else if (userInput.equalsIgnoreCase("0")){
                                                                                                                                    System.out.println("Thanks for playing");
                                                                                                                                    roundOne = false;
                                                                                                                                } else if (!userInput.equalsIgnoreCase("non-ferrous metals") || !userInput.equalsIgnoreCase("nonferrous metals")){
                                                                                                                                    System.out.println("Round 16 Hint: Not iron or steel");
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else if (userInput.equalsIgnoreCase("0")) {
                                                                                                                            System.out.println("Thanks for playing");
                                                                                                                            roundOne = false;
                                                                                                                        } else if (!userInput.equalsIgnoreCase("Scandinavian countries")){
                                                                                                                            System.out.println("Round 15 Hint: Historical and cultural region in Northern Europe");
                                                                                                                        }
                                                                                                                    }

                                                                                                                } else if (userInput.equalsIgnoreCase("0")){
                                                                                                                    System.out.println("Thanks for playing");
                                                                                                                    roundOne = false;
                                                                                                                } else if (!userInput.equalsIgnoreCase("musical instruments")){
                                                                                                                    System.out.println("Round 14 Hint: Play for a cool tune");
                                                                                                                }
                                                                                                            }

                                                                                                        } else if (userInput.equalsIgnoreCase("0")){
                                                                                                            System.out.println("Thanks for playing");
                                                                                                            roundOne = false;
                                                                                                        } else if (!userInput.equalsIgnoreCase("coffee")){
                                                                                                            System.out.println("Round 13 Hint: The fuel of programmers");
                                                                                                        }
                                                                                                    }

                                                                                                } else if (userInput.equalsIgnoreCase("0")){
                                                                                                    System.out.println("Thank you for playing");
                                                                                                    roundOne = false;
                                                                                                } else if (!userInput.equalsIgnoreCase("ear bones")){
                                                                                                    System.out.println("Round 12 Hint: Listen Carefully");
                                                                                                }
                                                                                            }

                                                                                            } else if (userInput.equalsIgnoreCase("0")){
                                                                                                System.out.println("Thank you for playing");
                                                                                                roundOne = false;
                                                                                            } else if (!userInput.equalsIgnoreCase("dog breeds")){
                                                                                                System.out.println("Round 11 Hint: Man's best friend");
                                                                                            }

                                                                                        }

                                                                                    } else if (userInput.equalsIgnoreCase("0")) {
                                                                                        System.out.println("Thank you for playing");
                                                                                        roundOne = false;
                                                                                    } else if (!userInput.equalsIgnoreCase("horses") || !userInput.equalsIgnoreCase("cars")){
                                                                                        System.out.println("Round 10 Hint: Modes of transportation");
                                                                                    }
                                                                                }
                                                                            } else if (userInput.equalsIgnoreCase("0")) {
                                                                                System.out.println("Thank you for playing");
                                                                                roundOne = false;
                                                                            } else if (!userInput.equalsIgnoreCase("beer")){
                                                                                System.out.println("Round 9 Hint: Relax with one of these");
                                                                            }
                                                                        }


                                                                    } else if (userInput.equalsIgnoreCase("0")) {
                                                                        System.out.println("Thank you for playing");
                                                                        roundOne = false;
                                                                    } else if (!userInput.equalsIgnoreCase("golden girls") || !userInput.equalsIgnoreCase("the golden girls")){
                                                                        System.out.println("Round 8 Hint: A golden TV show");
                                                                    }
                                                                }


                                                            }else if (userInput.equalsIgnoreCase("0")) {
                                                                System.out.println("Thank you for playing");
                                                                roundOne = false;
                                                            } else if (!userInput.equalsIgnoreCase("gun brands")){
                                                                System.out.println("Round 7 Hint: bang bang");
                                                            }
                                                        }



                                                    } else if (userInput.equalsIgnoreCase("0")) {
                                                        System.out.println("Thank you for playing");
                                                        roundOne = false;
                                                    } else if (!userInput.equalsIgnoreCase("programming languages")){
                                                        System.out.println("Round 6 Hint: This game uses one of these to run");
                                                    }
                                                }




                                            } else if (userInput.equalsIgnoreCase("0")) {
                                                System.out.println("Thank you for playing");
                                                roundOne = false;
                                            } else if (!userInput.equalsIgnoreCase("trees")){
                                                System.out.println("Round 5 Hint: You can climb these");
                                            }
                                        }



                                    } else if (userInput.equalsIgnoreCase("0")){
                                        System.out.println("Thank you for playing");
                                        roundOne = false;
                                    } else if(!userInput.equalsIgnoreCase("")){
                                        System.out.println("Round 4 Hint: Think Gambling & Vegas");
                                    }
                                }


                            } else if (userInput.equalsIgnoreCase("0")){
                                System.out.println("Thank you for playing");
                                roundOne = false;
                            } else if (!userInput.equalsIgnoreCase("numbers")){
                                System.out.println("Round 3 Hint: You count with these");
                            }

                        }



                    } else if (userInput.equalsIgnoreCase("0")){
                        System.out.println("Thank you for playing");
                        roundOne = false;
                    } else if (!userInput.equalsIgnoreCase("cartoons")){
                        System.out.println("Round 2 Hint: Saturday morning ________");
                    }

                }

            } else if (userInput.equalsIgnoreCase("0")){
                System.out.println("Thank you for playing");
                roundOne = false;

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