import java.util.Scanner;

public class ProfLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CP:");
        int cp = sc.nextInt();
        System.out.println("Enter the SP:");
        int sp = sc.nextInt();
        if( sp > cp ) {
            System.out.println("profit is : Rs "+(sp-cp));
        }
        else if (cp > sp) {
            System.out.println("Loss is : Rs "+(cp-sp));
        }
        else{
            System.out.println("No profit No loss");
        }
        sc.close();
    }
    
}
