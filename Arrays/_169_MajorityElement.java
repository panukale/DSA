import java.util.*;

class Main {
    public static void maxFeqBrute(int[] arr){
        
        int condition=arr.length/2;
    
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;    
                }
            }
            if(count>=condition){
                System.out.println("Max :"+arr[i]);
                break;
            }
        }
    }
    
    public static int maxFeqOpt(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
            if(map.get(val)>=arr.length/2){
                System.out.println("max "+val);
                return val;
            }
        
         }
         return 0;
    }
    public static void main(String[] args) {
        int[] arr={7, 0, 0, 7, 7, 7, 7, 1, 7};
        maxFeqBrute(arr);
        maxFeqOpt(arr);
    }
}
