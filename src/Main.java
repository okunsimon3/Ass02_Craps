import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        boolean done = false;
        String doneResponse = "";

        while (true){
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("You rolled a " + crapsRoll);
                System.out.println("\n" + "You lose");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("You rolled a " + crapsRoll);
                System.out.println("\n" + "You Win!");
            } else {
                System.out.println("You rolled a " + crapsRoll);
                int point = crapsRoll;
                System.out.println("The point is " + point);
                while (true){
                    int newDie1 = rnd.nextInt(6) + 1;
                    int newDie2 = rnd.nextInt(6) + 1;
                    int newCrapsRoll = newDie1 + newDie2;
                    System.out.println("You rolled a " + newCrapsRoll);
                    if(newCrapsRoll == point) {
                        System.out.println("You made the point sum");
                        System.out.println("\n" + "You win");
                        break;
                    } else if (newCrapsRoll == 7) {
                        System.out.println("\n" + "You lose");
                        break;
                    }
                }
            }
            System.out.print("\n" + "Would you like to play again? [Y/N]: ");
            doneResponse = in.nextLine();
            if(doneResponse.equalsIgnoreCase("N")) {
                System.out.println("\n" + "Thank you for playing!");
                break;
            }
        }



    }
}