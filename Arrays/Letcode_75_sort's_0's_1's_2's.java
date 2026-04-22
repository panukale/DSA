public static void sortArray(int[] arr){
        //1, 0, 2, 1, 0
        //i j k
        //till j<=k
        //if j==0 replace with i and ++
        //if j==1 just do j++ now remaining is 2
        //do swap with j and --
        int i=0,j=0;
        int k=arr.length-1;
        while(j<=k){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
                i++;
            }else if(arr[j]==1){
                j++;
            }else{
                //arr[j]==2
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                k--;
            }
        }
    }
 public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={1, 0, 2, 1, 0};
        sortArray(arr);
        System.out.println("Array :"+Arrays.toString(arr));
    }
}
