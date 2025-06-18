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