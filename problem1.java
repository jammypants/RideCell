package RideCell;
public class problem1 {
    
    static int target_sum(int[] arr,int sum)// n is target
    {
        if(sum<0)
        return 0;
        if(sum==1)
        return 1;
        if(sum==2)
        return 2;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            count = 1+target_sum(arr, sum-arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n=0;
        target_sum(arr[],n);
    }
}
