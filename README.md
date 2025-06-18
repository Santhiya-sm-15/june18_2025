# june18_2025
The problem that I solved today

You are given an integer array nums of size n where n is a multiple of 3 and a positive integer k.

Divide the array nums into n / 3 arrays of size 3 satisfying the following condition:

The difference between any two elements in one array is less than or equal to k.
Return a 2D array containing the arrays. If it is impossible to satisfy the conditions, return an empty array. And if there are multiple answers, return any of them.

Code:
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int[][] arr=new int[n/3][3];
        int ind=0;
        for(int i=0;i<n/3;i++)
        {
            arr[i][0]=nums[ind++];
            arr[i][1]=nums[ind++];
            arr[i][2]=nums[ind++];
            if(Math.abs(arr[i][2]-arr[i][0])>k)
                return new int[0][];
        }
        return arr;
    }
}
