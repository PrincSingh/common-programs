import java.util.*;
class Main{
public static void main(String[] args) {
    char[] balloons = {'r','g','b','b','g'};
    int f=1;
    HashMap<Character, Integer> bal_count = new HashMap<>();
    for(char i: balloons){
        if(bal_count.containsKey(i)){
            bal_count.put(i, bal_count.get(i)+1);
        }
        else{
            bal_count.put(i, 1);
        }
    }

    for(char i: bal_count.keySet()){
        if(bal_count.get(i)%2!=0){
            System.out.println(i);
            f = 0;
        }
    }
    if(f==1){
        System.out.println("All are even");
    }
}
}