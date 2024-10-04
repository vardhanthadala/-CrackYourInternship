class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left=0;
        int right=arr.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]-(mid+1)<k){  //element - index+1 = missing number
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left+k;
    }
}