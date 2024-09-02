import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock \n 1 for paper \n 2 for Scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int botInput = random.nextInt(3);//it enters 0,1,2 only
        
        if(userInput == botInput){
            System.out.println("Draw");
        } else if (userInput == 0 && botInput ==2 || userInput == 1 && botInput == 0 || userInput == 2 && botInput == 1) {
            System.out.println(" User Win");
            
        }else {
            System.out.println("Bot Win");
        }

        if (botInput == 0){
            System.out.println("Bot Choice: Rock");
        } else if (botInput ==1) {
            System.out.println("Bot choice: Paper");
        }else {
            System.out.println("Bot Choice: Scissor");
        }
    }
}
