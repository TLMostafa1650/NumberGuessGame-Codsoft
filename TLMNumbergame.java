import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TLMNumbergame {
    public static void numbergame(){
        Scanner input = new Scanner(System.in);
        int random_num = (int)(Math.random() * 20) + 1;

        System.out.println("Game Is Simple:\n You Have 5 attempts to guess the right number between 1 & 20");
        int user_attempts = 0;
        int user_max_attempts = 5;
        while(user_attempts < 5)
        {
            System.out.println("Please Enter a number between 1 & 20 : ");
            try {
                int user_guess = input.nextInt();
                user_attempts++;
                int diff = Math.abs(user_guess - random_num);

                if (diff == 0) {
                    System.out.println("Congrats! You Guessed The Correct Number & Won The TLMO Number Game !!!");
                    break;
                } else if (diff <= 3) {
                    System.out.println("Wrong Guess .. You are Close, Try Again!!");
                } else {
                    System.out.println("Wrong Guess .. You are Far away, Try Again!!");
                }

                if (user_attempts == 5) {
                    System.out.println("All attempts has been used \n GAME OVER :( ... The Number Was: " + random_num);
                }
                else {
                    System.out.println("Attempts left: " + (user_max_attempts - user_attempts));
                }
            }catch (InputMismatchException e)
            {
                System.out.println("Please, Enter an Integer Number! :) \n Try Again. ");
                input.next();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner play = new Scanner(System.in);
        boolean Playagain = true;
        System.out.println("Welcome To TLMO'S Number Game ! :)");
        while (Playagain)
        {
            numbergame();
            System.out.println("Do You Want To Give it another Try and play again ? \n Press 1 if You Want To Continue Playing. \n Press 0 if you want to quit. ");
int playagain_option = play.nextInt();
if (playagain_option == 0)
{
    Playagain = false;
    System.out.println("Thank You For Playing & I hope you enjoyed! :)");
} else if (playagain_option != 1) {
    System.out.println("Invalid Input ! \n Press 1 if You Want To Continue Playing. \n Press 0 if you want to quit.");
}
        }
        play.close();
    }
}