package guessing.game;
import java.util.*;
public class GuessingGame {

    public static void main(String[] args) {
        boolean correct = false;
        
       Random rn = new Random();
       int random_number = rn.nextInt(100) + 1;
       Scanner sc = new Scanner(System.in);
        System.out.println("welcom to the guessing game \n i will choose anumber randomly and you have 10 tries to guess what it is ");
        for (int i = 10 ; i > 0 ; i--)
        {System.out.println("you have " + i + " guess (es)");
            int user_answer = sc.nextInt();
        if (user_answer < random_number )
        {System.out.println("nuh..it's greater than " + user_answer );
        }
        else if(user_answer > random_number )
                System.out.println("nuh ... it's smaller than " + user_answer);
        else 
        {correct = true;
        break;
        }
        }
        if (correct)
        {System.out.println("congrats. you won ");}
        else 
        {
            System.out.println("unfortunatly you lose .\n the number is " +random_number );
            
        }
    }
    
}
