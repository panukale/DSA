class Main {
    public static void main(String[] args) {
        int[] arr={1, 0, 0, 1, 1, 1, 1, 1, 7};
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
}
