package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        String yes = "y";

        System.out.print("Is the car silent when you turn the key? ");
        String silent = se.nextLine();

        if(silent.equalsIgnoreCase(yes)){
            System.out.print("Are the battery terminals corroded? ");
            String corroded = se.nextLine();

            if(corroded.equalsIgnoreCase(yes)){
                System.out.println("Clean the terminals and try starting again.");
            }
            else{
                System.out.println("Replace the cables and try again.");
            }
        }else{
            System.out.print("Does the car make a slicking noise? ");
            String noise = se.nextLine();

            if(noise.equalsIgnoreCase(yes)){
                System.out.println("Replace the battery.");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                String crank = se.nextLine();

                if(crank.equalsIgnoreCase(yes)){
                    System.out.println("Check spark plug connections.");
                }
                else{
                    System.out.print("Does the engine start and then die? ");
                    String die = se.nextLine();

                    if(die.equalsIgnoreCase(yes)){
                        System.out.print("Does your car have fuel injection? ");
                        String fuel = se.nextLine();

                        if(fuel.equalsIgnoreCase(yes)){
                            System.out.println("Get it in for service.");
                        }else{
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
