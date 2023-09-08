import java.util.ArrayList;

public class SepDigit {
    public static void main(String[] args){
        int[] nums = {12,34,56,1350,98765};
        sedt(nums);
    }
    public static void sedt(int[] nums){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i : nums){
            int n = i;
            while (n>0){
                int d = n%10;
                a.add(d);
                n = n/10;
            } 
            for (int j = a.size()-1;j>=0;j--){
                arr.add(a.get(j));
            }
            a.clear();
        }
        System.out.println(arr);
    }
    //public static void sepdt(int[] nums){
        //int[] ans;
    //}
}
