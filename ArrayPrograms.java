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
    
    	
	/**
	 * Given an array nums of integers, return how many of them contain an even number of digits
	 * Example:
	 * 		Input: nums = [12,345,2,6,7896]
	 * 		Output: 2
	 */
	public int findEvenSizedNumCount(int[] nums) {
		int counter = 0;
        for(int a : nums) {
            // counter += isEvenSizeed(a) ? 1 : 0;
            short c = 0;
            while(a > 0) {
                c++;
                a = a / 10;
            }
            counter += (c % 2 == 0) ? 1 : 0;
        }
        return counter;
	}
	
	
    
    
    
    
}
