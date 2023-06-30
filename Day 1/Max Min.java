//maximum and minimum element of an array
//link:"https://practice.geeksforgeeks.org/problems/max-min/1?"
//Time Complexity --O(n)
//Space Complexity --O(1)

class Solution
{ 
    public static int findSum(int arr[],int N) 
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min+max;
    }
}
