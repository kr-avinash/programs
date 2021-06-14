class ArrayPrograms {

    /**
    * Input: nums = [1,1,0,1,1,1]
    * Output: 3
    * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
    */
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==0) {
                max = (counter >= max) ? counter : max;
                counter = 0;
                continue;
            }
            counter++;
        }
        return (counter > max) ? counter : max;
    }
    
    
    
}
