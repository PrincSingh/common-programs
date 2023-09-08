import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,a=0,b=1,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter kr: ");
        n = sc.nextInt();
        if (n > 0){
            System.out.println(a);
            System.out.println(b);
            for (int i = 0; i<n-2;i++){
                c = a+b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
        sc.close();
    }
}
