import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] choices = {"R", "P", "S"};
        int compScore=0;
        int userScore = 0;

        int i = 0;

        System.out.println("Enter the number of rounds: ");
        int num = sc.nextInt();

        while(i<num) {
            int randomNum = (int)Math.floor(Math.random() * 3);
            String compChoice = choices[randomNum];

            System.out.println("Enter your choice: ");
            String userChoice = sc.nextLine();

            if(compChoice.equals((userChoice))) {
                System.out.println("Draw");
            } else if ((compChoice.equals("R") && userChoice.equals("P")) || (compChoice.equals("P") && userChoice.equals("S")) || (compChoice.equals("S") && userChoice.equals("R") ))  {
                System.out.println("User Won");
                userScore++;

            } else if ((userChoice.equals("R") && compChoice.equals("P")) || (userChoice.equals("P") && compChoice.equals("S") || userChoice.equals("S") && compChoice.equals("R")) )  {
                System.out.println("Computer Won");
                compScore++;
            } else {
                System.out.println("Please enter the correct choice");
            }
            i++;
        }

        if(userScore > compScore) {
            System.out.println("User won the game:" +userScore);
        } else if(compScore > userScore){
            System.out.println("Computer won the game: " +compScore);
        } else {
            System.out.println("Its a Tie");
        }


    }
}
