import java.util.Scanner;
import java.util.Random;

public class RockPapSci {
    public static void main(String args[]){
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        String uc = sc.next();
        Random ran = new Random();
        int cr = ran.nextInt(1, 4);
        String cc="";
        String s="s",p="p",r="r";
        if(cr == 1){
            cc = r;
        }
        else if (cr == 2){
            cc = p;
        }
        else{
            cc = s;
        }
        System.out.println("you chose: "+uc+"\ncomputer chose: "+cc);
        if (uc.equals(cc)){
            System.out.println("Game tie!");
        }
        else if (uc.equals(r)){
            if (cc.equals(p)){
                System.out.println("You lose! Paper covered the rock.");
            }
            else{
                System.out.println("You Won! Rock broke the scissor.");
            }
        }
        else if (uc.equals(p)){
            if (cc.equals(r)){
                System.out.println("You Won! Paper covered the rock.");
            }
            else{
                System.out.println("You lose! scissor cut the paper.");
            }
        }
        else if (uc.equals(s)){
            if (cc.equals(r)){
                System.out.println("You lose! rock broke the scissor.");
            }
            else{
                System.out.println("You Won! scissor cut the paper.");
            }
        }
        else{
            System.out.println("invalid choice!");
        }
        
        sc.close();
    }
}
