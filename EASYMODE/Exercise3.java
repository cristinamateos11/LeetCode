public class Exercise3 {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * 
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * 
     * @param args
     */
    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = exercise3.twoSum(nums, target);
        System.out.println("Indices de los números que suman el objetivo: [" + result[0] + ", " + result[1] + "]");
    }
    
        /**
         * 
         * 
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];

            for (int i=0; i<nums.length; i++) {
                // System.out.println("En la posicion: " + i + " se encuentra el numero: " + nums[i]);
                for (int j=i+1; j<nums.length; j++) {
                    // System.out.println("En la posicion: " + j + " se encuentra el numero: " + nums[j]);
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                        return result;
                    }
                }
            }
            return new int[0];
        }
}
    

