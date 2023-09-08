import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,3,2,1};
        //int[] nums = {1,1};
        disapArray(nums);
        linDisapArray(nums);
    }
    public static void disapArray(int[] nums){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int p = 1, i;
        int n = nums.length;
        for (i = 1; i<=n; i++){
            for (int j : nums){
                if (i==j){
                    p = 0;
                    break;
                }
            }
            if (p==1){
                ans.add(i);
            }
            else{
                p = 1;
            }
        }
        System.out.println(ans);
    }
    public static void linDisapArray(int[] nums){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int l =nums.length;
        int[] ar = new int[l+1];
        for (int i = 0; i<l; i++){
            ar[nums[i]] = 10;
        }
        for (int i=1; i<ar.length; i++){
            if (ar[i] != 10){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
