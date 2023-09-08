public class Armstrong {
    public static void main(String[] args) {
        int n = 153,temp,k,sum = 0,d=0;
        temp = n;
        while(temp > 0){
            d+=1;
            temp = temp/10;
        }
        //System.out.println("d="+d);
        temp = n;
        while(temp > 0){
            k = temp%10;
            sum = sum + (int)Math.pow(k,d);
            //System.out.println("sum ="+sum);
            temp/=10;
        }
        if (sum == n){
            System.out.println("yes");
    
        }
        else{
            System.out.println("no");
        }
    }
}
