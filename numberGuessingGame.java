import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;


public class numberGuessingGame {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int minRange=1;
        int maxRange=100;
        int maxAttempts=10;
        int round=1;
        int totalScore=0;

        System.out.println("Welcome to guess the number!");
        System.out.println("Guess the number between"+minRange+"and"+maxRange+".");
        System.out.println("you have"+maxAttempts+"attempts per round.");

        while(true)
        {
            System.out.println("-----Round"+round+"------");
            int secretNumber=random.nextInt(maxRange-minRange+1)+minRange;
            int score=playGame(scanner,secretNumber,maxAttempts);
            totalScore+=score;

            System.out.println("The number was:"+secretNumber);
            System.out.println("Your score for this round:"+score);
            System.out.println("Total score:"+totalScore);

            System.out.println("Do you want to play again? (yes/no):");
            String playAgain=scanner.next();
            if(!playAgain.equalsIgnoreCase("yes"))
            {break;
            } 
            round++;}
            System.out.println("Thank you for playing guess the number!");

        }
        private static int playGame(Scanner scanner,int secretNumber,int maxAttempts)
        {
            int attempts=0;
            int score=0;

            while(attempts<maxAttempts)
            {
                System.out.println("Enter your guess");
                int guess=scanner.nextInt();
                attempts++;

                if(guess==secretNumber)
                {
                    score=maxAttempts-attempts+1;
                    System.out.println("Congratulations! yo guessed the number in"+attempts+"attempts.");
                    break;
                }else if(guess<secretNumber)
                {
                    System.out.println("Too low! guess higher.");
                }
                else
                {
                    System.out.println("Too high! guess lower.");
                }
                }
                if(score==0)
                {
                    System.out.println("Out of attempts! the number was:"+secretNumber);
                }
                return score;
            }
        }
    
    

