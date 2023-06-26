
import java.util.*;

public class STONE_PAPER_SCISSOR_GAME {
    public static void main(String[] args) {

        Random rc = new Random();


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name  ....");
        String name = sc.nextLine();

        int correct_guesses_from_user=0 , computer_score=0;

        for(int i=0; i<5 ;i++)
        {
            System.out.println("PRESS 0 FOR STONE , 1 FOR PAPER , 2 FOR SCISSOR ");
            int input = sc.nextInt();
            int random = rc.nextInt(2);

            if(input==0&&random==2 || input==1&&random==0 || input==2&&random==1)
            {
                System.out.println("YOU WON THIS CHANCE ....... ");
                if(random==0)
                {
                    System.out.println("computer took stone " + random);
                }
                else if (random==1)
                {
                    System.out.println("computer took paper " + random);
                }
                else
                {
                    System.out.println("computer took scissor " + random);
                }

                correct_guesses_from_user++;
            }
            else if (input==random)
            {
                System.out.println("ITS A TIE");
            }
            else if (input>2)
            {
                System.out.println("INVALID INPUT ");
            }
            else
            {

                if(random==0)
                {
                    System.out.println("computer took stone " + random);
                }
                else if (random==1)
                {
                    System.out.println("computer took paper " + random);
                }
                else
                {
                    System.out.println("computer took scissor " + random);
                }

                System.out.println("COMPUTER WON THIS CHANCE........");
                computer_score++;
            }


            System.out.println("\n\n\n");
        }

        System.out.println("FINALE SCORE ........");
        System.out.println( name + "----->"+ correct_guesses_from_user);
        System.out.println("COMPUTER -----> " + computer_score);

        if(correct_guesses_from_user>computer_score)
        {
            System.out.println("YOU WON THE GAME CONGRAULATION !!!!@@@!!!!...........");
        }
        else if(computer_score>correct_guesses_from_user){
            System.out.println("COMPUTER WON THE GAME!!!!!!@@@!!!!!! ...................");
        }
        else{
            System.out.println("GAME TIE !!!!!!");
        }
    }
}
