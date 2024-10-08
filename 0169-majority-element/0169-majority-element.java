class Solution {
    //Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int majority=0;
        int count =0;

        for(int num: nums){
            if(count==0){
                majority=num;
            }
            if(num==majority){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }
}