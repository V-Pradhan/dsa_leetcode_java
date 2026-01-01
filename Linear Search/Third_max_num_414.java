public class Third_max_num_414 {

    public static int thirdmax(int arr[]){
        long v1 = Long.MIN_VALUE;
        long v2 = Long.MIN_VALUE;
        long v3 = Long.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == v1 || arr[i] == v2 || arr[i]== v3){
                continue;
            }
            if(arr[i]>v1){
                v3 = v2;
                v2 = v1;
                v1 = arr[i];
            }
            else if(arr[i]>v2){
                v3 = v2;
                v2 = arr[i];
            }
            else if(arr[i]>v3){
                v3 = arr[i];
            }
        }
        if(v3 == Long.MIN_VALUE) return (int)v1;
        else return (int)v3;
    }
    public static void main(String args[]){
        int arr[] = {2,2,3,1};
        System.out.println("The Third largest number in the given array is " + thirdmax(arr));


}

}
