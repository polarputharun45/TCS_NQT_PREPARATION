package Day7;
import java.util.*;
public class DuplicateElementsInArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("enter number");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for(Integer key :map.keySet() ){
            if(map.get(key)>1){
                System.out.print(key);
            }
        }
        System.out.println();
       

    }
}
