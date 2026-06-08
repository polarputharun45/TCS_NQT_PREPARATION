package Day4;
import java.util.*;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr= new int[5];
        HashMap<Integer,Integer> map= new HashMap<>();
        System.out.println("enter numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Integer key: map.keySet()){
            System.out.print(key);

        }
        sc.close();

    }
    
}
