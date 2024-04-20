import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Welcome to the Number Guessing Game!\nThe rules are simple:\n" +
                "1) The Program will generate a random number between 1 and 10\n" +
                "2) You will have to guess that number, and each time you miss the number" +
                " the program will tell you if the number is higher or lower than your input.\n" +
                "3) At the end of the game you will know the number of your attempts.");
        System.out.println("----------------------------------------------------------------------");

        int random = rnd.nextInt(1,11),cnt = 0;
        int guess;
        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if(guess > 10){
                System.out.println("choose a number between 1 and 10 (this guess won't count).");
                continue;
            }
            cnt++;
            if (guess == random){
                break;
            }else if(guess < random){
                System.out.println("Too Low");
            }else{
                System.out.println("Too High");
            }
        }while (true);
        System.out.println("Correct! The right number is " + guess);
        System.out.println("The number of attempts you took was " +cnt +".");
    }
}