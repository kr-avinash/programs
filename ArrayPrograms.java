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
	
	
	/**
	 * Given an integer array nums sorted in non-decreasing order, 
	 * return an array of the squares of each number sorted in non-decreasing order.
	 * Example:
	 * 		Input: nums = 	[-4,-1,0,3,10]
			Output: 		[0,1,9,16,100]
			
			Explanation: After squaring, the array becomes [16,1,0,9,100].
			After sorting, it becomes [0,1,9,16,100].
	 */
	
    public int[] sortedSquares(int[] nums) {
        int[] resultArr = new int[nums.length];
        int left =0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        
        while(left <= right){
            if(Math.abs(nums[left]) < Math.abs(nums[right]) ){
                resultArr[index--] = nums[right]*nums[right];
                right--;
            }else{
                resultArr[index--] = nums[left]*nums[left];
                left++;
            }
        }
        return resultArr;
    }
    
    
    
    
}
