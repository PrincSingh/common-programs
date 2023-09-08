import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
        System.out.println(sub(a,b));
        swap(a, b);
        sc.close();
    }
    public static void add(int n1, int n2){
        System.out.println(n1+n2);
    }
    public static int sub(int n1, int n2){
        return n1-n2;
    }
    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("n1="+n1+" n2="+n2);
    }
}
