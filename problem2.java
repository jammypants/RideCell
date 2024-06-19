package RideCell;

public class problem2 {
    int[] arr = {3,2,5,1,7};
    int moves=0;
    int prev = 3;
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>=prev)
        {
            prev = arr[i];
            continue;
        }
        else
        {
            moves += arr[i]-prev;
            arr[i] = prev;
        }
    }
}
